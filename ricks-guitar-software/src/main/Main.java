package main;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to rick Guitar Store :)");

        Inventory inventory = new Inventory();

        //adding guitars to inventory
        inventory.addGuitars("V95693",1499.25,Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER, Wood.ALDER);

        //searching based on serial number
        System.out.println(inventory.getGuitarOnSerialNumber("V95693"));

        //Guitars which Erin Likes
        Guitar whatErinLikes = new Guitar("",0,Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER, Wood.ALDER);

        Guitar guitar = inventory.search(whatErinLikes);
        if(guitar!=null)
        {
            System.out.printf("Congratulations Erin! %s is for you",guitar);
        }else{
            System.out.println("Sorry Erin, we have nothing for you!");
        }

    }
}