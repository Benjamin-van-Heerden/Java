package MultipleInheritance;

public class Lion extends FourLegged implements Carnivore, Animal {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.eat();
        l.sayHi();
        System.out.println("I have " + legs + " legs");
    }

    @Override
    public void eat() {
        System.out.println("I eat " + food);
    }
}
