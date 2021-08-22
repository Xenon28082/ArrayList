package main.java.com.jwd;

import main.java.com.jwd.structure.List;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        List list = new List();
        list.insert("My");
        list.insert("Name");
        list.insert("Is");
        list.insert("Mud");
        list.print();
        list.delete("Mud");
        list.print();
        System.out.println(list.get(2));
    }
}
