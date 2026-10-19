/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5;
import java.util.Scanner; 
/**
 *
 * @author Admin
 */
public class Activity5 {
    public static void main(String args[]){
      Scanner scan = new Scanner (System.in);
          String name = "";
             System.out.print("enter name: ");
                name = scan.nextLine();
         
          int age = 0;
            System.out.print("enter age: ");
               age = scan.nextInt();
         
         System.out.println("Hi," + name + "You are " + age + "years old.");
         
    }
}
