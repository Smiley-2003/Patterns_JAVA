package Lec3;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 7 ;
		int star = n/2;
		int space = 1;
		int row = 1;
			
		while(row <= n) {
//			Star
			
			 int i = 1;
	         while(i <= star) {
	        	 System.out.print("* ");
	        	 i++;
	         }
	         
//	           space
	         int j = 1;
	         while(j <= space) {
	        	 System.out.print("  ");
	        	 j++;
	         }
					
//			star
			 int k = 1;
	         while(k <= star) {
	        	 System.out.print("* ");
	        	 k++;
	         }
//			mirror
			if(row<n/2 + 1) {
				star--;
				space =  space + 2;
			}
			else {
				star++;
				space = space - 2;
			}
			System.out.println();
			row++;
		}
	}
}
