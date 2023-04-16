package main;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    LinkedList setOfGuitars;

    //In Java, a LinkedList is a generic class that can hold objects of any type
    public Inventory() {
        setOfGuitars = new LinkedList();
    }

    public GuitarSpec newGuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        GuitarSpec newGuitarSpec = new GuitarSpec(builder, model, type, backWood, topWood);
        return newGuitarSpec;
    }

    public void addNewGuitar(String serialName, Double price, GuitarSpec guitarSpec) {
        Guitar newGuitar = new Guitar(serialName, price, guitarSpec);
        setOfGuitars.add(newGuitar);
    }

    public List search(GuitarSpec searchGuitar) {
        List matchingGuitars = new LinkedList();

        for (Iterator it = setOfGuitars.iterator(); it.hasNext(); ) {

            Guitar guitar = (Guitar) it.next();
            GuitarSpec guitarSpec = guitar.getGuitarSpec();

            if (!guitarSpec.getBuilder().equals(searchGuitar.getBuilder()))
                continue;
            if (!guitarSpec.getModel().equals(searchGuitar.getModel()))
                continue;
            if (!guitarSpec.getType().equals(searchGuitar.getType()))
                continue;
            if (!guitarSpec.getTopWood().equals(searchGuitar.getTopWood()))
                continue;
            if (!guitarSpec.getBackWood().equals(searchGuitar.getBackWood()))
                continue;

            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
