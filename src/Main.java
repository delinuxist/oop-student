public class Main {
    public static void main(String[] args) {
        System.out.println("Student OOP");

        //instantiating an object
        Student student = new Student();

        student.getStudentData(1,"Mark");

        student.getStudentMarks(20,30,40);

        student.totalMarks();


    }
}