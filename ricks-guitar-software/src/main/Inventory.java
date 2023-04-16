package main;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;

public class Inventory {
    LinkedList setOfGuitars;

    public Inventory(){
        setOfGuitars = new LinkedList();
    }
    public void addGuitars(String serialName,double price,String builder, String model, String type, String backWood, String topWood){
        Guitar newGuitar = new Guitar(serialName,price,builder,model,type,backWood,topWood);
        setOfGuitars.add(newGuitar);
    }


    //iterate.next() returns the current element in the iteration and moves the iterator pointer to the next element.
    //hasNext() checks if the current element is present, it will return true then will iterate to next element


    //return Guitar if searching is getting done by serial number and its matching
    public Guitar getGuitarOnSerialNumber(String serialNumberGuitar){
        for(Iterator it = setOfGuitars.iterator();it.hasNext();){
            Guitar guitar = (Guitar) it.next();
            if(guitar.getSerialNumber()==serialNumberGuitar)
                return guitar;
        }
        return null;
    }

    //searching guitar
    public Guitar search(Guitar searchGuitar){
        for(Iterator it = setOfGuitars.iterator(); it.hasNext();){
            Guitar guitar = (Guitar)it.next();  //typecast is necessary because it returns an object of type Object, which is the most general type of object in Java. You then need to cast this object to the specific type of object you're working with, in this case Guitar.

            //Guitar's builder
            String builder = guitar.getBuilder();
            if((builder!=null)&&(!builder.equals(""))&&(!builder.equals(guitar.getBuilder())))
                continue;

            //Guitar's model
            String model = guitar.getModel();
            if((model!=null)&&(!model.equals(""))&&(!model.equals(guitar.getModel())))
                continue;

            //Guitar's type
            String type = guitar.getType();
            if((type!=null)&&(!type.equals(""))&&(!type.equals(guitar.getType())))
                continue;

            //Guitar's backWood
            String backWood = guitar.getBackWood();
            if((backWood!=null)&&(!backWood.equals(""))&&(!backWood.equals(guitar.getBackWood())))
                continue;

            //Guitar's topWood
            String topWood = guitar.getTopWood();
            if((topWood!=null)&&(!topWood.equals(""))&&(!topWood.equals(guitar.getTopWood())))
                continue;
        }
        return null;
    }

    public LinkedList searchForListOfGuitars(Guitar searchGuitar){
        LinkedList matchingGuitars = new LinkedList<>();

        for(Iterator it = setOfGuitars.iterator(); it.hasNext();){
            Guitar guitar=(Guitar) it.next();

            String builder = guitar.getBuilder();
            if((builder!=null)&&(!builder.equals(""))&&(!builder.toLowerCase().equals(guitar.getBuilder().toLowerCase())))
                continue;

            //Guitar's model
            String model = guitar.getModel();
            if((model!=null)&&(!model.equals(""))&&(!model.toLowerCase().equals(guitar.getModel().toLowerCase())))
                continue;

            //Guitar's type
            String type = guitar.getType();
            if((type!=null)&&(!type.equals(""))&&(!type.toLowerCase().equals(guitar.getType().toLowerCase())))
                continue;

            //Guitar's backWood
            String backWood = guitar.getBackWood();
            if((backWood!=null)&&(!backWood.equals(""))&&(!backWood.toLowerCase().equals(guitar.getBackWood().toLowerCase())))
                continue;

            //Guitar's topWood
            String topWood = guitar.getTopWood();
            if((topWood!=null)&&(!topWood.equals(""))&&(!topWood.toLowerCase().equals(guitar.getTopWood().toLowerCase())))
                continue;

            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
