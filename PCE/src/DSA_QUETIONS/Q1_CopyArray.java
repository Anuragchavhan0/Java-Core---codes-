package DSA_QUETIONS;

public class Q1_CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10, 20 , 30 ,40 };
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}

		        System.out.println("Copied Array:");
		        for (int i = 0; i < b.length; i++) {
		            System.out.print(b[i] + " ");
		        }
		    }
		

	

}
