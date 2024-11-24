public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng động vật
        Animal cat = new Cat("Mèo");
        Animal dog = new Dog("Chó");
        BigDog bigDog = new BigDog("Chó lớn");

        // Gọi phương thức greets()
        cat.greets(); // In ra: Meow
        dog.greets(); // In ra: Woof
        bigDog.greets(); // In ra: Wooow
        bigDog.greets((Dog) dog); // In ra: Woooof
        bigDog.greets(bigDog); // In ra: Woooooow

        // Sử dụng đa hình
        Animal[] animals = {cat, dog, bigDog};
        for (Animal animal : animals) {
            animal.greets();
        }
    }
}