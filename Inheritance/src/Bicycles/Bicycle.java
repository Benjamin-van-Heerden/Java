package Bicycles;

public class Bicycle {
    protected int speed;
    protected int gear;

    public Bicycle(int startSpeed, int startGear) {
        this.speed = startSpeed;
        this.gear = startGear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
