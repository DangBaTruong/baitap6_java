public class Main {
    public static void main(String[] args) {
        Movable movablepoint = new MovablePoint(5,6,7,8);
        System.out.println(movablepoint.toString());

        Movable movablecircle = new MovableCircle(5,6,7,8,9);
        System.out.println(movablecircle.toString());
    }
}