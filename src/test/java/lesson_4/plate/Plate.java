package lesson_4.plate;

import lombok.Getter;

@Getter
public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food < n) {
            System.out.println("Не хватает еды в тарелке");
        } else {
            food -= n;
            Cat.satiety = true;
        }
    }

    public void increaseFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
        System.out.println(Cat.satiety);
    }
}


