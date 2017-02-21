package Test;

import java.util.Scanner;
public class Cus {
  public static void main(String[] args) {
     int order = 0, price = 0;
     int discount = 0, net = 0;
     int customer = 0;
     
     Scanner oj = new Scanner(System.in);
     System.out.print("Input Customer :   = ");
     customer = oj.nextInt();
     System.out.print("Input Number =  ");
     order = oj.nextInt();
     System.out.print("Input Price = ");
     price = oj.nextInt();
     //  Customer 1 *** //  
     
    if(customer==1){
     if (order < 10)
        {
        price = price * order;
        net = price;
        }
     else if (order  < 100)
        {
        price = price * order;
        discount = price * 5 / 100;
        net = price-discount;
        }
     else
        {
        price = price * order;
        discount = price * 10 / 100;
        net = price-discount;
        }
   
   System.out.println(" discount  = " + discount+ " Baht");
      System.out.println("Customer A Pay = " + net + " Baht");
	
     
        
        //  *** Customer 2 *** //  
        
  }else if (customer==2){
	  if (order < 10)
      {
      price = price * order;
      discount = price * 5/ 100;
      net = price-discount;
      }
   else if (order  < 100)
      {
      price = price * order;
      discount = price *15 / 100;
      net = price-discount;
      }
   else
      {
      price = price * order;
      discount = price * 25 / 100;
      net = price-discount;
      }
	  System.out.println(" discount  = " + discount+ " Baht");
      System.out.println("Customer B Pay = " + net + " Baht");
	
      
      //  *** Customer  3 *** //  
      
  }else if (customer==3){
	  if (order < 10)
      {
      price = price * order;
      net = price;
      }
   else if (order  < 100)
      {
      price = price * order;
      discount = price *20 / 100;
      net = price-discount;
      }
   else
      {
      price = price * order;
      discount = price * 25 / 100;
      net = price-discount;
      }
	  System.out.println(" discount  = " + discount+ " Baht");
      System.out.println("Customer C Pay = " + net + " Baht");
	
  }else{
	  System.out.println(" No  Customer ");
	  
	  
  }
}
}	  
	 
	  
