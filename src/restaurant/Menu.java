package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdate = new Date();




    public void addMenuItem(MenuItem aMenuItem) {
        menuItems.add(aMenuItem);
        lastUpdate = new Date();
    }

    public void printMenu() {
        ArrayList<MenuItem> appetizers = new ArrayList<>();
        ArrayList<MenuItem> mainCourses = new ArrayList<>();
        ArrayList<MenuItem> desserts = new ArrayList<>();
        for(MenuItem item : menuItems) {
            if(item.getCategory().equals("Appetizer")) {
                appetizers.add(item);
            } else if(item.getCategory().equals("Main Course")) {
                mainCourses.add(item);
            } else if(item.getCategory().equals("Dessert")) {
                desserts.add(item);
            }


        }
        System.out.println("Appetizers:\n");
        for(MenuItem app : appetizers) {
            if (app.getIsNew()) {


            System.out.println(app.getName() + ":  Price: " + app.getPrice() + " Description: " + app.getDescription() + " (New!)");
            } else {
                System.out.println(app.getName() + ":  Price: " + app.getPrice() + " Description: " + app.getDescription());
            }
        }
        System.out.println("\nMain Course:\n");
        for(MenuItem main : mainCourses) {
            if (main.getIsNew()) {


                System.out.println(main.getName() + ":  Price: " + main.getPrice() + " Description: " + main.getDescription() + " (New!)");
            } else {
                System.out.println(main.getName() + ":  Price: " + main.getPrice() + " Description: " + main.getDescription());
            }
        }
        System.out.println("\nDessert:\n");
        for(MenuItem dessert : desserts) {
            if (dessert.getIsNew()) {


                System.out.println(dessert.getName() + ":  Price: " + dessert.getPrice() + " Description: " + dessert.getDescription() + " (New!)");
            } else {
                System.out.println(dessert.getName() + ":  Price: " + dessert.getPrice() + " Description: " + dessert.getDescription());
            }
        }
        System.out.println("\nlast updated:" + lastUpdate);
    }


}
