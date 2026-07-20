public class Allocation {
    int allocationId;
    Student student;
    Lab lab;
    int allocatedDays;
    BookingRequest request;
    String allocatedDate;
    Allocation(int allocationId,Lab lab, int allocatedDays,BookingRequest request,String allocatedDate){
        this.allocatedDate=allocatedDate;
        this.allocatedDays=allocatedDays;
        this.lab=lab;
        this.request=request;
        this.student=request.student;
        this.allocationId=allocationId;
    }
    int getCharge(){
        return allocatedDays*(int)lab.feePerDay;
    }
}
