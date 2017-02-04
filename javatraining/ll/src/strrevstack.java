/**
 * Created by swapanpreetkaur on 2/4/17.
 */

class stackimpl {

    int stacksize;
    char[] stackarr;
    int top;

    public stackimpl(int size) {
        this.stacksize = size;
        this.stackarr = new char[stacksize];
        this.top = -1;
    }

    public void push(char entry) {
        this.stackarr[++top] = entry;
    }

    public char pop() {
        char entry = this.stackarr[top--];
        return entry;
    }

    public char top1() {
        return stackarr[top];
    }


    public boolean isStackEmpty() {
        return (top == -1);
    }

    public boolean isStackFull() {
        return (top == stacksize - 1);
    }
}


//string reverse

public class strrevstack {


    public String reversestr(String word){

   StringBuilder sb = new StringBuilder();
int size = word.length();
stackimpl stack = new stackimpl(size);
for(int i=0;i<size;i++){
stack.push(word.charAt(i));
}

while(!stack.isStackEmpty()){
sb.append(stack.pop());
}
return sb.toString();
        }
    public static void main(String a[]){
strrevstack rs = new strrevstack();
System.out.println("swapan == "+rs.reversestr("swapan"));
System.out.println("preet== "+rs.reversestr("preet"));
System.out.println("kaur == "+rs.reversestr("kaur"));
}
    }


