package day1;

import java.util.Scanner;

public class Shop {
    String name;
    String address;
    int countOfProduct;
    double priceOfProduct;
    double shopBalance;

    Shop(String name, String address, int countOfProduct, double priceOfProduct, double shopBalance) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.shopBalance = shopBalance;
    }

    void checkOrder(int countOfProduct) {
        Scanner scanner = new Scanner(System.in);
        if (this.countOfProduct >= countOfProduct) {
            System.out.println("That count are available");
            System.out.println("If you want to buy it press 1 or any bottom to cancel : ");
            char ch = scanner.next().charAt(0);
            if (ch == '1')
                System.out.println(calculateOrder(countOfProduct));

        } else {
            System.out.println("Now we don’t have so much product, sorry ");
        }
    }

    double calculateOrder(int countOfProduct) {
        return this.priceOfProduct * countOfProduct;
    }

    void addToShopBalance(int countOfProduct) {
        this.shopBalance += this.priceOfProduct * countOfProduct;
    }
}
