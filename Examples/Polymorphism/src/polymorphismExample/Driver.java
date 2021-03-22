package polymorphismExample;

public class Driver {
    public static void main(String[] args) {

        Car car = new Car(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println();

        Audi audi = new Audi(6,"A8");
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        System.out.println();

        // It is called "inline class"
/*        Car ford = new Car(6, "Ford Mustang") {
            @Override
            public String startEngine() {
                return "Ford -> startEngine";
            }

            @Override
            public String accelerate() {
                return "Ford -> accelerate";
            }

            @Override
            public String brake() {
                return "Ford -> brake";
            }
        };*/


        Ford ford = new Ford(6,"Ford Mustang");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        System.out.println();

        Volvo volvo = new Volvo(6,"Volvo s90");
        System.out.println(volvo.startEngine());
        System.out.println(volvo.accelerate());
        System.out.println(volvo.brake());

    }


    public static class Volvo extends Car{

        public Volvo(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() +" -> startEngine";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() +" -> accelerate";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() +" -> accelerate";
        }
    }
}


























