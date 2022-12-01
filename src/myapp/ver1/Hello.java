package myapp.ver1;

import java.io.Console;

public class Hello {

    public static void main(String[] args) {
        //Get system console
        Console cons = System.console();

        //read from the console, the result is assigned to a variable
        String name = "";
        while (name.trim().length() <= 0){
            name = cons.readLine("What is your name? ");
        }
        


        // Boolean "==" is for numbers, for Strings comparison use "equals"
        if (name.trim().equals("zz")) {
            System.out.println("Yabadabadoo!");
        }else if (name.trim().equals("barney")){
            System.out.println("Hello barney!");
        }else if (name.trim().equals("")){
            System.out.println("Please enter your name.");
        //else if (name.trim().isEmpty){System.out,println("Please enter your name.")}
        }else {
            //send a greeting to the name with a formatted string
        System.out.printf("Hello %s!\n\tPlease to meet you. \n", name);

        }

        //Send a greeting to the name
        //System.out.println(name);

        
    }
}