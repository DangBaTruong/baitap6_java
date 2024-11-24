public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

                ResizableCircle resizableCircle = new ResizableCircle(3.0);
        System.out.println("Area: " + resizableCircle.getArea());
        resizableCircle.resize(50); // Increase size by 50%
        System.out.println("Area after resizing: " + resizableCircle.getArea());
    }
}