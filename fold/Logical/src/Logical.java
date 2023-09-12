import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class Logical {
	
	public void getReverse(int[] arrays) {
		
		System.out.println("***-Before Reverse=>");
		System.out.println(Arrays.toString(arrays));
		List<int[]> list = Arrays.asList(arrays);
		
		Collections.reverse(list);
		Integer[] arr= (Integer[]) list.toArray();
		System.out.println("***-After Reverse=>");
		System.out.println(Arrays.toString(arr));
	}
	

	
	public static void main(String[] arg) {
		
		int[] value = {1,2,3,4,5,6,8,7,9};
		
		Logical logical=new Logical();
		
		logical.getReverse(value);
	}
	
	
}