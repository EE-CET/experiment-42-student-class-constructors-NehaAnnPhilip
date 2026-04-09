import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    // TODO: Create a parameterized constructor Student(String name, int rollNo)
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    // Method to print details in the required format
    void display() {
        System.out.println("Name: " + name + " Roll: " + rollNo);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Read name1 and rollNo1
        String name1 = sc.nextLine();
        int rollNo1 = sc.nextInt();
        sc.nextLine(); // Consume newline left by nextInt()
        
        // TODO: Read name2 and rollNo2
        String name2 = sc.nextLine();
        int rollNo2 = sc.nextInt();
        
        // TODO: Create two Student objects
        Student s1 = new Student(name1, rollNo1);
        Student s2 = new Student(name2, rollNo2);
        
        // TODO: Print details for both students
        s1.display();
        s2.display();
        
        sc.close();
    }
}
