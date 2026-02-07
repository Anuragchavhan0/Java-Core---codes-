package DSA_QUETIONS;

public class Q6_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {45,644,777,22,44,556,};
		for (int i = 1; i < a.length; i++) {
		    int key = a[i];
		    int j = i - 1;
		    while (j >= 0 && a[j] > key) {
		        a[j + 1] = a[j];
		        j--;
		    }
		    a[j + 1] = key;
		    
		}
		

	}

}
