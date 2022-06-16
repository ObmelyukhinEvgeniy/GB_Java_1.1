package lesson7;

public class Cat {
    private String name; // Имя кота
    private int appetite; // Сколько ест за один подход
    private boolean satiety; // Показание сытости: сыт/несыт
    private int fullSatiety; // Сколько нужно сьесть, что бы стать сытым
    private int intervalSatiety; // Сколько кот уже съел

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
        this.fullSatiety = this.appetite * 2;
        this.intervalSatiety = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }
    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getFullSatiety() {
        return fullSatiety;
    }
    public void setFullSatiety(int fullSatiety) {
        this.fullSatiety = fullSatiety;
    }

    public int getIntervalSatiety() {
        return intervalSatiety;
    }
    public void setIntervalSatiety(int intervalSatiety) {
        this.intervalSatiety = intervalSatiety;
    }

    public void eat(Plate n) {
        if(satiety) {
            return;
        }
        if(n.decreaseFood(this.appetite)) {
            System.out.printf("%s съел %d грамм еды\n", this.name, this.appetite);
            this.intervalSatiety += this.appetite;
            if(this.intervalSatiety == this.fullSatiety) {
                this.satiety = true;
            }
        }
    }



}
