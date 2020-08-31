package exercise.ex11;

public class Dog implements Animal {
    @Override
    public String makeSound() {
        return "wof wof";
    }

    public Dog() {
        makeSound();
    }
}
