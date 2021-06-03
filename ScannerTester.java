import java.util.Scanner;

public class ScannerTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = in.next();
        
        System.out.println("Enter your age:");
        int age = in.nextInt();
        
        System.out.println("Enter your gpa:");
        double gpa = in.nextDouble();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        
    }
}

