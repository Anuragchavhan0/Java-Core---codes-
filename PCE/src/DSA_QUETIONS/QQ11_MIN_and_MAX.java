package DSA_QUETIONS;

public class QQ11_MIN_and_MAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {34,54,32,5,6,7,44,7,4,3,2};
		int min = a[0], max = a[0];

		for(int i=1;i<a.length;i++){
		    if(a[i]<min) min = a[i];
		    if(a[i]>max) max = a[i];

		}
		System.out.println(max);
		System.out.print(min);

	}

}
