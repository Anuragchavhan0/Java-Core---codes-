package DSA_QUETIONS;

public class Q2_ElementPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40};
		int b = 30;
		boolean found= false;
		for(int i=0;i<a.length;i++) {
			if(b==a[i] ){
				
				found=true;
				break;	
			}
		}
			
			if(found==true) {
				System.out.println(" present ");
			}
			else {
				System.out.println("  Not present ");
			}
		
	}

}
