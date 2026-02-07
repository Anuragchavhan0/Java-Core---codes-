package DSA_QUETIONS;

public class Q7_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,4,554,565};
		for (int i = 0; i < a.length; i++) {
		    int min = i;
		    for (int j = i + 1; j < a.length; j++) {
		        if (a[j] < a[min])
		            min = j;
		    }
		    int temp = a[min];
		    a[min] = a[i];
		    a[i] = temp;
		    System.out.println(a[i]);
		}
		

	}

}
