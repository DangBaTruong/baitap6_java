public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Woow");
    }
    public void greets(Dog another) {
        super.greets(another);
    }
    public void greets(BigDog another) {
        System.out.println("Wooooooooow");
    }
}
