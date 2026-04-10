class Student{
    private int rollNo;
    private String name;
    static  String schoolName;
    static int TotalStudents;

    public Student(){
        TotalStudents+=1;
    }

    public static void info(){
        System.out.println("This is a class od students");
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }

}
public class Main {
    public void main(){
        Student s1  = new Student();
        Student s2  = new Student();
        Student s3  = new Student();
        System.out.println(Student.TotalStudents);
    }



}
