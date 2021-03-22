package switchStatement;

public class Main {

    public static void main(String[] args) {

//        int number = 1;

        // if stattement evaluate every conditions and values, codes run for every if statement and look condition is true or false

/*        if (number==1){
            System.out.println("Number is 1");
        } else if(number==2){
            System.out.println("Number is 2");
        } else {
            System.out.println("Number is not 1 or 2");
        }*/

        // Switch statement evaluate one condition that is value; where is the suitable condition code will execute that case(byte,short,int,char,String)
        // break means when our condition match a case; execute that case and go out switch statement; meanwhile code will execute after switch
        // default means if our condition does not match any case, code will execute default condition

 /*       int switchNumber = 3;

        switch (switchNumber){
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Number is 3, or 4, or 5");
                System.out.println("Actually it is " + switchNumber);
                break;
            default:
                System.out.println("Is not 1 or 2");
                break;
        }*/

        char alphabet = 'A';

        switch (alphabet) {
            case 'A':
                System.out.println("Typed A");
                break;
            case 'B':
                System.out.println("Typed B");
                break;
            case 'C':
                System.out.println("Typed C");
                break;
            case 'D':
                System.out.println("Typed D");
                break;
            case 'E':
                System.out.println("Typed E");
                break;
            default:
                System.out.println("A B C D E did not type");
                break;
        }

/*        String month = "January";

        switch (month.toLowerCase()){
            case "December": case "january": case "february":
                System.out.println("Winter season");
                break;
            case "march": case "april": case "may":
                System.out.println("Spring season");
                break;
            case "june": case "july": case "august":
                System.out.println("Summer season");
                break;
            case "september": case "october": case "november":
                System.out.println("Autumn season");
                break;
            default:
                System.out.println("Typed wrong month");
                break;
        }*/

    }

}




























