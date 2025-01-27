package encapsulationandpolymorphism.hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("IP001", "Arjun", 30, 200.0, 5);
        Patient outPatient = new OutPatient("OP001", "Shristy", 40, 150.0);

        // Adding medical records
        ((InPatient) inPatient).addRecord("Admitted for surgery.");
        ((OutPatient) outPatient).addRecord("Consulted for fever.");

        // Displaying patient details and billing information
        displayPatientInfo(inPatient);
        displayPatientInfo(outPatient);
    }

    // Method to display patient information
    public static void displayPatientInfo(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Bill Amount: $" + patient.calculateBill());

        // Displaying medical records
        if (patient instanceof MedicalRecord) {
            List<String> records = ((MedicalRecord) patient).viewRecords();
            System.out.println("Medical Records: " + records);
        }
        System.out.println();
    }
}
