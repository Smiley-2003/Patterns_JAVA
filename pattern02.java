package Lec3;

import java.util.*;

public class pattern02 {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int i = 0;
      int row = 0;
      while(row <= n) {
      if(i<=n) {
    	 System.out.print("* "); 
    	 i++;
    	 }
      
      int j = 1;
      while(j < i) {
    	  System.out.print("* ");
    	  j++;
      }
     
      System.out.println();
      row++;
	}
      sc.close();
	}
}
