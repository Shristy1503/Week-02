package singleinheritance.smarthomedevices;

public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("ID202", "On", 35);
        thermostat.displayStatus();
        Thermostat thermostat1 = new Thermostat("ID203", "off", 27);
        thermostat1.displayStatus();
        Thermostat thermostat2 = new Thermostat("ID204", "On", 32);
        thermostat2.displayStatus();

    }
}
