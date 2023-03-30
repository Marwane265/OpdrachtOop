package be.intecbrussel;


import java.util.Random;


public class Car {


    protected String color = "White";

    protected int maxSpeed = 120;

    protected int pk = 150;

    protected int currentSpeed;

    protected int repairCost;
    int min = 100;
    int max = 300;

    private String differentcolor;

    private static int counter = 0;


    static {
        counter++;
    }


    boolean isOnn;


    private String driver = "unknown";


    //constructor

    protected Car() {
        counter++;

    }


    public Car(String color) {
        this.color = color;

    }

    public Car(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;

    }

    public Car(String color, int maxSpeed, int pk, int currentSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.pk = pk;
        this.currentSpeed = currentSpeed;

    }


    //getters and setters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        counter++;


    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        counter++;
    }


    public int getPk() {
        return pk;

    }


    public void setPk(int pk) {
        this.pk = pk;
        counter++;
    }

    public int getcurrentSpeed() {
        return currentSpeed;

    }


    public static int getCounter() {
        return counter;
    }

    // De huidige snelheid mag nooit meer worden dan maximumsnelheid en nooit lager zijn dan 0.


    public void setcurrentSpeed(int currentSpeed) {


        if (currentSpeed > maxSpeed || currentSpeed < 0) {
            System.out.println("Not possible");


        } else {
            this.currentSpeed = currentSpeed;
        }
    }
    //eigen methode


    public int speedUp(int add) {
        return currentSpeed += add;


    }

    public int slowDown(int take) {
        return currentSpeed -= take;
    }


    public String repaint() {


        if (color != differentcolor){
            System.out.println(differentcolor);
        }else {
            this.color= color;
        }

        return null;
    }


    public int repair() {

        Random random = new Random();
        for (int repairCost = 100; repairCost <= 300; repairCost++) {
            int cost = min + random.nextInt(max);
            System.out.println(repairCost);
        }

        return 0;
    }


    public void toggleLights() {

        if (isOnn) {
            System.out.println("Turn it off");
            isOnn = false;
            System.out.println("The lights are on");
        } else {
            System.out.println("Turn it on");
            isOnn = true;
            System.out.println("The lights are off");
        }


    }


    public void assignDriver(String driverName) {

        if (driverName.isBlank() || driverName.length() < 5) {
            System.out.println("Niet toegestaan!");
        } else {

            this.driver = driverName;
        }


    }


    //Voeg nog een methode toe generateLicensePlate()
    // deze gebruikt het volgende algoritme om een nummerplaat te genereren:
    // De eerste 3 letters van de bestuurder/driver in hoofdletters gevolgd door een streepje (-) met een random getal tussen 100 en 999.
    // Voorbeeld:
    // Driver heeft de naam Quinten dan wordt de nummerplaat: QUI-385 De nummerplaat moet ook opgevraagd kunnen worden met een get methode.


    public void generateLicensePlate() {
        Random random = new Random();

    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", pk=" + pk +
                ", currentSpeed=" + currentSpeed +
                ", repairCost=" + repairCost +

                ", isOnn=" + isOnn +
                ", driver='" + driver + '\'' +
                '}';
    }
}
