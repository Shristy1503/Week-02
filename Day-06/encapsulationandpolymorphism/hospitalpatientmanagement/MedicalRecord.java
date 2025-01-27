package encapsulationandpolymorphism.hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;
public interface MedicalRecord {
    // abstract methods
    void addRecord(String record);
    List<String> viewRecords();
}
