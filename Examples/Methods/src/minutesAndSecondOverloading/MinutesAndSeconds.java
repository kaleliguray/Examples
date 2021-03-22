package minutesAndSecondOverloading;

public class MinutesAndSeconds {
    public static void main(String[] args) {
        System.out.println(getTime(65,45));

        System.out.println(getTime(3945));

    }

    public static String getTime(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59 ) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        int remainedMinutes = minutes % 60;

        return hours + "h " + remainedMinutes + "m " + seconds + "s ";
    }

    public static String getTime(int seconds){
        if (seconds < 0){
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remainedSeconds = seconds % 60;

        return getTime(minutes,remainedSeconds);
    }

}




















