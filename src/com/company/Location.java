package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A location class with information about a location (description, exits, objects, etc.).
 */

public class Location {
    //instance variables are private; can be accessed from inside class but not from other classes
    private String description;
    private String[] objects;
    private String[] exits;
    private String choice;

    /**
     * Constructs a high school with an emergency exit and a desk chair.
     */
    public Location(){
    }

    /**
     * Constructs a location with a given description, exit and chair.
     */
    public Location(String description, String[] objects, String[] exit, String choice){
        this.description = description;
        this.exits = exit;
        this.objects = objects;
        this.choice = choice;
    }

    /**
     * Displays the description of the location.
     */
    public static void printLocation(Location location){
        System.out.println("Description: " + location.description + ".\n Objects: " + Arrays.toString(location.objects) + ".\n Exits: " + Arrays.toString(location.exits));
    }

    public static Location testLocation(){
        Location location = new Location();
        printLocation(location);
        return location;
    }


    /**
     * Gets the location's description.
     */
    public String getDescription() {return this.description;}

    public String[] getObjects(){ return this.objects;}

    /**
     * Gets the location's exit.
     */
    public String[] getExits(){return this.exits;}

    /**
     * Sets the description.
     */
    public void setDescription(String description){this.description = description;}

    public void setObjects(String[] objects){this.objects = objects;}

    /**
     * Sets the exit.
     */
    public void setExits(String[] exit){this.exits = exit;}

    public Location addChoice(String choice, Location location){

    }

    public Location selectNextLocation(String choice, Location previousLocation){

    }


    /**
     * Creates a world that contains different locations
     * @return Location[] world
     */
    public static Location[] createWorld(){
        //create an array of Locations
        Location[] world = new Location[10];
        Location location1 = new Location();
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
        location1.setExits(new String[]{"Up", "Down"});
        Location location2 = new Location();
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
        return world;
    }


    public static void main(String[] args) {
        testLocation();
        Location location1 = new Location();
        location1.setDescription("start of labyrinth");
        location1.setExits(new String[]{"Up", "Down"});
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