   public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Display university name
        Student.displayUniversityName();

        Student student1 = new Student("Shristy", "AL102", "A");
        Student student2 = new Student("Nancy", "AL103", "B");

        // Display total students enrolled
        Student.displayTotalStudents();

        // Display student details
        System.out.println("\nStudent 1 Details:");
        student1.displayStudentDetails(student1);

        System.out.println("\nStudent 2 Details:");
        student2.displayStudentDetails(student2);

        System.out.println("\nUpdating Grade for Student 1:");
        student1.updateGrade(student1, "A+");

    }
}
 

 class Student {
    private String name;
    private final String rollNumber; // Final variable
    private String grade;
    
    private static String universityName = "TIT University";
   
    private static int totalStudents = 0;
    
    // Constructor 
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; 
    }

    // Static method to display the university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Static method to display the total number of students enrolled
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }
 
    public void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {  
            System.out.println("Student Name: " + this.name);
            System.out.println("Roll Number: " + this.rollNumber);
            System.out.println("Grade: " + this.grade);
        } else {
            System.out.println("Invalid student object");
        }
    }

    // Method to update the grade of a student if it's a valid Student object
    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            this.grade = newGrade;
            System.out.println("Updated Grade: " + this.grade);
        } else {
            System.out.println("Cannot update grade for an invalid student object.");
        }
    }
}

