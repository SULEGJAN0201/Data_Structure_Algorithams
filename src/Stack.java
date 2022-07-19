public class Stack {
    public static void main(String[] args) throws  StackEmptyException {
        StackArray S = new StackArray(5);
        S.display();
        System.out.println("Pushed Values");
        S.push(2);
        S.push(3);
        S.push(4);
        S.display();
        System.out.println("After POP");
        S.pop();
        S.display();
        S.isEmpty();
        System.out.println(S.peek());
//        try{
//            S.pop();
//        }catch (StackEmptyException e){
//            System.out.println(e);
//        }
//        other way to handle exception
    }
}
class StackArray {
    private int maxSize; //size of stack array
    private int[] stackData;
    private int top; //top of stack
    //-------------------------------------------------------------------------
    public StackArray(int s) {
        this.maxSize=s;
        this.stackData=new int[maxSize];
        this.top= -1;
    }
    public boolean isEmpty() {
        if (top>-1){
            System.out.println("Stack has values");
            return false;
        }
        return true;
    }
    public boolean isFull() {
        if (top==(maxSize-1)){
            return true;
        }
        return false;
    }
    public void push(int item) {
        if (isFull()){
            System.out.println("Stack is full");
        }
        this.stackData[top+1]=item;
        top++;
    }
    public int pop() throws  StackEmptyException {
          if (isEmpty()){
              throw new  StackEmptyException("Stack is empty");
              //or throw new Exception("Stack is empty")
          }
          int data =stackData[top];
          this.top = this.top-1;
          return data;
    }
    public int peek() throws  StackEmptyException {
        if (isEmpty()){
            throw new  StackEmptyException("Stack is empty");
            //or throw new Exception("Stack is empty")
        }
        int lastValue = this.stackData[top];
        return lastValue;
    }
    public void display() {
              if (isEmpty()){
                  System.out.println("Stack is empty.No values to show");
                  return;
              }
              for (int i=0;i<=top;i++){
                  System.out.println(stackData[i] + " ");
              }
    }
} //end class StackArray

class StackEmptyException extends Exception{
    public StackEmptyException(String message){
        super(message);
    }
}