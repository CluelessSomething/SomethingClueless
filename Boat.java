public class Boat extends Vehicle {
    public Boat(String powerType, int numDoors, String color, double fuelEconomy, int passengerCapacity) {
        super("Boat", powerType, 0, numDoors, color, fuelEconomy, passengerCapacity);
        
    }

    public void drift(double miles) {
        milesTravel += miles;
    }


    public static void main(String[] args) {
        Boat bloatedBoatyMcBoatFace = new Boat("Gas", 0 , "White", 20, 5);
        bloatedBoatyMcBoatFace.embark(2);
        bloatedBoatyMcBoatFace.drift(0.5);
        System.out.println(bloatedBoatyMcBoatFace.type);
    }

}
