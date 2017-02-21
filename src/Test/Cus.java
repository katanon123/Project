package Test;

import java.util.Scanner;
public class Cus {
  public static void main(String[] args) {
     int order = 0, price = 0;
     int discount = 0, net = 0;
     int customer = 0;
     
     Scanner oj = new Scanner(System.in);
     System.out.print("ลูกค้าคนที่   = ");
     customer = oj.nextInt();
     System.out.print("จำนวนที่ซื้อ =  ");
     order = oj.nextInt();
     System.out.print("จำนวนเงิน = ");
     price = oj.nextInt();
     //  ***ลูกค้าคนที่  1*** //  
     
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
   
     System.out.println("เลินที่ลด  = " + discount+ "บาท");
     System.out.println("ลูกค้าA จำนวนเงินที่ต้องจ่าย = " + net + "บาท");
	
     
        
        //  ***ลูกค้าคนที่ิ 2 *** //  
        
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
	  System.out.println("เลินที่ลด  = " + discount+ "บาท");
      System.out.println("ลูกค้า B จำนวนเงินที่ต้องจ่าย = " + net + "บาท");
	
      
      //  ***ลูกค้าคนที่  3*** //  
      
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
	  System.out.println("เลินที่ลด  = " + discount+ "บาท");
      System.out.println("ลูกค้าคนที่  C จำนวนเงินที่ต้องจ่าย = " + net + "บาท");
	
  }else{
	  System.out.println("ไม่มีลูกค้าดังกล่าว");
	  
	  
  }
}
}	  
	 
	  