
package tampico;


public class singlyLinkedList {
    
    class Node {
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
            
        }
      }
       Node head;
       
       void add(int data){
           Node newNode = new Node(data);
            if (head== null){
                head = newNode;
                return;
            }
           Node current = head;
            while(current.next !=null){
                current = current.next;
            }  
            current.next =newNode;
           
       }  
            void display(){
         Node current = head;
           while (current !=null){
               System.out.println(current.data + " >");
                current = current.next;
           }
                System.out.println("null");
}         
        void displaynodes(){
            Node current = head;
               while (current != null){
                 System.out.println("Data; " + current.data);
                 System.out.println("Current pointers; " + current);
                 System.out.println("Next");
                      
               if (current.next !=null){
                 System.out.println(current.next);
              }else{
                 System.out.println("null");
                  }     
               current = current.next;
               }                
               
           }
        public static void main(String[] args){
           singlyLinkedList list = new singlyLinkedList();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            
             list.display();
             System.out.println(list.head);
             list.displaynodes();
      }
}   


      