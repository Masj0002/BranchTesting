public class Main {
    public static void main(String[] args) {
        Dog dawg = new Dog();
        dawg.makeSound();
        Cat cawt = new Cat();
        cawt.makeSound();

        dawg.eat("Meat");
        cawt.eat("fish");
        cawt.showMood(false);
        dawg.showMood(true);
    }
}
