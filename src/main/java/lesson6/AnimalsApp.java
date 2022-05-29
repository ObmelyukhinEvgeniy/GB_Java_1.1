package lesson6;

public class AnimalsApp {

    public static void main(String[] args) {
        Animal animal = new Animal("Домашнее; ");
        Cat cat = new Cat("Базик; ", "Серый; ");
        Dog dog = new Dog("Франк; ", "Рыжий; ");

        animal.animalInfo();

        cat.catInfo();

        dog.dogInfo();

    }

}
