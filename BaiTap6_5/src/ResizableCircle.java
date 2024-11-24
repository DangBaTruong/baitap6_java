public class ResizableCircle extends Circle  implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }
    public String toString() {
        return "Resizable Circle" + super.toString();
    }
    public void resize(int percent) {
        radius = radius * percent / 100;
    }
}
