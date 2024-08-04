public class Bicycle extends Vehicle {
        @Override
        public void startEngine() {
            System.out.println("Bicycle has no engine to start.");
        }

        @Override
        public void stopEngine() {
            System.out.println("Bicycle has no engine to stop.");
        }
    }

