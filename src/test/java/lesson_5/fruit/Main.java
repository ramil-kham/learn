package lesson_5.fruit;

public class Main {
    public static void main(String[] args) {
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();

        for (int i = 0; i < 3; i++) {
            orangeBox1.add(new Orange());
        }

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println(orange1Weigth);
        System.out.println(orange2Weigth);
        System.out.println(appleWeigth);

        System.out.println(orangeBox1.compare(appleBox));
        System.out.println(orangeBox2.compare(appleBox));

        orangeBox1.move(orangeBox2);
    }
}