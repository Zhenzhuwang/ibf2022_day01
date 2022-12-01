package myapp;

public class Todo {

    public static void main(String[] args) {

        //Create an array of 3 strings element [0][1][2][3]
        String[] tasks = new String[3];

        tasks[0] = "running";
        tasks[1] = "eating";
        tasks[2] = "sleeping";

        System.out.println(tasks);
        System.out.println(tasks[2]);
        System.out.println(tasks.length);

        // Use a while loop to print out all the elements in an array
        Integer index = 0;
        while (index < tasks.length) {
            System.out.printf("%d: %s\n", index, tasks[index]);
            index++;
        }
    }
}