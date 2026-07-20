import java.util.*;
public class LabManagementSystem {
    HashMap<Integer,Student>students;
    HashMap<Integer,Lab>labs;
    List<BookingRequest>requests;
    List<Allocation>allocations;
    int requestId,allocationId;

    LabManagementSystem(){
        students=new HashMap<>();
        labs=new HashMap<>();
        requests=new ArrayList<>();
        allocations=new ArrayList<>();
        requestId=1;
        allocationId=1;
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
    void sendRequest(int studentId,int requestedDays,int labId,String projectName){
        Student student=searchStudent(studentId);
        if(student ==null){
            System.out.println("Not Registered Student");
            return;
        }
        Lab lab=searchLab(labId);
        if(lab==null){
            System.out.println("Lab not found");
            return;
        }
        BookingRequest request=new BookingRequest(requestId++,student,lab,projectName,requestedDays);
        requests.add(request);
        System.out.println("Request Sent Successfully");
    }
    void showRequests(){
        for(BookingRequest request:requests){
            System.out.println("Request Id : "+request.requestId+" \nStudent Name : "+request.student.studentName+" \nRequested Days : "+request.requestedDays+" \nRequested Purpose : "+request.projectName+" \nDays To Allocate : "+request.requestedDays);
            System.out.println(request);
            System.out.println();
        }
    }
    Lab searchLab(int labId){
        if(labs.containsKey(labId)){
            return labs.get(labId);
        }
        return null;
    }
    void allocateLab(int requestId, int allocatedDays, String allocatedDate){
        BookingRequest request=null;
        for(BookingRequest r:requests){
            if(r.requestId==requestId){
                request=r;
                break;
            }
        }
        if(request==null){
            System.out.println("Request Not Found");
            return;
        }
        Lab lab=request.lab;
        if(request.remainingDays==0){
            System.out.println("Already Allocated");
            return;
        }
        if(allocatedDays>request.remainingDays){
            System.out.println("only "+request.remainingDays+" days left");
            return;
        }
        Allocation allocation=new Allocation(allocationId++,lab,allocatedDays,request,allocatedDate);
        allocations.add(allocation);
        request.remainingDays-=allocatedDays;
        if(request.remainingDays==0){
            request.status="Completed";
        }
        System.out.println("Lab Allocated Successfully");
            System.out.println("Allocation ID : " + allocation.allocationId);
            System.out.println("Student       : " + request.student.studentName);
            System.out.println("Project       : " + request.projectName);
            System.out.println("Lab           : " + lab.labName);
            System.out.println("Allocated Days: " + allocatedDays);
            System.out.println("Remaining Days: " + request.remainingDays);
            System.out.println("Status        : " + request.status);
            System.out.println("Date          : " + allocatedDate);
            System.out.println("Charge        : ₹" + allocation.getCharge());
            System.out.println("---------------------------------------");
    }
}
    
