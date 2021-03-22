package pointDistanceExample;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        Point point = new Point();

        return distance(point);
    }

    public double distance(int x, int y){
        Point point = new Point(x,y);

        return distance(point);
    }

    public double distance(Point point){
        return Math.sqrt((this.x - point.x) * (this.x - point.x) +  (this.y - point.y) *  (this.y - point.y));
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return this.y = y;
    }

}




































