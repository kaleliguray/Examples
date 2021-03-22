import java.util.ArrayList;
import java.util.List;

public class Theater {

    private final String theaterName;
    public List<Seat> seats = new ArrayList<Seat>();

    public Theater(String theaterName,int numRows,int seatPerRow){
        this.theaterName = theaterName;

        int lastRow = 'A' + (numRows-1);
        for(char row = 'A';row <= lastRow; row++){
            for (int seatNum = 1; seatNum <= seatPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheaterName(){
        return  theaterName;
    }

    public boolean reserveSeat(String seatNumber){
        int low = 0;
        int high = seats.size()-1;

        while (low <= high){
            System.out.println(".");
            int mid = (low + high)/2;
            Seat midVal = seats.get(mid);
            int cmd = midVal.getSeatNumber().compareTo(seatNumber);

            if(cmd < 0){
               low = mid + 1;
            }else if(cmd > 0){
                high = mid - 1;
            }else{
                return seats.get(mid).reserve();
            }
        }

        System.out.println("There is no seat "+ seatNumber);
        return false;
    }

    public void getSeat(){
        for(Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat>{

        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber){
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat){
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public String getSeatNumber(){
            return seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }else{
                return false;
            }
        }


        public boolean cancel(){
            if(!this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            }else {
                return false;
            }
        }

    }


}



































