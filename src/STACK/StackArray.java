package STACK;

public class StackArray {
    
    private int[] stack;
    private int top;
    private int capacity;
    
    public StackArray (int capacity){
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }
    
    public static void main(String[] args){     
        
        StackArray stack = new StackArray(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println();
        
        stack.display();
        
        System.out.println();
        
        System.out.println("Top element: " + stack.peek());
        
        System.out.println();
       
        System.out.println("Removed: " + stack.pop());
        
        System.out.println();
        
        System.out.println("Top element: " + stack.peek());
        
        System.out.println();
        
        stack.display();
    }
      public void push(int value){
            if (isFull()){
                System.out.println("Stack Overflow!!");
                return;
            }
            top++;
            stack[top]= value;
            
            System.out.println(value + "pushed into the stack");
        }
      
      public int peek(){
          if (isEmpty()){
              System.out.println("Stack is Empty");
              return -1;
              
          }
          return stack[top];
      }
      
      public boolean isEmpty(){
          return top == -1;
      }
      
       public boolean isFull(){
          return top == capacity -1;
      }
       
      public void display(){
          if (isEmpty()){
              System.out.println("Stack is Empty");
              return;
          }
          System.out.println("Stack Elements");
          
          for(int i = 1; i>= 0; i--){
          System.out.println(stack[i]);
        }
      }
      
      public int pop(){
          
          if(isEmpty()){
              System.out.println("Stack Undeflow!");
              return -1;
          }
          int value = stack[top];
          top--;
          
          return value;
      }
} 
