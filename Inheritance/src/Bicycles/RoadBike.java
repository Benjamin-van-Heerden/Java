package Bicycles;

public class RoadBike extends Bicycle {
    int maxSpeed;

    public RoadBike(int startSpeed, int startGear, int maxSpeed) {
        super(startSpeed, startGear);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void setSpeed(int speed) {
        if (speed < maxSpeed) {
            super.setSpeed(speed);
        }
        else {
            this.speed = maxSpeed;
        }
    }
}
