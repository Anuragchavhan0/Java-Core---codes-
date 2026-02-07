package DSA_QUETIONS;

public class QQ12_MissingNumber {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,5};
		int n = 5;
		int sum = n*(n+1)/2;

		int arrSum = 0;
		for(int i : a) arrSum += i;

		System.out.println("Missing number: " + (sum - arrSum));


	}

}
