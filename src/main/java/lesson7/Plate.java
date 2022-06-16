package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if(food < n) { //Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
            System.out.println("Недостаточно еды!");
            return false;
        } else {
            food -= n;
            System.out.println("Кот ест...");
            return true ;
        }

    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("На тарелке: " + food + " грамм");
        if (food == 0) {
            System.out.println("Еда закончилась!");
        }
    }

    public void addFood(int n) {
        System.out.println("Добавляем еды...");
        food += n < 100 ? -n : n;
    }
}
