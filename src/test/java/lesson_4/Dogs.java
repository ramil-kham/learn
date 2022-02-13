package lesson_4;

import lombok.AllArgsConstructor;

public class Dogs extends Animals {

    @Override
    public void run(String name, int distance) {
        if (distance < 500) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не может бежать больше 500 метров");
        }
    }

    @Override
    public void swim(String name, int distance) {
        if (distance < 10) {
            System.out.println(name + " проплыла " + distance + " метров");
        } else {
            System.out.println(name + " не может плыть больше 10 метров");
        }
    }
}
