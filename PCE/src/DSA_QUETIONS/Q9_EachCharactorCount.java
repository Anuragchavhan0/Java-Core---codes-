package DSA_QUETIONS;

public class Q9_EachCharactorCount {

	public static void main(String[] args) {
		
		String s = "java";
		int count[] = new int[256];

		for (int i = 0; i < s.length(); i++) {
		    count[s.charAt(i)]++;
		}

		for (int i = 0; i < 256; i++) {
		    if (count[i] > 0)
		        System.out.println((char)i + " : " + count[i]);
		}


	}

}
