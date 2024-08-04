import java.util.List;
import java.util.ArrayList;

public class VehicleManager {
    public void startAllVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }

    public void stopAllVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.stopEngine();
        }
    }
}


