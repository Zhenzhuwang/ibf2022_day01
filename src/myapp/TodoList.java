package myapp;

import java.io.Console;
import java.util.List;
import java.util.LinkedList;

public class TodoList {

    public static void main(String[] args) {

        //Create a list of numbers
        List<Integer> listOfInt = new LinkedList<>();

        // Get the Console
        Console cons = System.console();

        String item = "";

        while(true) {
            item = cons.readLine("Please enter a number: ");
            item = item.trim();


            //We could also write as if ("stop".equals(item)) break;
            if (item.equals("stop")) 
                break;

            //Add the item to the list
            listOfInt.add(Integer.parseInt(item));
        }
        System.out.printf("Number of elements in the list: %d\n", listOfInt.size());
        for (Integer index = 0; index < listOfInt.size(); index++)
            System.out.printf("[%d] : %s\n", index, listOfInt.get(index));
    }
}