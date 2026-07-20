public class Allocation {
    int allocationId;
    Student student;
    Lab lab;
    int allocatedDays;
    BookingRequest request;
    String allocatedDate;
    Allocation(int allocationId,Student student,Lab lab, int allocatedDays,BookingRequest request,String allocatedDated){
        this.allocatedDate=allocatedDate;
        this.allocatedDays=allocatedDays;
        this.lab=lab;
        this.student=student;
        this.request=request;
        this.allocationId=allocationId;
    }
    int getCharage(){
        return allocatedDays*(int)lab.feePerDay;
    }
}
