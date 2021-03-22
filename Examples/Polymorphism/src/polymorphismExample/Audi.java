package polymorphismExample;

public class Audi extends Car{

    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Audi -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Audi -> accelerate";
    }

    @Override
    public String brake() {
        return "Audi -> brake";
    }
}
