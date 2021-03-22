package playingCatExample;

public class PlayingCat {
    public static void main(String[] args) {
        isCatPlaying(false,35);
    }

    public static boolean isCatPlaying(boolean summer,int temperature) {
        boolean catPlaying = false;

        if (summer) {
            if (temperature>=25 && temperature<=45) {
                catPlaying = true;
                System.out.println(catPlaying);
                return catPlaying;
            }
        }else if (!summer){
            if (temperature>=25 && temperature<=35) {
                catPlaying = true;
                System.out.println(catPlaying);
                return catPlaying;
            }
        }
        return catPlaying;
    }

}
































