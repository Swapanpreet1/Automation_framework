package com.ll.linklist;

/**
 * Created by swapanpreetkaur on 2/4/17.
 */

class middlele
{
    struct head;
    class struct{
        int data;
        struct next;
        struct (int d)
        {
            data = d;
            next = null;
        }}

    void middle()
    {
        struct ptr1 = head;
        struct ptr2 = head;
        if (head != null)
        {
            while (ptr2!= null && ptr2.next != null)
            {
                ptr2 =ptr2.next.next;
                ptr2 = ptr1.next;
            }
            System.out.println("middle elem"  + ptr1.data  );
        }
    }
    public void insert(int data)
    {

        struct node = new struct(data);
        struct.next= head;
        head = node;
    }
    public void printlist()
    {
        struct tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String [] args)
    {
         middlele l1 = new middlele();
        for (int i=10; i>0; --i)
        {
            l1.insert(i);
            l1.printlist();
            l1.middle();
        }
    }
}
