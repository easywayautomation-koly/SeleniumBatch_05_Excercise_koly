package Homework_Day4;

public class Exercise_07 {
	
	public static void main(String[]args) {
	//Question:	finalValue=A[i];
    //Answer:3,5,5
		
	int[]A= {1,3,5,5,6};
	int i=0;
	int finalValue=0;
	for(i = 0; i < A.length; i++) {
		if(A[i]==3 || A[i]==5) {
			finalValue=A[i];
			continue;
		}
	}
		
	System.out.println(finalValue);	
	}

}
