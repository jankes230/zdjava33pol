package exercise.ex11;

public class Cow implements Animal {
    @Override
    public String makeSound() {
        return "muu";
    }

    public Cow() {
        makeSound();
    }
}
