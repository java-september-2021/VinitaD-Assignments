package com.vinita.overflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="questions")
public class Question {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank
    @Size(min = 3, max = 200)
    private String title;
	
	@Transient
	private String tagFromForm;
	
	public String getTagFromForm() {
		return tagFromForm;
	}

	public void setTagFromForm(String tagFromForm) {
		this.tagFromForm = tagFromForm;
	}

	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
	
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "user_question", 
        joinColumns = @JoinColumn(name = "question_id"), 
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> allUser;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "tags_questions", 
        joinColumns = @JoinColumn(name = "question_id"), 
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> allTag;
    
    @OneToMany(mappedBy="question", fetch = FetchType.LAZY)
    private List<Answer> answers;
	
    
    public Question() {
	}
    
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public List<User> getAllUser() {
		return allUser;
	}
	public void setAllUser(List<User> allUser) {
		this.allUser = allUser;
	}
	public List<Tag> getAllTag() {
		return allTag;
	}
	
//	public void setAllTag(String allTag) {
//		String[] newArray = allTag.split(",");
//		List<Tag> myTag = new ArrayList<>();  //initializing an array
//		for (String str : newArray) {
//			Tag tag = new Tag(); //making a tag object
//			tag.setSubject(str.trim());
////			this.allTag.add(tag);
//			myTag.add(tag);
//			
//		}
//		this.allTag = myTag;
//	}
	public void setAllTag(List<Tag> allTag) {
		this.allTag = allTag;
	}
	
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
    
    
}
