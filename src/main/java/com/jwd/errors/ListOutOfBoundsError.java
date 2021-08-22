package main.java.com.jwd.errors;

public class ListOutOfBoundsError extends Error{
    public void printException(){
        System.out.println("Index out of bounds; Change value;");
    }
}
