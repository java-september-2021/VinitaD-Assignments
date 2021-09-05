import java.util.ArrayList;
class Portfolio {
    public ArrayList<Project> projects;
    getter
    public Project getProject(Object name) {
        return projects.get(name).toString();
    }
    //setter
    public void setProject(Project name) {
        projects.add(name);
    }
    // class Portfolio() {
    // }  
}