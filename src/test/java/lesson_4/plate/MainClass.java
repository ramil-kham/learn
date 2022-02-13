package lesson_4.plate;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 1000, false);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
    }
}