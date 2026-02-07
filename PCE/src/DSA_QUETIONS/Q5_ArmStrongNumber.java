package DSA_QUETIONS;

import java.util.Scanner;

public class Q5_ArmStrongNumber {

	public static void main(String[] args) {
		
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
	}

}
