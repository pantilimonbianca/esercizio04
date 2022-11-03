public class Tester {
    public static void main(String[] args) {

        Student student1=new Student("Bianca");
        Student student2=new Student("Piero");

        Teacher teacher1= new Teacher("Marinella");

        teacher1.assignGrade(student1,8);
        teacher1.assignGrade(student2,6);

        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}
