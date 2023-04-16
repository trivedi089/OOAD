package main;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to rick Guitar Store :)");

        Inventory inventory = new Inventory();

        //adding guitars to inventory
        inventory.addGuitars("V95693",1499.25,"Fender","Stratocastor","electric","Alder","Alder");

        //searching based on serial number
        System.out.println(inventory.getGuitarOnSerialNumber("V95693"));

        //Guitars which Erin Likes
        Guitar whatErinLikes = new Guitar("",0,"fender","Stratocastor","electric","Alder","Alder");

        Guitar guitar = inventory.search(whatErinLikes);
        if(guitar!=null)
        {
            //On Printing we are getting full info of guitar becasue I have overriden toString() Method
            System.out.printf("Congratulations Erin! ",guitar);
        }else{
            System.out.println("Sorry Erin, we have nothing for you!");
        }

        //Adding another guitar to inventory
        inventory.addGuitars("V9512",1549.95,"Fender","Stratocastor","electric","Alder","Alder");


        //Actually we have guitars what Erin is looking for but our software is unable to searhc it because of case difference in characters,lets modify search
        LinkedList matchingGuitar = inventory.searchForListOfGuitars(whatErinLikes);
        System.out.println(matchingGuitar);
        if(matchingGuitar!=null)
        {
            System.out.printf("Congratulations Erin! ",guitar);
        }else{
            System.out.println("Sorry Erin, we have nothing for you!");
        }

    }
}