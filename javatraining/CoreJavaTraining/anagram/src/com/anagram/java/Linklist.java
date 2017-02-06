package com.anagram.java;

/**
 * Created by swapanpreetkaur on 2/6/17.
 */
public class Linklist
{


    int data1;
    double data2;
    Linklist nextLink;


    public LinkList(int d1, double d2) {
        data1 = d1;
        data2 = d2;
    }

    public void printLink() {
        System.out.print("{" + data1 + ", " + data2 + "} ");
    }
}

class LinkList {
    private Linklist first;

    //LinkList constructor
    public LinkList() {
        first = null;
    }

    //Returns true if list is empty
    public boolean isEmpty() {
        return first == null;
    }

    //Inserts a new Link at the first of the list
    public void insert(int d1, double d2) {
        Linklist link = new Linklist(d1, d2);
        link.nextLink = first;
        first = link;
    }

    //Deletes the link at the first of the list
    public Linklist delete() {
        Linklist temp = first;
        first = first.nextLink;
        return temp;
    }

    //Prints list data
    public void printList() {
        Linklist currentLink = first;
        System.out.print("List: ");
        while(currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }
}

class LinkListTest {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.insert(1, 1.01);
        list.insert(2, 2.02);
        list.insert(3, 3.03);
        list.insert(4, 4.04);
        list.insert(5, 5.05);

        list.printList();

        while(!list.isEmpty()) {
            Linklist deletedLink = list.delete();
            System.out.print("deleted: ");
            deletedLink.printLink();
            System.out.println("");
        }
        list.printList();
    }
}

 {
}
