public class Plane extends Vehicle {

    public Plane(String type, String powerType, int numWheels, int numDoors, String color, double fuelEconomy,
            int numPassangers, int passengerCapacity) {
        super("Plane", powerType, numWheels, numDoors, color, fuelEconomy, passengerCapacity);
        boolean islandinggeardown;
        islandinggeardown = true;
    }

    public void takeoff() {
        System.out.println("We have liftoff");
        islandinggeardown = false;
    }

    public void prepToLand() {
        islandinggeardown = true;
    }

    public boolean land() {
        if (isLandingGearDown) {
            System.out.println("We've landed!");
        } else {
            System.out.println("Put the lading gear down!");
            return false;
        }

        }

        public static void main(String[] args) {
            Plane cessna = new Plane("Pixie Dust", 6, 2, "Black and Pink Gold", 70, 4);
            cessa.takeoff();
            cessna.land();
            cessna.prepToLand();
            cessna.land();
    }


    
}
