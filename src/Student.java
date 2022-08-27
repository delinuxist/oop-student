public class Student {
    int studentId;
    String studentName;
    int sub1,sub2,sub3;

    public void getStudentData(int Id, String name){
        studentId = Id;
        studentName= name;
    }

    public void getStudentMarks(int score1,int score2,int score3){
        sub1 = score1;
        sub2 = score2;
        sub3 = score3;
    }

    void totalMarks(){
        System.out.println("Student Id: "+ studentId);
        System.out.println("Name: "+ studentName);
        System.out.println("Result: "+ (sub1+sub2+sub3));
    }
}
