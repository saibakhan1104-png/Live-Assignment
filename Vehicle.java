public class Vehicle {//class name
    private String brand;//Declare two private variables
    private String color;

    public Vehicle(String bnm,String cl){//Create a public constructor that initializes these variables.
        this.brand=bnm;
        this.color=cl;
    }
    public void start(){//Create a public method start() that match the sample input and output respectively: 
        System.out.println("Vehicle Brand ="+brand);
        System.out.println("Vehicle Color ="+color);
        System.out.println("Vehicle is starting...");

    }

}
