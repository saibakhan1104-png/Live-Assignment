public class IT24006 {//Create another class named MainVehicle containing the main() method.
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i+=2) {//Use command line arguments to create objects.
            String brand = args[i];
            String color = args[i+1];
            Vehicle v = new Vehicle(brand, color);
            v.start();
        }
    }
}

