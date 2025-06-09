package Lec3;

public class pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 1;
		int n = 5;
		
		while(row <= n) {
			
			int i = 1;
			while(i <= n) {
			System.out.print("* ");
			i++;
			
			int j = 1;
			while(j <= n) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			row ++;
			}
		}	
		
	}
}



