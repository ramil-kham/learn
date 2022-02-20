package lesson_5.fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    public List<T> getList() {
        return list;
    }

    private List<T> list;

    public Box() {
        list = new ArrayList();
    }

    void add(T obj) {
        list.add(obj);
    }

    void move(Box box) {
        box.getList().addAll(list);
        list.clear();
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }
}
