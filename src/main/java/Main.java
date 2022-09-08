import model.Menu;
import repo.OrderSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Menu menu1 = new Menu(1, "Small Burger Menu", "Burger", "Fries", "Soft Drink", 4.50f);
        Menu menu2 = new Menu(2, "Medium Burger Menu", "Burger", "Fries", "Soft Drink", 5.50f);
        Menu menu3 = new Menu(3, "Big Burger Menu", "Burger", "Fries", "Soft Drink", 6.99f);
        Menu menu4 = new Menu(4, "Supersize Burger Menu", "2 Burger", "2 Fries", "2 Soft Drinks", 15.50f);
        Menu menu5 = new Menu(5, "Fitness Burger Menu", "Veggie Burger", "Salad", "Mineral Water", 5.99f);
        Menu menu6 = new Menu(6, "Kids Burger Menu", "Small Burger", "Small Fries", "Milk", 3.75f);

        OrderSystem burgerStore = new OrderSystem();

        burgerStore.addMenu(1, menu1);
        burgerStore.addMenu(2, menu2);
        burgerStore.addMenu(3, menu3);
        burgerStore.addMenu(4, menu4);
        burgerStore.addMenu(5, menu5);
        burgerStore.addMenu(6, menu6);

        System.out.println(burgerStore.getAllMenus());
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Menu number: ");

        String orderNumber = myObj.nextLine();  // Read user input
        System.out.println(burgerStore.placeOrder(5));
    }
}
