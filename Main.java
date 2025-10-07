public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty", 3);
        Animal parrot = new Parrot("Pally", 2);

        cat.eat();
        cat.makeSound();

        parrot.eat();
        parrot.makeSound();

        ((Mammal) cat).giveBirth();
        ((Bird) parrot).layEggs();

        Pet petCat = (Cat) cat;
        petCat.play();

        Flyable flyParrot = (Parrot) parrot;
        flyParrot.fly();

        ((Cat) cat).playFetch();
        ((Parrot) parrot).talk();
    }
}
