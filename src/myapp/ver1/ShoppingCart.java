package myapp.ver1;


import java.io.Console;
import java.util.List;
import java.util.LinkedList;


public class ShoppingCart {
    public static void main(String[] args) {
    //Create a list of numbers
    List<String> cart = new LinkedList<>();

    // Get the Console
    Console cons = System.console();
    Boolean stop = false;

    while(!stop) {
        // list
        // add <item>
        // delete <num>
        // exit
        String line = cons. readLine(">");
        // command line delimited by space
        line = line.trim();
        // add apple =>["add",, "apple"]
        // list => ["list"]
        String[] terms = line.split(" ");

        System.out.printf("Command: %s\n", terms[0]);

        switch (terms[0]){
            case "list":
            if (cart.size() <= 0) {
                System.out.println("Your cart is empty.");

            }else 

                System.out.println("The contents of your cart");
                for (Integer idx = 0; idx < cart.size(); idx++)
                System.out.printf("%d. %s\n", idx + 1, cart.get(idx));
                break;

            case "add": // add apple orange pear
            // check if add has any items
                cart.add(terms[1]);
                System.out.printf("Added %s to cart\n", terms[1]);
                break;

            case "delete":
            //delete has any number and if the number is valid
                break;

            default:
            System.err.printf("Unknown command: %s\n", terms[0]);
        }
    }
    System.out.println("Thank you for shopping with us!");
}
}