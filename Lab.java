public class Lab {
    int labId;
    String labName;
    double feePerDay;
    Lab(int labId,String labName,double feePerDay){
        this.labId=labId;
        this.labName=labName;
        this.feePerDay=feePerDay;
        
    }
    public String toString(){
        return "lab Id : "+labId;
    }
}
