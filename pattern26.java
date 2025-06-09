package Lec4;

public class pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n - 1;
		//add value
//		int val = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}

			// star
			int j = 1;
			int val = 1;
			while (j <= star) {
				//print counter val value
				System.out.print(val+ "\t");
				
//				Note: vertical mirroring in the pattern
				
				//mirror
				
				if(j<= star/2) {
				  val++;//value increasing before mirror
				}
				else {
					val--;// then value decreasing after mirror
				}
				j++;
			}

			// next line ki prep
			System.out.println();
			row++;
			star = star + 2;
			space = space - 1;
		}
	}

}
