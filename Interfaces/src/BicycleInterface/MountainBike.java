package BicycleInterface;

public class MountainBike implements Bicycle{
    private int gear;
    private int speed;
    private int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        this.gear = gear;
        this.speed = speed;
        this.seatHeight = seatHeight;
    }

    @Override
    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
