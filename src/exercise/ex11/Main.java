package exercise.ex11;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Object[] animals = {dog.makeSound(),cat.makeSound(),cow.makeSound()};
        for (Object element : animals){
            System.out.println(element);
        }

    }
}
