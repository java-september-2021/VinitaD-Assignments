class ProjectTest {
    public static void main(String[] args) {
        Project java = new Project();
        Project python = new Project("python");
        Project javascript = new Project("javascript","fundamentals");
        System.out.println(javascript.elevatorPitch());
        System.out.println(python.getName());
        python.setDescription("first language to learn");
        System.out.println(python.getDescription());
        java.setName("java");
        java.setDescription("Strict Language");
        System.out.println(java.getDescription());
        java.setCost(13);
        System.out.println(java.elevatorPitch());
        
    }
}