package numberToWords;

public class NumberToWords {
    public static void main(String[] args) {
        getDigitCount(1010);
        reverse(1234);
        numberToWords(-1);
    }

    public static void numberToWords (int number){

        if (number < 0){

            System.out.println("Invalid Value");

        } else if (number == 0){

            System.out.println("Zero");

        } else {

            int originalNumberLength = getDigitCount(number);

            int reverseNumber = reverse(number);

            int reverseNumberLength = getDigitCount(reverseNumber);

            while(reverseNumber>0){

                int rem = reverseNumber % 10;

                reverseNumber/=10;

                switch (rem){

                    case 0:

                        System.out.println("Zero");

                        break;

                    case 1:

                        System.out.println("One");

                        break;

                    case 2:

                        System.out.println("Two");

                        break;

                    case 3:

                        System.out.println("Three");

                        break;

                    case 4:

                        System.out.println("Four");

                        break;

                    case 5:

                        System.out.println("Five");

                        break;

                    case 6:

                        System.out.println("Six");

                        break;

                    case 7:

                        System.out.println("Seven");

                        break;

                    case 8:

                        System.out.println("Eight");

                        break;

                    case 9:

                        System.out.println("Nine");

                        break;

                }

            }

            if(originalNumberLength!=reverseNumberLength){

                int diff = originalNumberLength - reverseNumberLength;

                while(diff>0){

                    System.out.println("Zero");

                    diff--;

                }

            }

        }

    }



    public static int reverse(int number) {

        int reversedNumber = 0, rem = 0;

        int temp = number;

        temp = (temp<0)?-temp:temp;

        while(temp>0){

            rem = temp % 10;

            reversedNumber = reversedNumber * 10 + rem;

            temp/=10;

        }

        reversedNumber = number<0 ? -reversedNumber : reversedNumber;

        return  reversedNumber;

    }



    public static int getDigitCount(int number) {

        int length = 0;

        if(number < 0){

            length = -1;

        } else if (number == 0){

            length = 1;

        } else {

            while(number>0){

                number/=10;

                length++;

            }

        }

        return length;

    }
}