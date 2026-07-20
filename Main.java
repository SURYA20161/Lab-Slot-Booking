public class Main {

    public static void main(String[] args) {

        LabManagementSystem system = new LabManagementSystem();

        // Students
        system.addStudent(new Student("Surya", 1, "IT"));
        system.addStudent(new Student("Subass", 2, "CS"));
        system.addStudent(new Student("Vinodhini", 3, "CIVIL"));

        // Labs
        system.addLab(new Lab(1, "CVR", 100));
        system.addLab(new Lab(2, "ABJ", 150));

        // Students send requests
        system.sendRequest(1, 6, 1, "College Project");   // Request ID = 1
        system.sendRequest(3, 3, 2, "Own Project");       // Request ID = 2

        // Show Requests
        system.showRequests();

        // ---------- Allocations ----------

        // Surya gets 3 days
        system.allocateLab(1, 3, "2024-06-10");

        // Vinodhini gets 2 days
        system.allocateLab(2, 2, "2024-06-11");

        // Surya gets another 2 days
        system.allocateLab(1, 2, "2024-06-12");

        // Vinodhini gets the remaining 1 day
        system.allocateLab(2, 1, "2024-06-13");

        // Surya gets the last 1 day
        system.allocateLab(1, 1, "2024-06-14");



        System.out.println("next");
        system.sendRequest(1, 6, 1, "College Project");   // Request ID = 1
        system.sendRequest(3, 3, 2, "Own Project"); 


        system.allocateLab(3,3,"2024-06-15");

        system.allocateLab(4,4,"2024-06-15");   

    }
}