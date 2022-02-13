package lesson_4.plate;

public class CatArray {
    public static void main(String[] args) {
        Cat[] catArrays = new Cat[5];
        catArrays[0] = new Cat("Murzik", 5, false);
        catArrays[1] = new Cat("Murka", 10, false);
        catArrays[2] = new Cat("Pushok", 7, false);
        catArrays[3] = new Cat("Vasya", 6, false);
        catArrays[4] = new Cat("Matroskin", 8, false);

        Plate plate = new Plate(20);

        plate.info();
        for (int i = 0; i <= catArrays.length-1; i++) {
            if (catArrays[i].getAppetite() < plate.getFood()) {
                catArrays[i].eat(plate);
                plate.info();
                System.out.println("Кошка " + catArrays[i].getName() + " покушала");
            } else if(catArrays[i].getAppetite() > plate.getFood()){
                plate.info();
                System.out.println("Кошке " + catArrays[i].getName() + "не хватило еды");
            }
        }
    }
}
