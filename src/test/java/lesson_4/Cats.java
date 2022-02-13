package lesson_4;

public class Cats extends Animals {

    @Override
    public void run(String name, int distance) {
        if (distance < 200) {
            System.out.println(name + " пробежала " + distance + " метров");
        } else {
            System.out.println(name + " не может бежать больше 200 метров");
        }
    }

    @Override
    public void swim(String name, int distance) {
        System.out.println( name + " не умеет плавать");
    }
}
