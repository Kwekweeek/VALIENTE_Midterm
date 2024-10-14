// Base class Person
class Person {
    // Fields for name and age
    protected String name;
    protected int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information (name and age)
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student extending Person
class Student extends Person {
    // Fields specific to Student
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000; // Final field, constant

    // Constructor to initialize student-specific fields along with inherited fields
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Calls the constructor of the Person class
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Method to calculate the total fee for the student
    public double calculateFees() {
        return units * feePerUnit;
    }

    // Overriding displayInfo() to print student-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls the displayInfo() method from the Person class
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fees: " + calculateFees());
    }
}

// Subclass Instructor extending Person
class Instructor extends Person {
    // Fields specific to Instructor
    private String employeeID;
    private String department;
    private double salary;

    // Constructor to initialize instructor-specific fields along with inherited fields
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Calls the constructor of the Person class
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Overriding displayInfo() to print instructor-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls the displayInfo() method from the Person class
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Main class to test the system
public class EnrolmentSystem {

    // Polymorphic method that accepts a Person object and calls the appropriate displayInfo()
    public static void printDetails(Person p) {
        p.displayInfo(); // Calls the displayInfo() of the actual object type (Student or Instructor)
    }

    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Gerald M. Valiente", 19, "231001734", "Computer Engineering", 21);
        Student student2 = new Student("Juan Dela Cruz", 22, "231001735", "Mechanical Engineering", 18);

        // Create two Instructor objects
        Instructor instructor1 = new Instructor("Ms. Tanya Carmela Jovillano", 24, "123456", "College of Engineering and Architecture", 25000);
        Instructor instructor2 = new Instructor("Ms. Angela Caning", 24, "123456", "College of Engineering and Architecture", 25000);

        // Print details of each object using polymorphism
        System.out.println("--<<{[Student 1 Information]}>>--");
        printDetails(student1); // Calls displayInfo() of Student

        System.out.println("\n--<<{[Student 2 Information]}>>--");
        printDetails(student2); // Calls displayInfo() of Student

        System.out.println("\n--<<{[Instructor 1 Information]}>>--");
        printDetails(instructor1); // Calls displayInfo() of Instructor

        System.out.println("\n--<<{[Instructor 2 Information]}>>--");
        printDetails(instructor2); // Calls displayInfo() of Instructor
    }
}
