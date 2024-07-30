class Student{
    private static Student student;

    private Student(){

    }

    static Student getStudent(){
        if(student == null){
            synchronized(Student.class){
                student = new Student();
            }
        }
        return student;
    }
}

public class Singelton {
    public static void main(String[] args) {
        Student s1  = Student.getStudent();
        System.out.println(s1.hashCode());
    }
}
