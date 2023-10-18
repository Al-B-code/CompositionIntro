import Air.Helicopter;
import Air.Radar;
import products.Product;
import vehicles.*;

public class Runner {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(10, 20, new Product(350, 5, "BMX"));

        System.out.println(bicycle.getWheelCount());
        System.out.println(bicycle.getPrice());
        System.out.println(bicycle.getTitle());

        Car car = new Car(
                200,
                120,
                new Product(10000, 3, "2015 Dacia Duster"),
                new Engine(100, 150));
        car.startEngine();
        Engine betterEngine = new Engine(300, 400);

        car.setEngine(betterEngine);
        System.out.println(car.getHp());
        System.out.println(car.getPrice());
        System.out.println(car.getInventory());
        System.out.println(car.getTitle());

        //create motor
        Motor motor = new Motor(100, 200);
        Speedboat speedboat = new Speedboat(300, 240,
        new Product(700, 5, "super boat"),
        motor);

        System.out.println(speedboat.getTitle());
        System.out.println(speedboat.getInventory());
        System.out.println(speedboat.getHp());


        //Helicopter
        Helicopter helicopter = new Helicopter(500,
        800,
        new Product(10000, 1, "Ultimate Helicopter 2000"),
        new Radar(300, 3));

        System.out.println(helicopter.getWeight());
        System.out.println(helicopter.getPrice());
        System.out.println(helicopter.getTitle());
        System.out.println(helicopter.getRadarSweep());
    }


}