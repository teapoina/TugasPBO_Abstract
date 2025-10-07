public class Parrot extends Bird implements Flyable {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Hello!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying across the room.");
    }

    public void talk() {
        System.out.println(name + " can mimic human speech.");
    }
}
