package section05;

public class LoopHomework {
	public static void main(String[] args) {
		for (int i =0; i<7; i++) {
			for(int j = 0; j<7;j++) {
				
				if (i <7/2+1) {
					if(i+j <3) {
						System.out.print(" ");
					} else if(j-i>3) {
						System.out.print(" ");
					}
						else {
					System.out.print("*");
				}
			} else { 
				if(i-j > 3) {
					System.out.print(" ");
				} else if (i+j >9) {
				System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
				
			}
					
					
			
		
		System.out.println(); //개행 
		}
		
	}

}
