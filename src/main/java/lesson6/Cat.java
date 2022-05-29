package lesson6;

public class Cat extends Animal {
    String color;

    public Cat (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void catInfo() {
        System.out.println("Кот: Имя - " + name + "Цвет - " + color);
    }


}
