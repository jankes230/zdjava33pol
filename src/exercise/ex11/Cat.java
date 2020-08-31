package exercise.ex11;

public class Cat implements Animal{
    @Override
    public String makeSound() {
        return "miau";
    }

    public Cat() {
        makeSound();
    }
}
