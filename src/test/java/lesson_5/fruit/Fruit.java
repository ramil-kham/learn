package lesson_5.fruit;

import lombok.Getter;

@Getter
public class Fruit {
    private float weight;

    Fruit(float weight) {
        this.weight = weight;
    }
}
