package DSA_QUETIONS;

public class Q8_DistinctArray {

	public static void main(String[] args) {
		//unique elements || not printing duplicate elements 
		int a[] = {1,2,2,3,4,4};
		
		for(int i=0;i<a.length;i++){
		    boolean isDuplicate = false;
		    for(int j=0;j<i;j++){
		        if(a[i]==a[j]){
		            isDuplicate = true;
		            break;
		        }
		    }
		    if(!isDuplicate)
		        System.out.print(a[i]+" ");
		}

	}

}
