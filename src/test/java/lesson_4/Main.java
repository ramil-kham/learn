package lesson_4;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats();
        Dogs dog = new Dogs();
        dog.run("Шарик", 600);
        cat.run("Мурка", 500);
    }
}
