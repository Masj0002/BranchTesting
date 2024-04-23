public class Dog extends Animal {


    public void makeSound() {
        System.out.println("Dog says Woof");
    }

    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean glad) {
        if (glad = true) {
            System.out.println("logre");
        } else {
            System.out.println("knurre");
        }
    }
}
