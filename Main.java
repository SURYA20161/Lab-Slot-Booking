public class Main{
    public static void main(String[]args){

        LabManagementSystem system=new LabManagementSystem();

        system.addStudent(new Student("Surya",01,"IT"));
        system.addStudent(new Student("Subass",02,"CS"));
        system.addStudent(new Student("Vinodhini",03,"CIVIL"));

        system.addLab(new Lab(01,"CVR",100.1));
        system.addLab(new Lab(02,"ABJ",150.0));

        //student send request to allocater
        system.sendRequest(01,6,"College Project");
        system.sendRequest(03,3,"Own Project");

        //allocator see who send request and details
        system.showRequests();

        //allocator can allocate the lab 
        system.allocateLab(03,02,3,"2024-06-10");
        system.allocateLab(01,01,4,"2024-06-11");   
    }
}