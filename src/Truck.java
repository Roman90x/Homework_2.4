public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("Truck " + getModel() + " начал движение!");
    }

    @Override
    public void stopMoving() {
        System.out.println("Truck " + getModel() + " закончил движение!");
    }

    @Override
    public void pitSpot() {
        System.out.println("Truck " + getModel() + " заехал на питстоп");

    }

    @Override
    public void bestTimeOfRound() {
        System.out.println("Лучшее время круга у Truck " + getModel());

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скоррость у Truck " + getModel());

    }
}