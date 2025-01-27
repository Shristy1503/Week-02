package encapsulationandpolymorphism.hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;
public class InPatient extends Patient implements  MedicalRecord{
    private double dailyRate;
    private int daysAdmitted;
    private List<String> medicalRecords;
    //constructor
    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.medicalRecords = new ArrayList<>();
    }
    // Calculate bill overriding
    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }
    // Add a medical record
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }
    // Return the list of medical records
    @Override
    public List<String> viewRecords() {
        return medicalRecords;
    }
}
