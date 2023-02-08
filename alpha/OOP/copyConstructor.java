package OOP;

public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Pranav");
        s2.roll = 23;
        Student s3 = new Student(s2);
        System.out.println(s3.roll + s3.name);
        }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("hi");
    }

    Student(String name){
        this.name = name;
    }
    Student(Student s2){
        this.name = s2.name;
        this.roll = s2.roll;
    }
}
