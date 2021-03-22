import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Player jack = new Player("Jack",30,25);
        System.out.println(jack.toString());
        saveObject(jack);

        jack.setHitPoints(20);
        System.out.println(jack);
        jack.setWeapon("StormCracker");
        saveObject(jack);

        System.out.println(jack);

        ISaveable wereWolf = new Monster("WereWolf",40,70);
        System.out.println("Strength : " + ((Monster) wereWolf).getStrength());
        saveObject(wereWolf);


    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit){
            System.out.print("Choose an option : ");
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string : ");
                    String inputString = scanner.nextLine();
                    values.add(index,inputString);
                    index++;
                    break;
            }
        }
        return values;
    }


    public static void saveObject(ISaveable objectToSave){
        for (int i=0; i<objectToSave.write().size();i++){
            System.out.println("Saving : "+objectToSave.write().get(i)+" to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }




}

























