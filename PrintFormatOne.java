package printFormatOne;

public class PrintFormatOne {
	public static void main(String [] args) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<9;j++) {
				if(j==2*i || j==8-2*i) {
					System.out.print("*");
				}
				else if(j<8-2*i) {
					System.out.print("_");
				}
			}
			System.out.println();
		}
		
		for(int i=2;i>0;i--) {
			for(int j=0;j<9;j++) {
				if(j==4+2*(3-i) || j==4-2*(3-i)){
					System.out.print("*");
				}
				else if(j<4+2*(3-i)) {
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}
}
