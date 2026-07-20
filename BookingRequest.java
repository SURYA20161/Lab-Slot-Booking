public class BookingRequest {
    int requestId;
    Student student;
    String projectName;
    int requestedDays;
    int remainingDays;
    String status;
    BookingRequest(int requesId,Student student,String projectName,int requestedDays){
        this.requestId=requestId;
        this.student=student;
        this.projectName=projectName;
        this.requestedDays=requestedDays;
        this.remainingDays=requestedDays;
        this.status="Pending";
    }

}
