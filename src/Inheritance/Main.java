package Inheritance;

class College {

    String college_name;
    int college_id;

    void showDetails() {
        System.out.println("College Name: " + college_name);
        System.out.println("College ID: " + college_id);
    }

    void showDetails(String location) {
        System.out.println("College Name: " + college_name);
        System.out.println("Location: " + location);
    }
}


class Student extends College {

    String stu_name;
    int stu_id;

    @Override
    void showDetails() {
        System.out.println("Student Name: " + stu_name);
        System.out.println("Student ID: " + stu_id);
        System.out.println("College Name: " + college_name);
        System.out.println("College ID: " + college_id);
    }
}


class Teacher extends College {

    String teacher_name;
    int teacher_id;

    @Override
    void showDetails() {
        System.out.println("Teacher Name: " + teacher_name);
        System.out.println("Teacher ID: " + teacher_id);
        System.out.println("College Name: " + college_name);
        System.out.println("College ID: " + college_id);
    }
}


public class Main {

    public static void main(String[] args) {

        // Student object
        Student s = new Student();

        s.college_name = "ABES Engineering College";
        s.college_id = 101;

        s.stu_name = "Faiez";
        s.stu_id = 1;


        // Calling overridden method
        s.showDetails();


        System.out.println();


        // Calling overloaded method
        s.showDetails("Ghaziabad");


        System.out.println("\n-------------------\n");


        Teacher t = new Teacher();

        t.college_name = "ABES Engineering College";
        t.college_id = 101;

        t.teacher_name = "Rahul";
        t.teacher_id = 10;


        t.showDetails();


        System.out.println();


        t.showDetails("Ghaziabad");
    }
}