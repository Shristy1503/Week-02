package encapsulationandpolymorphism.hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;
public class OutPatient extends Patient implements  MedicalRecord{
    private double consultationFee;
    private List<String> medicalRecords;
    //constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = new ArrayList<>();
    }
   // overriding consultation method
    @Override
    public double calculateBill() {
        return consultationFee;
    }
 //overriding add record
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
