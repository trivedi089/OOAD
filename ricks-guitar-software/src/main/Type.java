package main;

public enum Type {
    ACOUSTIC, ELECTRIC;
    public String toString(){
        switch (this){
            case ACOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
        }
        return "No Type Mathches";//if not write this, it will throw NullPointerException
    }
}
