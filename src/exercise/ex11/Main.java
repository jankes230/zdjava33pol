package exercise.ex11;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Object[] animals = {dog,cat,cow};
        for (Object element : animals){
            Animal convertedElement = (Animal) element;
            System.out.println(convertedElement.makeSound());
        }

    }
}
