public class Cat extends Animal {


    public void makeSound() {
        System.out.println("Cat says Meow");
    }
    public boolean eat(String foodType) {
        return true;
    }
    @Override
    public void showMood(boolean glad) {
        if (glad = true) {
            System.out.println("Spinder");
        } else {
            System.out.println("Hvæser");
        }
    }
}