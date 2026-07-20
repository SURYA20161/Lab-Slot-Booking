import java.util.*;
public class LabManagementSystem {
    HashMap<Integer,Student>students;
    HashMap<Integer,Lab>labs;
    List<BookingRequest>requests;
    int requestId=0;

    LabManagementSystem(){
        students=new HashMap<>();
        labs=new HashMap<>();
        requests=new ArrayList<>();
    }

    void addStudent(Student student){
        students.put(student.studentId,student);
    }
    void addLab(Lab lab){
        labs.put(lab.labId,lab);
    }
    Student searchStudent(int studentId){
        for(Student s:students.values()){
            if(s.studentId==studentId){
                return s;
            }
        }
        return null;
    }
    void sendRequest(int studentId,int requestedDays,String projectName){
        Student student=searchStudent(studentId);
        if(student ==null){
            System.out.println("Not Registered Student");
            return;
        }
        BookingRequest request=new BookingRequest(requestId++,student,projectName,requestedDays);
        requests.add(request);
        System.out.println("Request Sent Successfully");
    }
    void showRequests(){
        for(BookingRequest request:requests){
            System.out.println("Request Id : "+request.requestId+" \nStudent Name : "+request.student.studentName+" \nRequested Days : "+request.requestedDays+" \nRequested Purpose : "+request.projectName+" \nDays To Allocate : "+request.requestedDays);
            System.out.println("Submitted Successfully");
            System.out.println(request);
        }
    }
}
    
