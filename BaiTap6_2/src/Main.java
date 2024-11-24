public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5.6);
        System.out.println(c.toString());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

        Rectangle r = new Rectangle(7.2, 9.5);
        System.out.println(r.toString());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}