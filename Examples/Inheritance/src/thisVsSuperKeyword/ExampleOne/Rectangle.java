package thisVsSuperKeyword.ExampleOne;

public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

    // 1st Constructor
    public Rectangle() {
        this(0,0); // calls 2nd Constructor
//        this.x = 0;
//        this.y = 0;
//        this.width = 0;
//        this.height = 0;

    }

    // 2nd Constructor
    public Rectangle(int width, int height) {
        this(0,0,width,height); // calls 3rd Constructor
//        this.x = 0;
//        this.y = 0;
//        this.width = width;
//        this.height = height;
    }

    // 3rd Constructor
    public Rectangle(int x, int y, int width, int height) {
        // Initialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}



























