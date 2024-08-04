import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(new Car(), new Bicycle(), new Truck());
        VehicleManager manager = new VehicleManager();
        manager.startAllVehicles(vehicles);
        manager.stopAllVehicles(vehicles);
    }
}

