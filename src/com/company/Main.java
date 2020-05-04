package com.company;

import restaurant.Menu;
import restaurant.MenuItem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu currentMenu = new Menu();

        MenuItem friedFish = new MenuItem();
        friedFish.setName("Fried Fish");
        friedFish.setPrice(7.99);
        friedFish.setDescription("Super Crisp Fish!");
        friedFish.setCategory("Main Course");
        friedFish.setIsNew(true);

        MenuItem cake = new MenuItem();
        cake.setName("Cake");
        cake.setPrice(2.99);
        cake.setDescription("Fluffy Yellow Cake");
        cake.setCategory("Dessert");
        cake.setIsNew(false);

        MenuItem salsa = new MenuItem();
        salsa.setName("Salsa");
        salsa.setPrice(2.99);
        salsa.setDescription("Mild Salsa With Chips");
        salsa.setCategory("Appetizer");
        salsa.setIsNew(false);

        MenuItem iceCream = new MenuItem();
        iceCream.setName("Ice Cream");
        iceCream.setPrice(1.99);
        iceCream.setDescription("Sweet Vanilla Ice Cream!");
        iceCream.setCategory("Dessert");
        iceCream.setIsNew(false);

        MenuItem hotWings = new MenuItem();
        hotWings.setName("Hot Wings");
        hotWings.setPrice(3.99);
        hotWings.setDescription("Boneless Hot Wings");
        hotWings.setCategory("Appetizer");
        hotWings.setIsNew(true);

        MenuItem hamburger = new MenuItem();
        hamburger.setName("Hamburger");
        hamburger.setPrice(6.99);
        hamburger.setDescription("Double Stack Hamburger");
        hamburger.setCategory("Main Course");
        hamburger.setIsNew(false);


        currentMenu.addMenuItem(friedFish);
        currentMenu.addMenuItem(cake);
        currentMenu.addMenuItem(salsa);
        currentMenu.addMenuItem(iceCream);
        currentMenu.addMenuItem(hotWings);
        currentMenu.addMenuItem(hamburger);



        currentMenu.printMenu();

        currentMenu.printItem(cake);

        MenuItem yellowCake = new MenuItem();
        yellowCake.setName("Cake");
        yellowCake.setPrice(2.99);
        yellowCake.setDescription("Fluffy Yellow Cake");
        yellowCake.setCategory("Dessert");
        yellowCake.setIsNew(true);

        System.out.println(cake.equals(yellowCake));
        System.out.println(cake.equals(friedFish));

        currentMenu.addMenuItem(yellowCake);

        currentMenu.removeMenuItem(hamburger);

        currentMenu.printMenu();
    }
}
