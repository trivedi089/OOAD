package main;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to rick Guitar Store :)");

        Inventory inventory = new Inventory();

        inventory.addGuitars("V95693",1499.25,"Fender","Stratocastor","electric","Alder","Alder");

        System.out.println(inventory.getGuitarOnSerialNumber("V95693"));

    }
}