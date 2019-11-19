package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A location class with information about a location (description, exits, objects, etc.).
 */

public class Location {
    //instance variables are private; can be accessed from inside class but not from other classes
    private String description;
    private String[] objects;
    private Location[] exits;
    private String choice;
    private String statement;
    private boolean dead;

    /**
     * Constructs a high school with an emergency exit and a desk chair.
     */
    public Location() {
    }

    /**
     * Constructs a location with a given description, exit and chair.
     */
    public Location(String description, String[] objects, Location[] exits, String choice,String statement) {
        this.description = description;
        this.exits = exits;
        this.objects = objects;
        this.choice = choice;
        this.statement=statement;
    }

    /**
     * Displays the description of the location.
     */
    public static void printLocation(Location location) {
        System.out.println("Description: " + location.description + ".\n Objects: " + Arrays.toString(location.objects) + ".\n Exits: " + Arrays.toString(location.exits));
    }

    public static Location testLocation() {
        Location location = new Location();
        printLocation(location);
        return location;
    }


    /**
     * Gets the location's description.
     */
    public String getDescription() {
        return this.description;
    }
    public boolean getDead() {
        return this.dead;
    }

    public void setDead(Boolean dead){
        this.dead=dead;
    }
    public String getStatement() {
        return this.statement;
    }

    public String[] getObjects() {
        return this.objects;
    }

    public Location getChoice(Location location,String choice){

       Location []l= location.getExits();
       if(choice!="A"&&choice!="B"){
           return null;
       }
       if(choice.equals("A")){
          return l[0];
       }else{
           return l[1];
       }
    }

    /**
     * Gets the location's exit.
     */
    public Location[] getExits() {
        return this.exits;
    }

    public String setChoice(){
        return this.choice;
    }

    /**
     * Sets the description.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    public void setStatement(String statement) {
        this.statement = statement;
    }

    public void setObjects(String[] objects) {
        this.objects = objects;
    }

    /**
     * Sets the exit.
     */
    public void setExits(Location[] exits) {
        this.exits = exits;
    }

    public String setChoice(String choice){
        return this.choice = choice;

    }

    public void getNextLocation(Scanner in){

    }



    /**
     * Creates a world that contains different locations
     *
     * @return Location[] world
     */
    public static Location[] createWorld() {
        //create an array of Locations
        Location[] world = new Location[10];
        Location location1 = new Location();
        location1.setStatement("Press 'A' if you want to go down, press 'B' if you want to go to the right.");

        location1.setDescription(
                        "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                        "├─────┬─╴ ├───╴ ╷ ╵ ┌───┬─────┐ │ ╷ ╶─┘ ╷ ╷ │ ┌─────┐ ╷ │ \n" +
                        "│ ╶───┤ ┌─┘X╶───┼───┘ ╷ └───╴ │ │ ├───┬─┘ │ └─┤ ┌─╴ ╵ │ │ \n" +
                        "│ ╶─┐ │ │ ┌───╴ │ ╶───┼───┬─╴ │ └─┘ ╷ ╵ ┌─┴─╴ │ └─────┤ │ \n" +
                        "├─┐ │ │ │ │ ┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤ ┌───┴─────╴ │ │ \n" +
                        "│ ╵ │ │ │ │ │ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘ │ ╶─┬───────┘ │ \n" +
                        "├───┘ │ ├─┘ ├───┤ ┌─┘ │ ╶─┬───┘ │ ┌─────┬─┴─╴ │ ┌───────┤ \n" +
                        "│ ┌───┤ ╵ ┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │ │ ┌─┐ ╵ ┌─┬─┘ ├─────┐ │ \n" +
                        "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘ │ │ └───┘ ╵ ┌─┘ ╶─┐ │ │ \n" +
                        "│ ╵ ├─┐ ╶─┤ ┌───────┐ └─┤ ┌─────┬─┘ ├───┐ ┌───┼───╴ │ │ │ \n" +
                        "│ ╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴ │ ╵ ┌─╴ │ ╷ ╵ ╷ │ ╵ ╷ │ ┌───┘ ╵ │ \n" +
                        "├─╴ │ │ ╷ ├─╴ │ ┌─┘ ┌───┴───┤ ┌─┴─┴───┘ ├───┤ │ └─────┐ │ \n" +
                        "│ ╶─┘ │ └─┘ ╶─┘ │ ╶─┘ ╶───┐ ╵ ╵ ┌───────┘ ╶─┘ └─────╴ │ F \n" +
                        "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        Location location2 = new Location();
        Location die1 = new Location();
        location1.setExits(new Location[]{location2, die1});

        location2.setDescription(
                        "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                        "├─────┬─╴ ├───╴X╷ ╵ ┌───┬─────┐ │ ╷ ╶─┘ ╷ ╷ │ ┌─────┐ ╷ │ \n" +
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
                        "│ ╶─┘ │ └─┘ ╶─┘ │ ╶─┘ ╶───┐ ╵ ╵ ┌───────┘ ╶─┘ └─────╴ │ F \n" +
                        "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location2.setChoice("Up");
        Location location3 = new Location();
        Location die2 = new Location();
        location2.setExits(new Location[]{location3, die2});

        world[0] = location1;
        world[1] = location2;
        return world;
    }
}

/**
               "┌─────────┬D──────┬─────────────┬─────┬─────┬───────────┐ \n" +
               "├─────┬─╴ ├─── 2╷ ╵ ┌───┬─────┐ │ ╷ ╶─┘ ╷3╷ │D┌─────┐6╷ │ \n" +
               "│ ╶───┤ ┌─┘1 ───┼───┘ ╷ └───╴ │ │D├───┬─┘ │ └─┤ ┌─╴ ╵ │ │ \n" +
               "│ ╶─┐ │ │ ┌───╴ │ ╶───┼───┬─╴ │ └─┘ ╷ ╵ ┌─┴─╴ │ └─────┤ │ \n" +
               "├─┐ │ │ │ │ ┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤ ┌───┴─────╴ │ │ \n" +
               "F ╵ │ │ │D│ │ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘ │ ╶─┬───────┘ │ \n" +
               "├───┘ │ ├─┘ ├───┤ ┌─┘ │ ╶─┬───┘ │ ┌─────┬─┴─╴ │ ┌───────┤ \n" +
               "│ ┌───┤ ╵ ┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │ │ ┌─┐ ╵ ┌─┬─┘ ├─────┐D│ \n" +
               "│ │ ╷ └───┤D╶─┴───┴───┐ ┌─────┴─┘ │ │D└───┘ ╵ ┌─┘ ╶─┐ │ │ \n" +
               "│c╵ ├─┐ ╶─┤a┌───────┐ └─┤ ┌─────┬─┘5├───┐7┌───┼───╴ │ │ │ \n" +
               "│D╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴ │ ╵ ┌─╴ │D╷ ╵ ╷ │ ╵ ╷ │ ┌───┘ ╵9│ \n" +
               "├─╴ │ │ ╷ ├─╴ │ ┌─┘ ┌───┴───┤ ┌─┴─┴───┘ ├───┤ │ └─────┐ │ \n" +
               "│ ╶─┘ │ └─┘b╶─┘D│ ╶─┘ ╶───┐ ╵4╵ ┌───────┘D╶─┘8└─────╴ │ │ \n" +
               "└─────┴─────────┴─────────┴─────┴─────────────────────┴F┘ ");
 */