package Student;

public class student {
    student(int roll, String name){
        System.out.println("student constructor");
    }
    student(int roll, String name, String branch){
        System.out.println("student constructor");
    }
    student(String name){
        System.out.println("Name : "+name);
    }

    public String name;
    public int roll_number;
    protected void callstu(){
        System.out.println("Student called");
    }
    class college  {

    }
    class stu extends college{

    }

    public static void main(String args[]){

    }

}
