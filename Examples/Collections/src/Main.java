import java.util.*;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("CineMax",8,12);
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theater.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }else {
            System.out.println("Seat already reserved");
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theater.seat");
        printList(theater.seats);

        Theater.Seat minSeat = Collections.min(seatCopy);
        Theater.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

        List<Theater.Seat> newList = new ArrayList<>(theater.seats.size());
//        Collections.copy(newList,theater.seats);

    }

    public static void sortList(List<? extends Theater.Seat> list) {
        for (int i=0;i<list.size()-1;i++){
            for (int j=i+1; j<list.size();j++){
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }

    public static void printList(List<Theater.Seat> list) {
        for (Theater.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("*******************************************************");
    }


}































