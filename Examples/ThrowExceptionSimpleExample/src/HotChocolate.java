import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 85;
    public static final double tooCold = 70;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException{
        if (cocoaTemp >= tooHot){
            throw new TooHotException();
        }else if (cocoaTemp <= tooCold){
            throw new TooColdException();
        }
    }


    public static void main(String[] args) throws InterruptedException{

        double currentCocaoTemp = 90;

        boolean wrongTemp = true;

        while (wrongTemp){
            try(Scanner scanner = new Scanner(System.in)){
//                currentCocaoTemp = scanner.nextDouble();
//                drinkHotChocolate(currentCocaoTemp);
                drinkHotChocolate(currentCocaoTemp);
                System.out.println("That cocoa was good!");
                wrongTemp = false;
            } catch (TooHotException e1) {
                System.out.println("THAT'S TOO HOT!!!");
                currentCocaoTemp = currentCocaoTemp - 5;
            } catch (TooColdException e2) {
                System.out.println("THAT'S SO COLD! It is like a nordic");
                currentCocaoTemp = currentCocaoTemp + 5;
            }

            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("And it is gone.");
    }



}

























