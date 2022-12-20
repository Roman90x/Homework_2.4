public class Car extends Transport implements Competing{
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Car " + getModel() + " начал движение!");
    }

    @Override
    public void stopMoving() {
        System.out.println("Car " + getModel() + " закончил движение!");
    }

    @Override
    public void pitSpot() {
        System.out.println("Car " + getModel() + " заехал на питстоп");
    }

    @Override
    public void bestTimeOfRound() {
        System.out.println("Лучшее время круга у Car " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скоррость у Car " + getModel());
    }


}