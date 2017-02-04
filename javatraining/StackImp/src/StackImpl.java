
import java.io.IOException;
/**
 * Created by swapanpreetkaur on 1/27/17.
 */
public class StackImpl {

    public int top=-1;
   // public int arr[];

    int arr[]=new int[5];
    //public int size=5;


   // StackImp(int size) {
     //   top = -1;
       // arr= new int[size];

    //}


     void push(int data) throws ArrayIndexOutOfBoundsException
    {
        if(top == arr.length-1)
        {
            System.out.println("overflow");
        }
        else
            arr[++top]=data;
        System.out.println("pushed element"+data);


    }


    int popItem() throws ArrayIndexOutOfBoundsException
    {
        if (top < 0) {
            System.out.println("underflow");
            return 0;
        } else {
            System.out.println("Pop Item : " + arr[top]);
            return arr[top--];


        }

    }}