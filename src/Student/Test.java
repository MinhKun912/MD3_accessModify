package Student;

import java.util.Arrays;
import java.util.Scanner;

public class Test   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String setName=sc.nextLine();
        String setClass=sc.nextLine();
        Student student = new Student();
        student.setName(setName);
        student.setClass(setClass);
        System.out.println(student.toString());
    }
}
