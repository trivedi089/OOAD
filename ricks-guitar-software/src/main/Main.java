package main;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to rick Guitar Store :)");

        Inventory inventory = new Inventory();

        GuitarSpec newGuitarSpec=inventory.newGuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);

        inventory.addNewGuitar("V95693",1499.25,newGuitarSpec);

        GuitarSpec ericGuitarSpec = new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER, Wood.ALDER);

        List allGuitars = inventory.search(ericGuitarSpec);

        if(allGuitars!=null)
        {
            System.out.printf("Congratulations Erin! %s are for you",allGuitars
            );
        }else{
            System.out.println("Sorry Erin, we have nothing for you!");
        }
    }
}