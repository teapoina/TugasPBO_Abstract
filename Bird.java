public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " the bird is pecking food.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps.");
    }

    public void layEggs() {
        System.out.println(name + " lays eggs.");
    }
}
