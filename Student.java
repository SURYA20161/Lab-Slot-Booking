public class Student{
    String studentName;
    int studentId;
    String studentDept;
    Student(String studentName,int studentId,String studentDept){
        this.studentName=studentName;
        this.studentId=studentId;
        this.studentDept=studentDept;
    }
    public String toString(){
        return "Student Name: "+studentName+" Student Id: "+studentId+" Student Department: "+studentDept;
    }
}