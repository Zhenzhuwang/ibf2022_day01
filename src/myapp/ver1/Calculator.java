package myapp.ver1;

import java.io.Console;

public class Calculator {

    public static void main(String[] args) {
        //Get system console
        Console cons = System.console();

        // //read from the console, the result is assigned to a variable
        // int SumOfNumbers = 0;
        // String number= "";
        
        
        // while (number.trim().length() >= 0){
        //     number = cons.readLine("Enter a number: ");
        
        //     if (number.trim().equals("stop")){
        //         System.out.printf("The Total is %d", SumOfNumbers);
        //         break;
        //     }
            
        
        //     int num = Integer.parseInt(number);
        //     SumOfNumbers = SumOfNumbers + num;
        // }


        //Professor' calculator solution
        String input = "";
        Integer total = 0;
        Integer count = 0;

        while (!input.equals("stop")) {
            //Read a Line
            input = cons.readLine("Enter a number: ");
            input.trim();

            if(input.equals("stop")){
                //exit the while loop
                break;
            }
            count++;
            //Integer value = Integer.parseInt(input);
            //total = total + value
            total += Integer.parseInt(input);
        }
        System.out.printf("The Total of adding %d numbers %d\n",count, total);

    }
            
}
