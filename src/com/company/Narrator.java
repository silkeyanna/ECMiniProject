package com.company;

import java.util.Scanner;

public class Narrator {
    //first we create a string variable name and a new Scanner in
    public static String name;
    public static Scanner in = new Scanner(System.in);

    public static void createNarrator() {
        //here we ask the user to enter their name and store it in the variable created earlier
        System.out.print("Please enter your name: ");
        name = in.nextLine(); //assigns entered string to the name variable

        //finally we print a greeting in the format of Hello {name}
        System.out.println("Hello " + name + ". Welcome to your new adventure game! \n You are lost in a labyrint, at the point of the x");
        System.out.println("X─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                "├─────┬─╴ ├───╴ ╷ ╵ ┌───┬─────┐ │ ╷ ╶─┘ ╷ ╷ │ ┌─────┐ ╷ │ \n" +
                "│ ╶───┤ ┌─┘ ╶───┼───┘ ╷ └───╴ │ │ ├───┬─┘ │ └─┤ ┌─╴ ╵ │ │ \n" +
                "│ ╶─┐ │ │ ┌───╴ │ ╶───┼───┬─╴ │ └─┘ ╷ ╵ ┌─┴─╴ │ └─────┤ │ \n" +
                "├─┐ │ │ │ │ ┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤ ┌───┴─────╴ │ │ \n" +
                "│ ╵ │ │ │ │ │ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘ │ ╶─┬───────┘ │ \n" +
                "├───┘ │ ├─┘ ├───┤ ┌─┘ │ ╶─┬───┘ │ ┌─────┬─┴─╴ │ ┌───────┤ \n" +
                "│ ┌───┤ ╵ ┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │ │ ┌─┐ ╵ ┌─┬─┘ ├─────┐ │ \n" +
                "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘ │ │ └───┘ ╵ ┌─┘ ╶─┐ │ │ \n" +
                "│ ╵ ├─┐ ╶─┤ ┌───────┐ └─┤ ┌─────┬─┘ ├───┐ ┌───┼───╴ │ │ │ \n" +
                "│ ╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴ │ ╵ ┌─╴ │ ╷ ╵ ╷ │ ╵ ╷ │ ┌───┘ ╵ │ \n" +
                "├─╴ │ │ ╷ ├─╴ │ ┌─┘ ┌───┴───┤ ┌─┴─┴───┘ ├───┤ │ └─────┐ │ \n" +
                "│ ╶─┘ │ └─┘ ╶─┘ │ ╶─┘ ╶───┐ ╵ ╵ ┌───────┘ ╶─┘ └─────╴ │ │ \n" +
                "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        System.out.println("Press 'A' if you want to go down, press 'B' if you want to go to the right.");
        String input = in.nextLine();
        if(input == "Down"){
            System.out.println("You accidentally bumped into a rhinosaurus who hasn't eaten for a while. You die.");
            return;
        } else if(input == "Up"){

        }

    }
}
