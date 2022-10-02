package org.interview.progrm;

public class ArrayProgram {

	public static void main(String[] args) {
int a[][]=new int[2][3];
		//note: variable length has to mention properly.
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=40;	
	    a[1][0]=60;
	    a[1][1]=80;
	    a[1][2]=100;
	
	
	for (int i=0; i<2; i++) 
	for (int j=0;j<3; j++) 
	System.out.println(a[i][j]);
	
	int b[]=new int [5];
	b[0]=10;
	b[1]=12;
	b[2]=13;
	b[3]=14;
	b[4]=15;
	
	for(int x:b) {
		System.out.println(x);
	}
	
	
	

	}

}
