package com.company;

import java.util.Scanner;

public class Narrator {
    //first we create a string variable name and a new Scanner in
    public static String name;
    public static boolean dead=false;
    public static Scanner in = new Scanner(System.in);

    public static void createNarrator() {

        //here we ask the user to enter their name and store it in the variable created earlier
        System.out.print("Please enter your name: ");
        name = in.nextLine(); //assigns entered string to the name variable

        //finally we print a greeting in the format of Hello {name}
        System.out.println("Hello " + name + ". Welcome to your new adventure game! \n At the point of being you are lost in a labyrinth and trying to find your way out. You are represented by the X");


        //create labyrinth at start of the story
        Location[] Labyrinth = Location.createWorld();
        Location L = Labyrinth[0];
        //while player is not dead
        while (dead==false) {
            System.out.println(L.getDescription());
            System.out.println(L.getStatement());
            String input = in.nextLine();
            dead=L.getDead();
            L = L.getChoice(L, input);

        }
        }

    }

