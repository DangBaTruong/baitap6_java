public class Square extends Rectangle {

    public Square () {
        super();
    }
    public Square (double side){
        super(side, side);
    }
    public Square (String color, boolean filled, double side){
        super(color, filled, side, side);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double width) {
        super.setWidth(width);
    }
    public void setLength(double length) {
        super.setLength(length);
    }
    public String toString(){
        return "Square [" + super.toString() + "]";
    }
}