package monthAndSeasonExample;

public class Driver {
    public static void main(String[] args) {
        monthAndSeason("january");
        monthAndSeason("April");
        monthAndSeason("aUGuSt");
        monthAndSeason("OCTOBER");

        withIfStatement("february");
        withIfStatement("may");
        withIfStatement("june");
        withIfStatement("september");
    }

    public static void monthAndSeason(String month) {
        switch (month.toLowerCase()) {
            case "December":
            case "january":
            case "february":
                System.out.println("Winter season");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring season");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer season");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Autumn season");
                break;
            default:
                System.out.println("Typed wrong month");
                break;
        }
    }

    public static void withIfStatement(String month) {
        if (month == "December" || month == "january" || month == "february") {
            System.out.println("Winter season");
        } else if (month == "march" || month == "april" || month == "may") {
            System.out.println("Spring season");
        } else if (month == "june" || month == "july" || month == "august") {
            System.out.println("Summer season");
        } else if (month == "september" || month == "october" || month == "november") {
            System.out.println("Autumn season");
        } else {
            System.out.println("Typed wrong month");
        }
    }
}



















