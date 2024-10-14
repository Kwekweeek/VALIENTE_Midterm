# Midterm Examination
## Instructions:
You are tasked with developing a simple university enrolment system using object-oriented
programming concepts in Java. The system will have the following classes and
functionalities:
### Class Details:
  1. Person (Base Class)
   - Fields:
     - name (String),
     - age (int)
   - Constructor: Initializes name and age.
   - Method:
     - void displayInfo() : Prints out the name and age of the person.
2. Student (Subclass of Person)
  - Fields:
    - studentID (String)
    - course (String)
    - units (int)
    - feePerUnit (final int = 1000)
  - Constructor: Initializes name, age, studentID, course, and units.
  - Methods:
    - double calculateFees(): Calculates the total fee for the student based on the number of units and the feePerUnit.
    - Override void displayInfo(): Prints out the student's name, age, student ID, course, units, and total fee.

3. Instructor (Subclass of Person)
  - Fields:
    - employeeID (String)
    - department (String)
    - salary (double)
  - Constructor: Initializes name, age, employeeID, department, and salary.
  - Methods:
    - Override void displayInfo(): Prints out the instructor's name, age, employee ID, department, and salary.

## Requirements:
1. Implement the Person, Student, and Instructor classes with their respective fields,
constructors, and methods.

2. Demonstrate inheritance by showing how Student and Instructor inherit from
Person.
3. Demonstrate polymorphism by creating a method void printDetails(Person p)
that accepts a Person object as a parameter and calls the appropriate displayInfo()
method based on the type of object passed (either Student or Instructor).
4. Create a test program that:
 - Creates two Student objects and two Instructor objects.
 - Uses the printDetails() method to print information for each person (student or instructor).
 - Add comments to explain your code.

