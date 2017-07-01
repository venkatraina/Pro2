package guvi;

import java.util.Scanner;

public class DeletingDigit {

	public static void main(String[] args) {
		int n;
		int temp=0;
		int k;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		k=in.nextInt();
		int d=(int)Math.log10(n)+1;
		int s=d-k;
		int[] ar=new int[d];
		for(int i=0;i<ar.length;i++){
			ar[i]=n%10;
			n/=10;
		}for(int j=0;j<ar.length;j++){
			for(int p=ar.length-1;p>j;p--){
				if(ar[j]>ar[p]){
					temp=ar[p];
					ar[p]=ar[j];
					ar[j]=temp;
				}
			}	
		}if(s!=0){
			System.out.print("The Smallest value after deleting "+k+" digits from number: ");
			for(int j=0;j<s;j++){
				System.out.print(ar[j]);
			}
		}else{
			System.out.print("Not valid");
		}

	in.close();

	}

}
