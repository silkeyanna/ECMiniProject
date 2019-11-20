package com.company;

/*
Welcome to our Text-Based Adventure Game!

This is a program that creates a non-linear story depending on choices made by the user.
The user is presented with a labyrinth and the program will walk through the labyrinth
until the user either dies or makes it out of the labyrinth.

2019-11-20    Juan Blanco, Silke Jonk     Full implementation
 */

public class Main {

    public static void main(String[] args) {
	    if(Narrator.createNarrator()==-1){ //We call createNarrator, and if it's return -1 is an error
	        throw new RuntimeException("Invalid input");
        }
    }
}
