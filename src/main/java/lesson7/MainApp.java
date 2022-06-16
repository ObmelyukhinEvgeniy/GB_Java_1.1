package lesson7;

public class MainApp {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Basik", 160),
                new Cat("Rokki", 130),
                new Cat("Miranda", 90),
                new Cat("Derk", 150),
                new Cat("Ping", 120)
        };

        Plate plate = new Plate(1000);

        for (Cat c : cats) {
                while (!c.isSatiety() && plate.getFood() >= c.getAppetite()) {
                    c.eat(plate);
                    plate.info();
                }
        }

        for (Cat c : cats) {
            if(c.isSatiety()) {
                System.out.printf("%s накушался...Мяу!\n", c.getName());

            } else {
                System.out.printf("%s голоден, ему нехватило %d граммов еды\n", c.getName(), c.getFullSatiety() - c.getIntervalSatiety());
            }
        }

        plate.addFood(500);

        for (Cat c : cats) {
            while (!c.isSatiety() && plate.getFood() >= c.getAppetite()) {
                c.eat(plate);
                plate.info();
            }
        }

        for (Cat c : cats) {
            if(c.isSatiety()) {
                System.out.printf("%s накушался...Мяу!\n", c.getName());

            } else {
                System.out.printf("%s голоден, ему нехватило %d граммов еды\n", c.getName(), c.getFullSatiety() - c.getIntervalSatiety());
            }
        }
    }
}
