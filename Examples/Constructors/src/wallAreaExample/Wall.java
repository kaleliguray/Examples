package wallAreaExample;

public class Wall {

    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getWidth() {
        if (width < 0)
            width = 0;

        return this.width;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public double getHeight() {
        if (height < 0)
            height = 0;

        return this.height = height;
    }

}

































