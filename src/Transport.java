 public abstract class Transport {
     private String brand;
     private String model;
     private double engineVolume;

     public Transport(String brand, String model, double engineVolume) {
         setBrand(brand);
         setModel(model);
         setEngineVolume(engineVolume);
     }

     public abstract void startMoving();

     public abstract void stopMoving();

     public String getBrand() {
         return brand;
     }

     public final void setBrand(String brand) {
         if (brand != null && !brand.isBlank() && !brand.isEmpty()) {
             this.brand = brand;
         } else {
             this.brand = "Марка";
         }
     }

     public String getModel() {
         return model;
     }

     public final void setModel(String model) {
         if (model != null && !model.isBlank() && !model.isEmpty()) {
             this.model = model;
         } else {
             this.model = "Марка";
         }
     }

     public double getEngineVolume() {
         return engineVolume;
     }

     public final void setEngineVolume(double engineVolume) {
         if (engineVolume >= 0) {
             this.engineVolume = engineVolume;
         } else {
             this.engineVolume = Math.abs(engineVolume);
         }
     }

     @Override
     public String toString() {
         return String.format("Автомобиль марки " + this.getBrand() +
                 " модель " + this.getModel() +
                 " с объемом двигателя " + this.getEngineVolume());
     }
 }