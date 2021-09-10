import java.util.ArrayList;
class Portfolio {
    public ArrayList<Project> projects;
    // getter
    public String getProject() {
        return projects.toString();
    }
    //setter
    public void setProject(Project name) {
        projects.add(name);
    }
    public Portfolio() {
        this.projects = new ArrayList<Project>();
    }  
    public void showPortfolio() {
        for(Project project: projects) {
            System.out.println(project.elevatorPitch());

        }
        System.out.println(this.projects.toString());
        System.out.println(getPortfolioCost());
    }
    public double getPortfolioCost(){
        double cost = 0;
        for(Project project: projects) {
            cost += project.getCost();
        }
        return cost;
    }
}


    


