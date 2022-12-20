public abstract class Driver<T extends Transport> {
    private final String fullName;
    private String category;
    private int experience;
    private T car;

    public Driver(String fullName, String category, int experience) {
        this.fullName = fullName;
        this.category = category;
        this.experience = experience;
    }

    public void startMovement() {
        System.out.println("Водитель " + getFullName() + " начал движение");
        this.car.startMoving();
    }

    public void stopMovement() {
        System.out.println("Водитель " + getFullName() + " закончил движение");
        this.car.stopMoving();
    }

    public void refill() {
        System.out.println("Водитель " + getFullName() + " заправляет машину" + this.car.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель " + fullName +
        " управляет автомобилем " + car +
                " и будет учавствовать в заезде";
    }
}
