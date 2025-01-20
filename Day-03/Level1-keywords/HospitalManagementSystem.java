  public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Shristy", 21, "Fever", "P123");
        Patient patient2 = new Patient("Muskan", 22, "Cough", "P124");

        // Display total number of patients
        Patient.getTotalPatients();

        // Display details of patient1
        System.out.println("\nPatient 1 Details:");
        patient1.displayPatientDetails(patient1);

        // Display details of patient2
        System.out.println("\nPatient 2 Details:");
        patient2.displayPatientDetails(patient2);

    }
}
  
  class Patient {
    private String name;
    private int age;
    private String ailment;
    private final String patientID; 
    private static int totalPatients = 0; 
    private static String hospitalName = "City Hospital"; 

    // Constructor to initialize the patient details
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; 
    }

    // Static method to get the total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details 
    public void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
            System.out.println("Patient ID: " + this.patientID);
        } else {
            System.out.println("Invalid patient object");
        }
    }
}


