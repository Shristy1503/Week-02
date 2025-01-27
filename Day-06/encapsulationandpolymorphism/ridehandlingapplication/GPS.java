package encapsulationandpolymorphism.ridehandlingapplication;

public interface GPS {
    //abstract method
    abstract String getCurrentLocation();
    abstract void updateLocation(String newLocation);
}
