package Bicycles;

public class BikeDemo {
    public static void main(String[] args) {
        RoadBike r = new RoadBike(10, 3, 20);
        System.out.println(r.gear);
        r.setGear(4);
        System.out.println(r.gear);
        System.out.println(r.speed);
        r.setSpeed(15);
        System.out.println(r.speed);
        r.setSpeed(25);
        System.out.println(r.speed);
    }
}
