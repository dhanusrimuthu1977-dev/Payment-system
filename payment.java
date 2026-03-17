import java.util.ArrayList;  import java.util.Scanner; 
  interface Payment 
 {   void payAmount(double amount); 
 } 
 
 class UPIPayment implements Payment 
 { 
  public void payAmount(double amount) 
  { 
      System.out.println("Payment of 
Rs." + amount + " completed using 
UPI."); 
  } 
 }   class CardPayment implements Payment 
 { 
  public void payAmount(double amount) 
  { 
      System.out.println("Payment of 
Rs." + amount + " completed using 
Card."); 
  } 
 }   public class PaymentSystem 
 { 
  public static void main(String args[]) 
  { 
      Scanner sc = new 
Scanner(System.in); 
 
      ArrayList<String> 
transactionIds = new ArrayList<>();  
      System.out.println("------ 
Payment System ------"); 
 
      System.out.print("Enter 
Transaction ID: "); 
      String id = sc.nextLine(); 
       transactionIds.add(id);  
      System.out.print("Enter Amount: 
"); 
      double amount = sc.nextDouble();  
      System.out.println("Select Payment Method"); 
      System.out.println("1. UPI 
Payment"); 
      System.out.println("2. Card Payment");  
      System.out.print("Enter Choice: 
");       int choice = sc.nextInt();  
      Payment p; 
       if(choice == 1) 
      {           p = new UPIPayment(); 
      }       else       {           p = new CardPayment(); 
      } 
 
      p.payAmount(amount);  
      
System.out.println("\nTransaction IDs:");       for(String t : transactionIds) 
      { 
          System.out.println(t); 
      } System.out.println("\nTransaction IDs in Uppercase:"); 
      for(String t : transactionIds) 
      { 
          
System.out.println(t.toUpperCase()); 
      }        sc.close();   } 
 }