public class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders,String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

   public String startEngine(){
        return "Car -> startEngine()";
   }

   public String accelerate(){
        return "Car -> accelerate()";
   }

   public String brake(){
        return  "Car -> brake()";
   }

    public String getName(){
        return this.name;
    }

    public int getCylinders(){
        return this.cylinders;
    }

}


































