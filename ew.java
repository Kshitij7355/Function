package Function;

import java.util.Scanner;

public class ew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			for(int  j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					
				}
			}
			if(count>=n/2) {
				System.out.println(arr[i]);
				break;
				
			}
		}

	}

}
