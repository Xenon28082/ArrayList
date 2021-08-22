package main.java.com.jwd.structure;

import main.java.com.jwd.errors.ListOutOfBoundsError;

public class List {
    private Node startNode;
    private Node currentNode;
    private int size;


    public void print() {
        Node node = startNode;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void insert(String value) {

        Node node = new Node();
        node.value = value;

        if (startNode == null) {
            startNode = node;
            currentNode = startNode;
            size++;
            return;
        }
        size++;
        currentNode.next = node;
        currentNode = node;
    }

    public void delete(String value) {
        size--;
        if(startNode.value.equals(value)){
            startNode = startNode.next;
        }
        Node current = startNode;
        while(current.next != null){
            if(current.next.value.equals(value)){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("There is no such element");
    }

    public String get(int index){

        if(index >= size){
            new ListOutOfBoundsError().printException();
            return null;
        }
        try {
            Node current = startNode;
            int i = 0;
            while (current.next != null || i < index) {
                i++;
                current = current.next;
            }
            return current.value;
        }catch (ListOutOfBoundsError e){
            e.printException();
        }
        return null;
    }

    public int getSize() {
        return size;
    }
}
