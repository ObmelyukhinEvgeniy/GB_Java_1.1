package lesson6;

    class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Кот пробежал: " + length + " метров");
        else System.out.println("Кот не смог :(");
    }

    @Override
    void swim(int length) {
        System.out.println("Кот не плавает!");
    }
}


