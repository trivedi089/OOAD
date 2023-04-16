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
    public void addGuitars(String serialName,double price,Builder builder, String model, Type type, Wood backWood, Wood topWood){
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
    //Now we have moved the types,builders and Wood to enum constants to make searching easier
    //Now no case sensitive issues will affect the searching
    public Guitar search(Guitar searchGuitar){
        for(Iterator it = setOfGuitars.iterator(); it.hasNext();){
            Guitar guitar = (Guitar)it.next();  //typecast is necessary because it returns an object of type Object, which is the most general type of object in Java. You then need to cast this object to the specific type of object you're working with, in this case Guitar.


            //Guitar's builder
            Builder builder = guitar.getBuilder();
            if((builder!=null)&&(!builder.equals(""))&&(!builder.equals(guitar.getBuilder())))
                continue;

            //Guitar's model
            String model = guitar.getModel();
            if((model!=null)&&(!model.equals(""))&&(!model.equals(guitar.getModel())))
                continue;

            //Guitar's type

            Type type = guitar.getType();
            if((type!=null)&&(!type.equals(""))&&(!type.equals(guitar.getType())))
                continue;

            //Guitar's backWood
            Wood backWood = guitar.getBackWood();
            if((backWood!=null)&&(!backWood.equals(""))&&(!backWood.equals(guitar.getBackWood())))
                continue;

            //Guitar's topWood
            Wood topWood = guitar.getTopWood();
            if((topWood!=null)&&(!topWood.equals(""))&&(!topWood.equals(guitar.getTopWood())))
                continue;

            return guitar;
        }
        return null;
    }
}
