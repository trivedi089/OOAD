package main;

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
            System.out.printf("Congratulations Erin! ",guitar);
        }else{
            System.out.println("Sorry Erin, we have nothing for you!");
        }

    }
}