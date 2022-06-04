package lesson6;

 class Dog extends Animal {
        private final int MAX_RUN_LENGTH = 500;
        private final int MAX_SWIM_LENGTH = 10;

        @Override
        void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Собака пробежала: " + length + " метров.");
            else System.out.println("Собака не смогла :(");
        }

        @Override
        void swim(int length) {
            if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("Собака проплыла: " + length + " метров.");
            else System.out.println("Собака не смогла :(");
        }
    }


