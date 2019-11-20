package com.company;

import java.util.Scanner;

public class Narrator {
    //first we create a string variable name and a new Scanner in
    public static String name;

    public static Scanner in = new Scanner(System.in);

    public static int createNarrator() {

        //here we ask the user to enter their name and store it in the variable created earlier
        System.out.print("Please enter your name: ");
        name = in.nextLine(); //assigns entered string to the name variable

        //finally we print a greeting in the format of Hello {name}
        System.out.println("Hello " + name + ". Welcome to your new adventure game! \n At the point of being you are lost in a labyrinth and trying to find your way out. You are represented by the X");


        //create labyrinth at start of the story
        Location L = Location.createWorld();

        //while player is not dead
        boolean Final=false;
        Boolean dead=false;
        while (dead == false && Final == false) {
            System.out.println(L.getDescription());
            System.out.println(L.getStatement());
            dead = L.getDead();
            Final = L.getFinal();

            if (dead) {
                return 0;
            }
            if(Final) {
                return 0;
            }

                String input = in.nextLine();

                L = L.getChoice(L, input);
                if (L == null) {
                    return -1;


            }
        }
            return 0;
        }

    }


