/*Write a java program to demonstrate the use of dynamic method dispatch.
 */

class Student {
    public void show(){
        System.out.println("Student details.");
    }
}
public class CollegeStudent extends Student {
    public void show(){
        System.out.println("College Student details.");
    }
    public static void main(String args[]){
        Student obj = new CollegeStudent();
        obj.show();
    }
}
