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
    private boolean Final;

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
    public boolean getFinal() {
        return this.Final;
    }

    public void setFinal(Boolean Final){
        this.Final=Final;
    }
    public String getStatement() {
        return this.statement;
    }

    public String[] getObjects() {
        return this.objects;
    }

    public Location getChoice(Location location,String choice){

       Location [] l= location.getExits();
       if(!choice.equals("A")&&!choice.equals("B")){
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



    /**
     * Creates a world that contains different locations
     *
     * @return Location[] world
     */
    public static Location createWorld() {
        //create an array of Locations
        Location[] world = new Location[10];
        Location location1 = new Location();
        Location location2 = new Location();
        Location location3 = new Location();
        Location location4 = new Location();
        Location location5 = new Location();
        Location location6 = new Location();
        Location location7 = new Location();
        Location location8 = new Location();
        Location location9 = new Location();
        Location location10 = new Location(); //to do
        Location location11= new Location(); //to do
        Location location12= new Location(); //to do

        Location die1 = new Location();
        Location die2 = new Location();
        Location die3 = new Location();
        Location die4 = new Location();
        Location die5 = new Location();
        Location die6 = new Location();
        Location die7 = new Location();
        Location die8 = new Location();
        Location die9 = new Location(); //to do
        Location die10 = new Location(); //to do
        Location die11= new Location(); //to do

        Location final1=new Location();
        Location final2=new Location(); //to do
        Location final3=new Location(); //to do --> exit game


        location1.setStatement("Press 'A' if you want to go down, press 'B' if you want to go to the right.");
        location1.setDescription(
                        "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                        "├─────┬─╴x├───╴ ╷ ╵ ┌───┬─────┐ │ ╷ ╶─┘ ╷ ╷ │ ┌─────┐ ╷ │ \n" +
                        "│ ╶───┤x┌─┘O╶───┼───┘ ╷ └───╴ │ │ ├───┬─┘ │ └─┤ ┌─╴ ╵ │ │ \n" +
                        "│ ╶─┐ │x│ ┌───╴x│ ╶───┼───┬─╴ │ └─┘ ╷ ╵ ┌─┴─╴ │ └─────┤ │ \n" +
                        "├─┐ │ │x│ │x┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤ ┌───┴─────╴ │ │ \n" +
                        "│ ╵ │ │x│ │x│ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘ │ ╶─┬───────┘ │ \n" +
                        "├───┘ │x├─┘x├───┤ ┌─┘ │ ╶─┬───┘ │ ┌─────┬─┴─╴ │ ┌───────┤ \n" +
                        "│ ┌───┤x╵x┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │ │ ┌─┐ ╵ ┌─┬─┘ ├─────┐ │ \n" +
                        "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘ │ │ └───┘ ╵ ┌─┘ ╶─┐ │ │ \n" +
                        "│ ╵ ├─┐ ╶─┤ ┌───────┐ └─┤ ┌─────┬─┘ ├───┐ ┌───┼───╴ │ │ │ \n" +
                        "│ ╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴ │ ╵ ┌─╴ │ ╷ ╵ ╷ │ ╵ ╷ │ ┌───┘ ╵ │ \n" +
                        "├─╴ │ │ ╷ ├─╴ │ ┌─┘ ┌───┴───┤ ┌─┴─┴───┘ ├───┤ │ └─────┐ │ \n" +
                        "│ ╶─┘ │ └─┘ ╶─┘ │ ╶─┘ ╶───┐ ╵ ╵ ┌───────┘ ╶─┘ └─────╴ │ F \n" +
                        "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location1.setExits(new Location[]{die1, location2});
        location1.setDead(false);
        location1.setFinal(false);

        die1.setDescription(" \\||/\n" +
                "                |  @___oo\n" +
                "      /\\  /\\   / (__,,,,|\n" +
                "     ) /^\\) ^\\/ _)\n" +
                "     )   /^\\/   _)\n" +
                "     )   _ /  / _)\n" +
                " /\\  )/\\/ ||  | )_)\n" +
                "<  >      |(,,) )__)\n" +
                " ||      /    \\)___)\\\n" +
                " | \\____(      )___) )___\n" +
                "  \\______(_______;;; __;;;");
        die1.setStatement("You have found a horrible dragon that throws fire. You are dead. Maybe try again.");
        die1.setDead(true);
        die1.setFinal(false);


        location2.setStatement("Press 'A' if you want to go left, press 'B' if you want to go to the right.");
        location2.setDescription(
                "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                        "├─────┬─╴x├───╴O╷ ╵ ┌───┬─────┐ │ ╷ ╶─┘ ╷ ╷ │ ┌─────┐ ╷ │ \n" +
                        "│ ╶───┤x┌─┘x╶───┼───┘ ╷ └───╴ │ │ ├───┬─┘ │ └─┤ ┌─╴ ╵ │ │ \n" +
                        "│ ╶─┐ │x│ ┌───╴x│ ╶───┼───┬─╴ │ └─┘ ╷ ╵ ┌─┴─╴ │ └─────┤ │ \n" +
                        "├─┐ │ │x│ │x┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤ ┌───┴─────╴ │ │ \n" +
                        "│ ╵ │ │x│ │x│ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘ │ ╶─┬───────┘ │ \n" +
                        "├───┘ │x├─┘x├───┤ ┌─┘ │ ╶─┬───┘ │ ┌─────┬─┴─╴ │ ┌───────┤ \n" +
                        "│ ┌───┤x╵x┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │ │ ┌─┐ ╵ ┌─┬─┘ ├─────┐ │ \n" +
                        "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘ │ │ └───┘ ╵ ┌─┘ ╶─┐ │ │ \n" +
                        "│ ╵ ├─┐ ╶─┤ ┌───────┐ └─┤ ┌─────┬─┘ ├───┐ ┌───┼───╴ │ │ │ \n" +
                        "│ ╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴ │ ╵ ┌─╴ │ ╷ ╵ ╷ │ ╵ ╷ │ ┌───┘ ╵ │ \n" +
                        "├─╴ │ │ ╷ ├─╴ │ ┌─┘ ┌───┴───┤ ┌─┴─┴───┘ ├───┤ │ └─────┐ │ \n" +
                        "│ ╶─┘ │ └─┘ ╶─┘ │ ╶─┘ ╶───┐ ╵ ╵ ┌───────┘ ╶─┘ └─────╴ │ F \n" +
                        "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location2.setExits(new Location[]{die2, location3});
        location2.setDead(false);
        location2.setFinal(false);

        die2.setDescription(" ) _     _\n" +
                "    ( (^)-~-(^)\n" +
                "__,-.\\_( 6 6 )__,-.___\n" +
                "  'M'   \\   /   'M'\n" +
                "         >o<");
        die2.setStatement("You have been attacked by hungry rats. You are dead");
        die2.setDead(true);
        die2.setFinal(false);

        location3.setStatement("Press 'A' if you want to go left, press 'B' if you want to go to the right.");
        location3.setDescription(
                        "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                        "├─────┬─╴x├───╴x╷x╵x┌───┬─────┐x│ ╷ ╶─┘ ╷O╷ │ ┌─────┐ ╷ │ \n" +
                        "│ ╶───┤x┌─┘x╶───┼───┘ ╷ └───╴ │x│ ├───┬─┘x│ └─┤ ┌─╴ ╵ │ │ \n" +
                        "│ ╶─┐ │x│ ┌───╴x│ ╶───┼───┬─╴ │x└─┘x╷x╵x┌─┴─╴ │ └─────┤ │ \n" +
                        "├─┐ │ │x│ │x┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤ ┌───┴─────╴ │ │ \n" +
                        "│ ╵ │ │x│ │x│ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘ │ ╶─┬───────┘ │ \n" +
                        "├───┘ │x├─┘x├───┤ ┌─┘ │ ╶─┬───┘ │ ┌─────┬─┴─╴ │ ┌───────┤ \n" +
                        "│ ┌───┤x╵x┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │ │ ┌─┐ ╵ ┌─┬─┘ ├─────┐ │ \n" +
                        "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘ │ │ └───┘ ╵ ┌─┘ ╶─┐ │ │ \n" +
                        "│ ╵ ├─┐ ╶─┤ ┌───────┐ └─┤ ┌─────┬─┘ ├───┐ ┌───┼───╴ │ │ │ \n" +
                        "│ ╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴ │ ╵ ┌─╴ │ ╷ ╵ ╷ │ ╵ ╷ │ ┌───┘ ╵ │ \n" +
                        "├─╴ │ │ ╷ ├─╴ │ ┌─┘ ┌───┴───┤ ┌─┴─┴───┘ ├───┤ │ └─────┐ │ \n" +
                        "│ ╶─┘ │ └─┘ ╶─┘ │ ╶─┘ ╶───┐ ╵ ╵ ┌───────┘ ╶─┘ └─────╴ │ F \n" +
                        "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location3.setExits(new Location[]{die3, location4});
        location3.setDead(false);
        location3.setFinal(false);

        die3.setDescription("_;~)                  (~;_\n" +
                "(   |                  |   )\n" +
                " ~', ',    ,''~'',   ,' ,'~\n" +
                "     ', ','       ',' ,'\n" +
                "       ',: {'} {'} :,'\n" +
                "         ;   /^\\   ;\n" +
                "          ~\\  ~  /~\n" +
                "        ,' ,~~~~~, ',\n" +
                "      ,' ,' ;~~~; ', ',\n" +
                "    ,' ,'    '''    ', ',\n" +
                "  (~  ;               ;  ~)\n" +
                "   -;_)               (_;");
        die3.setStatement("There was a hole in the ground! You have fallen to more than 300 meters high.You are dead");
        die3.setDead(true);
        die3.setFinal(false);

        location4.setStatement("Press 'A' if you want to go left, press 'B' if you want to go to the right.");
        location4.setDescription(
                        "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                        "├─────┬─╴x├───╴x╷x╵x┌───┬─────┐x│ ╷ ╶─┘ ╷x╷x│ ┌─────┐ ╷ │ \n" +
                        "│ ╶───┤x┌─┘x╶───┼───┘ ╷ └───╴ │x│ ├───┬─┘x│x└─┤ ┌─╴ ╵ │ │ \n" +
                        "│ ╶─┐ │x│ ┌───╴x│ ╶───┼───┬─╴ │x└─┘x╷x╵x┌─┴─╴x│ └─────┤ │ \n" +
                        "├─┐ │ │x│ │x┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤x┌───┴─────╴ │ │ \n" +
                        "│ ╵ │ │x│ │x│ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘x│ ╶─┬───────┘ │ \n" +
                        "├───┘ │x├─┘x├───┤ ┌─┘ │ ╶─┬───┘ │x┌─────┬─┴─╴ │ ┌───────┤ \n" +
                        "│ ┌───┤x╵x┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │x│ ┌─┐ ╵ ┌─┬─┘ ├─────┐ │ \n" +
                        "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘x│ │ └───┘ ╵ ┌─┘ ╶─┐ │ │ \n" +
                        "│ ╵ ├─┐ ╶─┤ ┌───────┐ └─┤x┌─────┬─┘ ├───┐ ┌───┼───╴ │ │ │ \n" +
                        "│ ╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴ │x╵x┌─╴x│ ╷ ╵ ╷ │ ╵ ╷ │ ┌───┘ ╵ │ \n" +
                        "├─╴ │ │ ╷ ├─╴ │ ┌─┘ ┌───┴───┤x┌─┴─┴───┘ ├───┤ │ └─────┐ │ \n" +
                        "│ ╶─┘ │ └─┘ ╶─┘ │ ╶─┘ ╶───┐ ╵O╵ ┌───────┘ ╶─┘ └─────╴ │ F \n" +
                        "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location4.setExits(new Location[]{location10, location5});
        location4.setDead(false);
        location4.setFinal(false);

        location5.setStatement("Press 'A' if you want to go left, press 'B' if you want to go up.");
        location5.setDescription(
                        "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                        "├─────┬─╴x├───╴x╷x╵x┌───┬─────┐x│ ╷ ╶─┘ ╷x╷x│ ┌─────┐ ╷ │ \n" +
                        "│ ╶───┤x┌─┘x╶───┼───┘ ╷ └───╴ │x│ ├───┬─┘x│x└─┤ ┌─╴ ╵ │ │ \n" +
                        "│ ╶─┐ │x│ ┌───╴x│ ╶───┼───┬─╴ │x└─┘x╷x╵x┌─┴─╴x│ └─────┤ │ \n" +
                        "├─┐ │ │x│ │x┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤x┌───┴─────╴ │ │ \n" +
                        "│ ╵ │ │x│ │x│ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘x│ ╶─┬───────┘ │ \n" +
                        "├───┘ │x├─┘x├───┤ ┌─┘ │ ╶─┬───┘ │x┌─────┬─┴─╴ │ ┌───────┤ \n" +
                        "│ ┌───┤x╵x┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │x│ ┌─┐ ╵ ┌─┬─┘ ├─────┐ │ \n" +
                        "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘x│ │ └───┘ ╵ ┌─┘ ╶─┐ │ │ \n" +
                        "│ ╵ ├─┐ ╶─┤ ┌───────┐ └─┤x┌─────┬─┘O├───┐ ┌───┼───╴ │ │ │ \n" +
                        "│ ╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴ │x╵x┌─╴x│ ╷x╵x╷x│ ╵ ╷ │ ┌───┘ ╵ │ \n" +
                        "├─╴ │ │ ╷ ├─╴ │ ┌─┘ ┌───┴───┤x┌─┴─┴───┘x├───┤ │ └─────┐ │ \n" +
                        "│ ╶─┘ │ └─┘ ╶─┘ │ ╶─┘ ╶───┐ ╵x╵x┌───────┘ ╶─┘ └─────╴ │ F \n" +
                        "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location5.setExits(new Location[]{die4, location6});
        location5.setDead(false);
        location5.setFinal(false);

        die4.setDescription("...\n" +
                "             ;::::;\n" +
                "           ;::::; :;\n" +
                "         ;:::::'   :;\n" +
                "        ;:::::;     ;.\n" +
                "       ,:::::'       ;           OOO\\\n" +
                "       ::::::;       ;          OOOOO\\\n" +
                "       ;:::::;       ;         OOOOOOOO\n" +
                "      ,;::::::;     ;'         / OOOOOOO\n" +
                "    ;:::::::::`. ,,,;.        /  / DOOOOOO\n" +
                "  .';:::::::::::::::::;,     /  /     DOOOO\n" +
                " ,::::::;::::::;;;;::::;,   /  /        DOOO\n" +
                ";`::::::`'::::::;;;::::: ,#/  /          DOOO\n" +
                ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                " :::`:::::::`;; ;:::::::::##                OO\n" +
                " ::::`:::::::`;::::::::;:::#                OO\n" +
                " `:::::`::::::::::::;'`:;::#                O\n" +
                "  `:::::`::::::::;' /  / `:#\n" +
                "   ::::::`:::::;'  /  /   `#");
        die4.setStatement("You have met the grim reaper.You are dead");
        die4.setDead(true);
        die4.setFinal(false);

        location6.setStatement("Press 'A' if you want to go left, press 'B' if you want to go to the right.");
        location6.setDescription(
                        "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                        "├─────┬─╴x├───╴x╷x╵x┌───┬─────┐x│ ╷ ╶─┘ ╷x╷x│ ┌─────┐O╷ │ \n" +
                        "│ ╶───┤x┌─┘x╶───┼───┘ ╷ └───╴ │x│ ├───┬─┘x│x└─┤x┌─╴x╵x│ │ \n" +
                        "│ ╶─┐ │x│ ┌───╴x│ ╶───┼───┬─╴ │x└─┘x╷x╵x┌─┴─╴x│x└─────┤ │ \n" +
                        "├─┐ │ │x│ │x┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤x┌───┴─────╴x│ │ \n" +
                        "│ ╵ │ │x│ │x│ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘x│x╶─┬───────┘ │ \n" +
                        "├───┘ │x├─┘x├───┤ ┌─┘ │ ╶─┬───┘ │x┌─────┬─┴─╴x│ ┌───────┤ \n" +
                        "│ ┌───┤x╵x┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │x│x┌─┐x╵x┌─┬─┘ ├─────┐ │ \n" +
                        "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘x│x│ └───┘ ╵ ┌─┘ ╶─┐ │ │ \n" +
                        "│ ╵ ├─┐ ╶─┤ ┌───────┐ └─┤x┌─────┬─┘x├───┐ ┌───┼───╴ │ │ │ \n" +
                        "│ ╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴ │x╵x┌─╴x│ ╷x╵x╷x│ ╵ ╷ │ ┌───┘ ╵ │ \n" +
                        "├─╴ │ │ ╷ ├─╴ │ ┌─┘ ┌───┴───┤x┌─┴─┴───┘x├───┤ │ └─────┐ │ \n" +
                        "│ ╶─┘ │ └─┘ ╶─┘ │ ╶─┘ ╶───┐ ╵x╵x┌───────┘ ╶─┘ └─────╴ │ F \n" +
                        "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location6.setExits(new Location[]{die5, location7});
        location6.setDead(false);
        location6.setFinal(false);

        die5.setDescription("|___|___|___|___|___|___|___|___|___|___|___|___|\n" +
                            "|_|___|___|___|___|___|___|___|___|___|___|___|_|\n" +
                            "|___|___|___|___|___|___|___|___|___|___|___|___|\n" +
                            "|_|___|___|___|___|___|___|___|___|___|___|___|_|\n" +
                            "|___|___|___|___|___|___|___|___|___|___|___|___|\n" +
                            "|___|___|___|___|___|___|___|___|___|___|___|___|\n" +
                            "|___|___|___|___|___|___|___|___|___|___|___|___|");
        die5.setStatement("A wall has closed behind you. You have been locked up. You starve");
        die5.setDead(true);
        die5.setFinal(false);

        location7.setStatement("Press 'A' if you want to go left, press 'B' if you want to go down.");
        location7.setDescription(
                        "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                        "├─────┬─╴x├───╴x╷x╵x┌───┬─────┐x│ ╷ ╶─┘ ╷x╷x│ ┌─────┐x╷x│ \n" +
                        "│ ╶───┤x┌─┘x╶───┼───┘ ╷ └───╴ │x│ ├───┬─┘x│x└─┤x┌─╴x╵x│x│ \n" +
                        "│ ╶─┐ │x│ ┌───╴x│ ╶───┼───┬─╴ │x└─┘x╷x╵x┌─┴─╴x│x└─────┤x│ \n" +
                        "├─┐ │ │x│ │x┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤x┌───┴─────╴x│x│ \n" +
                        "│ ╵ │ │x│ │x│ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘x│x╶─┬───────┘x│ \n" +
                        "├───┘ │x├─┘x├───┤ ┌─┘ │ ╶─┬───┘ │x┌─────┬─┴─╴x│x┌───────┤ \n" +
                        "│ ┌───┤x╵x┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │x│x┌─┐x╵x┌─┬─┘x├─────┐ │ \n" +
                        "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘x│x│ └───┘ ╵x┌─┘ ╶─┐ │ │ \n" +
                        "│ ╵ ├─┐ ╶─┤ ┌───────┐ └─┤x┌─────┬─┘x├───┐O┌───┼───╴ │ │ │ \n" +
                        "│ ╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴ │x╵x┌─╴x│ ╷x╵x╷x│ ╵ ╷ │ ┌───┘ ╵ │ \n" +
                        "├─╴ │ │ ╷ ├─╴ │ ┌─┘ ┌───┴───┤x┌─┴─┴───┘x├───┤ │ └─────┐ │ \n" +
                        "│ ╶─┘ │ └─┘ ╶─┘ │ ╶─┘ ╶───┐ ╵x╵x┌───────┘ ╶─┘ └─────╴ │ F \n" +
                        "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location7.setExits(new Location[]{die6, location8});
        location7.setDead(false);
        location7.setFinal(false);

        die6.setDescription("/^\\      /^\\\n" +
                "      |  \\    /  |\n" +
                "      ||\\ \\../ /||\n" +
                "      )'        `(\n" +
                "     ,;`w,    ,w';,\n" +
                "     ;,  ) __ (  ,;\n" +
                "      ;  \\(\\/)/  ;;\n" +
                "     ;|  |vwwv|    ``-...\n" +
                "      ;  `lwwl'   ;      ```''-.\n" +
                "     ;| ; `\"\"' ; ;              `.\n" +
                "      ;         ,   ,          , |\n" +
                "      '  ;      ;   l    .     | |\n" +
                "      ;    ,  ,    |,-,._|      \\;\n" +
                "       ;  ; `' ;   '    \\ `\\     \\;\n" +
                "       |  |    |  |     |   |    |;\n" +
                "       |  ;    ;  |      \\   \\   (;\n" +
                "       | |      | l       | | \\  |\n" +
                "       | |      | |  pb   | |  ) |\n" +
                "       | |      | ;       | |  | |\n" +
                "       ; ,      : ,      ,_.'  | |\n" +
                "      :__'      | |           ,_.'\n" +
                "               `--'");
        die6.setStatement("You have met a hungry wolf. And it has devoured you. You are dead");
        die6.setDead(true);
        die6.setFinal(false);

        location8.setStatement("Press 'A' if you want to go left, press 'B' if you want to go to right.");
        location8.setDescription(
                "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                        "├─────┬─╴x├───╴x╷x╵x┌───┬─────┐x│ ╷ ╶─┘ ╷x╷x│ ┌─────┐x╷x│ \n" +
                        "│ ╶───┤x┌─┘x╶───┼───┘ ╷ └───╴ │x│ ├───┬─┘x│x└─┤x┌─╴x╵x│x│ \n" +
                        "│ ╶─┐ │x│ ┌───╴x│ ╶───┼───┬─╴ │x└─┘x╷x╵x┌─┴─╴x│x└─────┤x│ \n" +
                        "├─┐ │ │x│ │x┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤x┌───┴─────╴x│x│ \n" +
                        "│ ╵ │ │x│ │x│ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘x│x╶─┬───────┘x│ \n" +
                        "├───┘ │x├─┘x├───┤ ┌─┘ │ ╶─┬───┘ │x┌─────┬─┴─╴x│x┌───────┤ \n" +
                        "│ ┌───┤x╵x┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │x│x┌─┐x╵x┌─┬─┘x├─────┐ │ \n" +
                        "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘x│x│ └───┘ ╵x┌─┘ ╶─┐ │ │ \n" +
                        "│ ╵ ├─┐ ╶─┤ ┌───────┐ └─┤x┌─────┬─┘x├───┐x┌───┼───╴ │ │ │ \n" +
                        "│ ╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴ │x╵x┌─╴x│ ╷x╵x╷x│x╵x╷x│ ┌───┘ ╵ │ \n" +
                        "├─╴ │ │ ╷ ├─╴ │ ┌─┘ ┌───┴───┤x┌─┴─┴───┘x├───┤x│ └─────┐ │ \n" +
                        "│ ╶─┘ │ └─┘ ╶─┘ │ ╶─┘ ╶───┐ ╵x╵x┌───────┘ ╶─┘O└─────╴ │ F \n" +
                        "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location8.setExits(new Location[]{die7, location9});
        location8.setDead(false);
        location8.setFinal(false);

        die7.setDescription("__.......__\n" +
                "            .-:::::::::::::-.\n" +
                "          .:::''':::::::''':::.\n" +
                "        .:::'     `:::'     `:::. \n" +
                "   .'\\  ::'   ^^^  `:'  ^^^   '::  /`.\n" +
                "  :   \\ ::   _.__       __._   :: /   ;\n" +
                " :     \\`: .' ___\\     /___ `. :'/     ; \n" +
                ":       /\\   (_|_)\\   /(_|_)   /\\       ;\n" +
                ":      / .\\   __.' ) ( `.__   /. \\      ;\n" +
                ":      \\ (        {   }        ) /      ; \n" +
                " :      `-(     .  ^\"^  .     )-'      ;\n" +
                "  `.       \\  .'<`-._.-'>'.  /       .'\n" +
                "    `.      \\    \\;`.';/    /      .'\n" +
                "      `._    `-._       _.-'    _.'\n" +
                "       .'`-.__ .'`-._.-'`. __.-'`.\n" +
                "     .'       `.         .'       `.\n" +
                "   .'           `-.   .-'           `.");
        die7.setStatement("You have found a vampire, who has bit your neck. You are dead");
        die7.setDead(true);
        die7.setFinal(false);

        location9.setStatement("Press 'A' if you want to go up, press 'B' if you want to go down.");
        location9.setDescription(
                "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                        "├─────┬─╴x├───╴x╷x╵x┌───┬─────┐x│ ╷ ╶─┘ ╷x╷x│ ┌─────┐x╷x│ \n" +
                        "│ ╶───┤x┌─┘x╶───┼───┘ ╷ └───╴ │x│ ├───┬─┘x│x└─┤x┌─╴x╵x│x│ \n" +
                        "│ ╶─┐ │x│ ┌───╴x│ ╶───┼───┬─╴ │x└─┘x╷x╵x┌─┴─╴x│x└─────┤x│ \n" +
                        "├─┐ │ │x│ │x┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤x┌───┴─────╴x│x│ \n" +
                        "│ ╵ │ │x│ │x│ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘x│x╶─┬───────┘x│ \n" +
                        "├───┘ │x├─┘x├───┤ ┌─┘ │ ╶─┬───┘ │x┌─────┬─┴─╴x│x┌───────┤ \n" +
                        "│ ┌───┤x╵x┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │x│x┌─┐x╵x┌─┬─┘x├─────┐ │ \n" +
                        "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘x│x│ └───┘ ╵x┌─┘x╶─┐x│ │ \n" +
                        "│ ╵ ├─┐ ╶─┤ ┌───────┐ └─┤x┌─────┬─┘x├───┐x┌───┼───╴x│x│ │ \n" +
                        "│ ╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴ │x╵x┌─╴x│ ╷x╵x╷x│x╵x╷x│x┌───┘x╵O│ \n" +
                        "├─╴ │ │ ╷ ├─╴ │ ┌─┘ ┌───┴───┤x┌─┴─┴───┘x├───┤x│x└─────┐ │ \n" +
                        "│ ╶─┘ │ └─┘ ╶─┘ │ ╶─┘ ╶───┐ ╵x╵x┌───────┘ ╶─┘x└─────╴x│ F \n" +
                        "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location9.setExits(new Location[]{die8, final1});
        location9.setDead(false);
        location9.setFinal(false);

        die8.setDescription(" \\\n" +
                " /                                 />\n" +
                " \\__+_____________________/\\/\\___/ /|\n" +
                " ()______________________      / /|/\\\n" +
                "             /0 0  ---- |----    /---\\\n" +
                "            |0 o 0 ----|| - \\ --|      \\\n" +
                "             \\0_0/____/ |    |  |\\      \\\n" +
                "                         \\__/__/  |      \\\n" +
                "Bang! Bang!                       |       \\\n" +
                "                                  |         \\\n" +
                "                                  |__________|");
        die8.setStatement("A gang of gangsters has appeared who shot you mercilessly.You are dead");
        die8.setDead(true);
        die8.setFinal(false);

        final1.setDescription(" \\       /            _\\/_\n" +
                "                     .-'-.              //o\\  _\\/_\n" +
                "  _  ___  __  _ --_ /     \\ _--_ __  __ _ | __/o\\\\ _\n" +
                "=-=-_=-=-_=-=_=-_= -=======- = =-=_=-=_,-'|\"'\"\"-|-,_ \n" +
                " =- _=-=-_=- _=-= _--=====- _=-=_-_,-\"          |\n" +
                "   =- =- =-= =- = -  -===- -= - .\"");
        final1.setStatement("You have found the end of the maze and a dawn looms over you. You win");
        final1.setDead(false);
        final1.setFinal(true);

        location10.setStatement("Press 'A' if you want to go up, press 'B' if you want to go down.");
        location10.setDescription(
                "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                        "├─────┬─╴x├───╴x╷x╵x┌───┬─────┐x│ ╷ ╶─┘ ╷x╷x│ ┌─────┐ ╷ │ \n" +
                        "│ ╶───┤x┌─┘x╶───┼───┘ ╷ └───╴ │x│ ├───┬─┘x│x└─┤ ┌─╴ ╵ │ │ \n" +
                        "│ ╶─┐ │x│ ┌───╴x│ ╶───┼───┬─╴ │x└─┘x╷x╵x┌─┴─╴x│ └─────┤ │ \n" +
                        "├─┐ │ │x│ │x┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤x┌───┴─────╴ │ │ \n" +
                        "│ ╵ │ │x│ │x│ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘x│ ╶─┬───────┘ │ \n" +
                        "├───┘ │x├─┘x├───┤ ┌─┘ │ ╶─┬───┘ │x┌─────┬─┴─╴ │ ┌───────┤ \n" +
                        "│ ┌───┤x╵x┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │x│ ┌─┐ ╵ ┌─┬─┘ ├─────┐ │ \n" +
                        "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘x│ │ └───┘ ╵ ┌─┘ ╶─┐ │ │ \n" +
                        "│ ╵ ├─┐ ╶─┤O┌───────┐x└─┤x┌─────┬─┘ ├───┐ ┌───┼───╴ │ │ │ \n" +
                        "│ ╶─┤ ├─╴ │ └─┬─╴ ┌─┴─╴x│x╵x┌─╴x│ ╷ ╵ ╷ │ ╵ ╷ │ ┌───┘ ╵ │ \n" +
                        "├─╴ │ │ ╷ ├─╴ │ ┌─┘x┌───┴───┤x┌─┴─┴───┘ ├───┤ │ └─────┐ │ \n" +
                        "│ ╶─┘ │ └─┘ ╶─┘ │x╶─┘x╶───┐x╵x╵ ┌───────┘ ╶─┘ └─────╴ │ F \n" +
                        "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location10.setExits(new Location[]{die9, location11});
        location10.setDead(false);
        location10.setFinal(false);

        die9.setDescription("Nothing is what it seems like...");
        die9.setExits(new Location[]{location1, final3});
        die9.setStatement("You chose a shortcut and are now moved back to the start. " +
                "Hopefully you remember the way you took to come this far. Press 'A' to start again, press 'B' to exit.");
        die9.setDead(false);
        die9.setFinal(false);

        final3.setDescription("Too bad. We hoped you enjoyed playing and see you soon again.");
        final3.setStatement("");
        final3.setDead(false);
        final3.setFinal(true);

        location11.setStatement("Press 'A' if you want to go left, press 'B' if you want to go to the right.");
        location11.setDescription("┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                "├─────┬─╴x├───╴x╷x╵x┌───┬─────┐x│ ╷ ╶─┘ ╷x╷x│ ┌─────┐ ╷ │ \n" +
                "│ ╶───┤x┌─┘x╶───┼───┘ ╷ └───╴ │x│ ├───┬─┘x│x└─┤ ┌─╴ ╵ │ │ \n" +
                "│ ╶─┐ │x│ ┌───╴x│ ╶───┼───┬─╴ │x└─┘x╷x╵x┌─┴─╴x│ └─────┤ │ \n" +
                "├─┐ │ │x│ │x┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤x┌───┴─────╴ │ │ \n" +
                "│ ╵ │ │x│ │x│ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘x│ ╶─┬───────┘ │ \n" +
                "├───┘ │x├─┘x├───┤ ┌─┘ │ ╶─┬───┘ │x┌─────┬─┴─╴ │ ┌───────┤ \n" +
                "│ ┌───┤x╵x┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │x│ ┌─┐ ╵ ┌─┬─┘ ├─────┐ │ \n" +
                "│ │ ╷ └───┤ ╶─┴───┴───┐ ┌─────┴─┘x│ │ └───┘ ╵ ┌─┘ ╶─┐ │ │ \n" +
                "│ ╵ ├─┐ ╶─┤x┌───────┐x└─┤x┌─────┬─┘ ├───┐ ┌───┼───╴ │ │ │ \n" +
                "│ ╶─┤ ├─╴ │x└─┬─╴ ┌─┴─╴x│x╵x┌─╴x│ ╷ ╵ ╷ │ ╵ ╷ │ ┌───┘ ╵ │ \n" +
                "├─╴ │ │ ╷ ├─╴x│ ┌─┘x┌───┴───┤x┌─┴─┴───┘ ├───┤ │ └─────┐ │ \n" +
                "│ ╶─┘ │ └─┘O╶─┘ │x╶─┘x╶───┐x╵x╵ ┌───────┘ ╶─┘ └─────╴ │ F \n" +
                "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location11.setExits(new Location[]{location12, die10});
        location11.setDead(false);
        location11.setFinal(false);

        die10.setDescription("   .\n" +
                "  .\n" +
                " . .\n" +
                "  ...\n" +
                "\\~~~~~/\n" +
                " \\   /\n" +
                "  \\ /\n" +
                "   V\n" +
                "   |\n" +
                "   |\n" +
                "  ---");
        die10.setStatement("By the time you walked all the way here you were so thirsty you accidentally drank from a suspicious wine glass. " +
                "After some time of hallucinations you finally die.");
        die10.setDead(true);
        die10.setFinal(false);

        location12.setStatement("Looks like you're going a little bit out of reach of the final destination, but don't give up!" +
                "The labyrinth is full of secrets and you might stumble upon one. " +
                "Press 'A' if you want to go down, press 'B' if you want to go to up.");
        location12.setDescription(
                "┌─────────┬───────┬─────────────┬─────┬─────┬───────────┐ \n" +
                "├─────┬─╴x├───╴x╷x╵x┌───┬─────┐x│ ╷ ╶─┘ ╷x╷x│ ┌─────┐ ╷ │ \n" +
                "│ ╶───┤x┌─┘x╶───┼───┘ ╷ └───╴ │x│ ├───┬─┘x│x└─┤ ┌─╴ ╵ │ │ \n" +
                "│ ╶─┐ │x│ ┌───╴x│ ╶───┼───┬─╴ │x└─┘x╷x╵x┌─┴─╴x│ └─────┤ │ \n" +
                "├─┐ │ │x│ │x┌───┘ ┌─╴ │ ╷ │ ╶─┼─────┴───┤x┌───┴─────╴ │ │ \n" +
                "│ ╵ │ │x│ │x│ ╶─┬─┘ ┌─┤ └─┴─╴ │ ┌───────┘x│ ╶─┬───────┘ │ \n" +
                "├───┘ │x├─┘x├───┤ ┌─┘ │ ╶─┬───┘ │x┌─────┬─┴─╴ │ ┌───────┤ \n" +
                "│ ┌───┤x╵x┌─┘ ╷ ╵ │ ╶─┴─╴ └─╴ ╷ │x│ ┌─┐ ╵ ┌─┬─┘ ├─────┐ │ \n" +
                "│ │x╷x└───┤ ╶─┴───┴───┐ ┌─────┴─┘x│ │ └───┘ ╵ ┌─┘ ╶─┐ │ │ \n" +
                "│ ╵x├─┐x╶─┤x┌───────┐x└─┤x┌─────┬─┘ ├───┐ ┌───┼───╴ │ │ │ \n" +
                "│O╶─┤ ├─╴x│x└─┬─╴ ┌─┴─╴x│x╵x┌─╴x│ ╷ ╵ ╷ │ ╵ ╷ │ ┌───┘ ╵ │ \n" +
                "├─╴ │ │x╷ ├─╴x│ ┌─┘x┌───┴───┤x┌─┴─┴───┘ ├───┤ │ └─────┐ │ \n" +
                "│ ╶─┘ │x└─┘x╶─┘ │x╶─┘x╶───┐x╵x╵ ┌───────┘ ╶─┘ └─────╴ │ F \n" +
                "└─────┴─────────┴─────────┴─────┴─────────────────────┴─┘ ");
        location12.setExits(new Location[]{die11, final2});
        location12.setDead(false);
        location12.setFinal(false);

        die11.setDescription("        __  __                              \n" +
                "     ,-'  `'  \\         _---``--    \n" +
                "    /    _  _  ;      __        `. \n" +
                "   /    / `' \\;        /`-----    )     \n" +
                "  /  .-/    ,(         ),     \\-. ; \n" +
                "  |  \\(       \\       /        )/; \n" +
                "  |   -      _5       `7       -;  \n" +
                " /    (  ___-'         `-____    | \n" +
                "(   ___`-_                 \\ ____| \n" +
                " \\ /   `,/ \\     _(\\__      /    \\ \n" +
                "  \\      ;  \\  .' /'  `i.  /      | \n" +
                "   |      \\ _-'( _\\__-/  `-       |\n" +
                "   |       `   ,`     `_          |");
        die11.setStatement("You meet the love of you life and decide to stay in the maze to die with them.");
        die11.setDead(true);
        die11.setFinal(false);

        final2.setDescription("");
        final2.setStatement("Walking upwards you suddenly feel a hole in the wall, just big enough to escape through! You climb it and escape the maze. " +
                "Congratulations!");
        final2.setDead(false);
        final2.setFinal(true);

        return location1;
    }
}

/*
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