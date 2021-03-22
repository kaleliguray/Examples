package barkingDog;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23)){
                barking = true;
            }else {
                barking = false;
            }
        }
        System.out.println(barking);
        return barking;
    }

}





























