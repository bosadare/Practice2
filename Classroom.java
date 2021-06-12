import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {
    public static void main(String args[]){
        Chair chair1 = new Chair();
        chair1.setColor("blue");
        chair1.setHeight(10);
        chair1.setNoOfLeg(4);

        Chair chair2 = new Chair();
        chair2.setColor("red");
        chair2.setHeight(5);
        chair2.setNoOfLeg(4);

        Table table1 = new Table();
        table1.setColor("blue");
        table1.setHeight(10);
        table1.setWidth(4);

        Table table2 = new Table();
        table2.setColor("black");
        table2.setHeight(13);
        table2.setWidth(5);

        Student student1 = new Student();
        student1.setName("Blessing");
        student1.setSex("Female");
        student1.setAge(30);
        student1.setHeight(15);

        Student student2 = new Student();
        student2.setName("Gideon");
        student2.setSex("Male");
        student2.setAge(50);
        student2.setHeight(19);

        Teacher teacher1 = new Teacher();
        teacher1.setName("Ahmed");
        teacher1.setSubject("Mathematics");

        ArrayList<Student> myArray = new ArrayList<Student>();
        myArray.add(student1);
        myArray.add(student2);

        teacher1.setStudents(myArray);
        List<Student> sts = teacher1.getStudents();
       // System.out.println(sts);
        for (Student s : sts){
            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getHeight());
            System.out.println(s.getSex());
        }

        // System.out.println(teacher1.getStudents());

//        Teacher teacher2 = new Teacher();

//        Student [] array;
//        array = new Student[2];
//        array[0] = student1;
//        array[1] = student2;

       // List<Student> studentList;
       // ArrayList<Sudent> studentList = new ArrayList<String>(); // Create an ArrayList object
//
//
//        ArrayList<Student> myArray = new ArrayList<Student>();
//        myArray.add(student1);
//        myArray.add(student2);
//        myArray.add(new Student("Mackay", "Male", 26, 100));
//        myArray.add(new Student("Blessing", "Female", 25, 19));
//        myArray.add(new Student("Mojeed", "Male", 12, 140));

//        System.out.println(array.length);
//        System.out.println(myArray.size());



    }
}
