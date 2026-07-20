public class BookingRequest {
    int requestId;
    Student student;
    Lab lab;
    String projectName;
    int requestedDays;
    int remainingDays;
    String status;
    BookingRequest(int requestId,Student student,Lab lab,String projectName,int requestedDays){
        this.requestId=requestId;
        this.student=student;
        this.lab=lab;
        this.projectName=projectName;
        this.requestedDays=requestedDays;
        this.remainingDays=requestedDays;
        this.status="Pending";
    }

}
