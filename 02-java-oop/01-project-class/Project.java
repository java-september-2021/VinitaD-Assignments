public class Project {
    //attribute/property/member variables
    private String name;
    private String description;
    private double cost;
    //method
    public String elevatorPitch(){
        return (name + " ("+ cost + ") " + description);
    }
    //getter
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getCost() {
        return cost;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    //constructors and overloading
    public Project(){
    }
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
}