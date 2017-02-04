/**
 * Created by swapanpreetkaur on 1/27/17.
 */
public class StackClient {

    public static void main(String[] args) {

       try{
        StackImpl stk = new StackImpl();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        //stk.push(6);
        stk.popItem();
        stk.popItem();
        stk.popItem();
        stk.popItem();
        stk.popItem();
        stk.popItem();}

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("caught");
        }

    }

}



make list of department in company client

        company
list<dept>depts=new arraylis<>()

dept d1=new dept()


d1.setid;
d1.setname

depts.add(d1);
depts.add(d2);

c1.setdepts(depts)