import java.util.List;

public class Teacher {
    String name;
    String subject;
    List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //    public Student getStudent(String name, String sex, int age, int height){
//        Student student = new Student();
//        student.setName(name);
//        student.setSex(sex);
//        student.setAge(age);
//        student.setHeight(height);
//        return student;
//    }
}
