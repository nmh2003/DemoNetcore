package Demo.BaiThucHanh0905.Sets;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            System.out.print("Full Name: ");
            String fullName = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            Student student = new Student(fullName, age);
            studentSet.add(student);
        System.out.println("\nStudent Set:");
        for (Student student : studentSet) {
            student.displayInfo();
            System.out.println();
        }
    }
}






