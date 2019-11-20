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
        System.out.println("Hello " + name + ". Welcome to your new adventure game! " +
                "\n At the point of being you are lost in a labyrinth and trying to find your way out. You are represented by the O");


        //create the first location
        Location L = Location.createWorld();
        //We save this for using in the elixir case
        Location L1=new Location();
        //while player is not dead
        boolean Final=false;
        Boolean dead=false;
        boolean elixir=true;
        while (dead == false && Final == false) { //Loop throw the locations
            System.out.println(L.getDescription()); //We print the description and the statement of the location
            System.out.println(L.getStatement());
            dead = L.getDead(); //If is a dead
            Final = L.getFinal(); //If is a final

            if (dead) {
                if (elixir) { //We give the chance of drinking a elixir 1 time
                    System.out.println("But...You suddenly remember that you have an elixir of the life you found before entering. Do you want to use it?\n" +
                            "Press A for YES and other key for NO");
                    String input = in.nextLine();
                    if (input.equals("A")) {
                        L = L1; //We get the previous location
                        elixir = false;
                        dead=false;
                        System.out.println("\n\nYo come back to life!!!");
                        continue; //and We go back to the start of the loop

                    } else { //if you decided to not drink, the progam ends
                        System.out.println("A shame.. You die");
                        return 0;
                    }
                }
                return 0; //if you dead and you have not elixir the program ends
            }
            if(Final) { //if you reach a final the program ends
                return 0;
            }
            //Normal case(Not dead or final)
                String input = in.nextLine();
                L1=L;//for the elixir we save the location
                L = L.getChoice(L, input); //then we get the next location with the input of the user
                if (L == null) { //If the input is no "A" or "B" it returns null
                    return -1; //And then this method return -1, that is an error


            }
        }
            return 0;
        }

    }


