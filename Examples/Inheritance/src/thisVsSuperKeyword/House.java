package thisVsSuperKeyword;

public class House {

    private String color;

    public House(String color) {
        // this keyword is required, same parameter name as field
        this.color = color;
    }

    public String getColor() {
        // In here, this is optional but can use to make more stable
        return color;
    }

    public void setColor(String color) {
        // this keyword is required, same parameter name as field. but if you change parameter name you can't use this
        this.color = color;
    }
}
