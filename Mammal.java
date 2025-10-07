public class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " the mammal is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a mammal sound.");
    }

    public void giveBirth() {
        System.out.println(name + " gives birth to live young.");
    }
}
