package Homework_Day4;

public class Exercise_04 {
	
public static void main(String[]args) {
	//Question:for(int i=0;i<10; i++) {
	//if(i==n) {
	//flag=true;
	//break;
	//Answer: Data found
	int n =7;
	boolean flag = false;
	
	for(int i =0;i<10; i++) {
		if(i==n) {
		flag=true;
		break;
		}
	}
	
	if(flag) {
		System.out.println("Data found");
	}else {
		System.out.println("Data not found");
	}
	
	
}

}
