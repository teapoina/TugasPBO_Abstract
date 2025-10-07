public class Cat extends Mammal implements Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing fetch!");
    }

    public void playFetch() {
        System.out.println(name + " loves to chase the ball!");
    }
}
