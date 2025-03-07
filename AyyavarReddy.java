package Patterns.com;


public class AyyavarReddy {
	public static void main(String[] args) {

		for(int i = 1; i<=7; i++) {
			for(int j = 1; j<=5; j++) {
				//   * * *
				// *       *
				// *       *
				// * * * * *
				// *       *
				// *       *
				// *       *
				// *       *
				if((i==1&&j>=2&&j<=4)||(j==1&&i>=2)||(i==4&&j<=5)||(j==5&&i>=2)) {
					System.out.print("* ");  
				}                            
				else {
					System.out.print("  ");  
				}                            

			}   
			System.out.print("  ");
			for(int j = 1; j<=5; j++) {
				if((i==1&&j==1)||(i==1&&j==5)||(i==2&&j==1)||(i==2&&j==5)||(i==3&&j>=2&&j<=4)||(j==3&&i>=3)) {
					// *       *
					// *       * 
					//   * * *  
					//     *
					//     *
					//     *
					System.out.print("* ");
				}                       
				else {                        
					System.out.print("  "); 
				}                           
			}                               
			System.out.print("  ");       
			for(int j = 1; j<=5; j++) { 
				// *       *
				// *       * 
				//   * * *  
				//     *
				//     *
				//     *
				//     *
				if((i==1&&j==1)||(i==1&&j==5)||(i==2&&j==1)||(i==2&&j==5)||(i==3&&j>=2&&j<=4)||(j==3&&i>=3)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}

			}
			System.out.print("  ");
			for(int j = 1; j<=5; j++) {
				//   * * *
				// *       *
				// *       *
				// * * * * *
				// *       *
				// *       *
				// *       *
				// *       *
				if((i==1&&j>=2&&j<=4)||(j==1&&i>=2)||(i==4&&j<=5)||(j==5&&i>=2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}

			}
			System.out.print("  ");
			for(int j = 1; j<=5; j++) {
				//  *        *
				//  *        *
				//  *        *
				//  *        *
				//  *        *
				//    *    *
				//       *
				if((j==1&&i<=5)||(i==6&&j==2)||(i==6&&j==4)||(i==7&&j==3)||(j==5&&i<=5)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}

			}
			System.out.print("  ");
			for(int j = 1; j<=5; j++) {
				//   * * *
				// *       *
				// *       *
				// * * * * *
				// *       *
				// *       *
				// *       *
				// *       *
				if((i==1&&j>=2&&j<=4)||(j==1&&i>=2)||(i==4&&j<=5)||(j==5&&i>=2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}

			}
			System.out.print("  ");
			for(int j = 1; j<=5; j++) {
				// * * * *
				// *       *
				// *       *
				// * * * *
				// *   *
				// *     *
				// *       *
				if(j==1||(i==1&&j<=4)||(j==5&&i>=2&&i<=3)||(i==4&&j<=4)||(i-j==2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j = 1; j<=5; j++) {
				// * * * *
				// *       *
				// *       *
				// * * * *
				// *   *
				// *     *
				// *       *
				if(j==1||(i==1&&j<=4)||(j==5&&i>=2&&i<=3)||(i==4&&j<=4)||(i-j==2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}

			}
			System.out.print(" ");
			for(int j = 1; j<=5; j++) {
				//   * * * *
				// *
				// *
				// * * * * *
				// *
				// *
				//   * * * *
				if((i==1&&j>=2&&j<=5)||(j==1&&i>=2&&i<=6)||(i==4&&j<=5)||(i==7&&j>=2&&j<=5)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j = 1; j<=5; j++) {
				// * * *
				// *     *
				// *       *
				// *       *
				// *       *
				// *     *
				// * * *
				if(j==1||(i==1&&j<=3)||(i<=3&&j-i==2)||(i==4&&j==5)||(i>=5&&i+j==10)||(i==7&&j<=3)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j = 1; j<=5; j++) {
				// * * *
				// *     *
				// *       *
				// *       *
				// *       *
				// *     *
				// * * *
				if(j==1||(i==1&&j<=3)||(i<=3&&j-i==2)||(i==4&&j==5)||(i>=5&&i+j==10)||(i==7&&j<=3)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j = 1; j<=5; j++) {
				// *       *
				// *       * 
				//   * * *  
				//     *
				//     *
				//     *
				//     *
				if((i==1&&j==1)||(i==1&&j==5)||(i==2&&j==1)||(i==2&&j==5)||(i==3&&j>=2&&j<=4)||(j==3&&i>=3)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
