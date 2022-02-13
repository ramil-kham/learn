package lesson_4.plate;

import lombok.Getter;

@Getter
public class Cat {
    private String name;
    private int appetite;
    public static boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}

