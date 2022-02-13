package lesson_4.payment;

import lombok.Getter;

import java.util.Scanner;

@Getter
public class Payment {
    private String name;
    private Product[] productArray;
    private int cost;

    public static class Product {
        private String productName;
        private int productCost;

        public Product(String productName, int productCost) {
            this.productName = productName;
            this.productCost = productCost;
        }
    }

    public Payment(String name) {
        super();
        this.name = name;
    }

    public void setPayment() {
        this.cost = 0;
        System.out.print("Введите количество товаров, которое Вы хотите приобрести: ");
        Scanner scanner = new Scanner(System.in);
        int product = scanner.nextInt();
        productArray = new Product[product];
        for (int i = 0; i < product; i++) {
            System.out.println("Товар " + (i + 1) + ": ");
            String prod_name = scanner.next();
            System.out.print("Цена: ");
            int prod_cost = scanner.nextInt();
            productArray[i] = new Product(prod_name, prod_cost);
            this.cost = this.cost + productArray[i].productCost;
            System.out.println(this.cost);
        }
    }
}