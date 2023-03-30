package be.intecbrussel;

public class CarApp {
    public static void main(String[] args) {


        Car audi = new Car("Purple");
        Car mercedes = new Car("Green", 70);
        Car bmw = new Car("Yellow", 160, 200, 200);

        bmw.setcurrentSpeed(1000);
        System.out.println(audi.getColor());

        System.out.println(mercedes.getMaxSpeed());

        System.out.println(audi);
        System.out.println(mercedes);
        System.out.println(bmw);


        System.out.println(bmw.getcurrentSpeed());

        System.out.println(bmw.repairCost);

        System.out.println(mercedes.repairCost);

        System.out.println(mercedes.getCounter());

        System.out.println(bmw.isOnn);


    }
}
