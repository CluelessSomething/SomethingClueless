public class Vehicle {
    String type;
    String powerType;
    int numWheels;
    int numDoors;
    String color;
    double fuelRemaining;
    double fuelEconomy;
    int numPassangers;
    int passengerCapacity;
    double milesTravel;

    public Vehicle(String type, String powerType, int numWheels, int numDoors, String color, double fuelEconomy,
            int numPassangers, int passengerCapacity) {
        this.type = type;
        this.powerType = powerType;
        this.numWheels = numWheels;
        this.numDoors = numDoors;
        this.color = color;
        this.fuelRemaining = 100.0;
        this.fuelEconomy = fuelEconomy;
        this.numPassangers = 0;
        this.passengerCapacity = passengerCapacity;
        this.milesTravel = 0;
    }

    public int embark(int partySize) {
        if (numPassangers + partySize > passengerCapacity) {
            System.out.println("Party size is too big");
        } else {
            numPassangers += partySize;
        }
        return numPassangers;
    }

    public double travel(double miles) {
        double fuelUsed = miles * fuelEconomy;
        if (fuelUsed > fuelEconomy) {
            System.out.println("There is not enought fuel?");
        }
        fuelRemaining -= fuelUsed;
        return fuelRemaining;
    }

    public static void main(String[] args) {
        Vehicle maserati = new Vehicle("Car", "gas", 4, 4, "red", 28, 4, 4);
        maserati.embark(4);

        Vehicle McLaren = new Vehicle("Car", "electric", 4, 4, "black", 30, 2, 2);
        McLaren.embark(2);

    }
}
