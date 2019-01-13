package com.kh.silsub1.model;

import java.util.Random;

public class Sample {

	public void munjae1() {

		int[][] arr = new int[4][4];
		int xsum=0;
		int ysum=0;
		
		for(int i=0; i<arr.length; i++) {	
			xsum=0;

			for(int j=0; j<arr[i].length; j++) {

				if(j != arr.length-1) {
					arr[i][j]= new Random().nextInt(100)+1;
					xsum +=arr[i][j];

				}else {
					arr[i][j] =xsum;

				}

			}
		}

		for(int i=0; i<arr.length; i++) {
			ysum=0;
			for(int j=0; j<arr[i].length; j++) {
				if(j != arr.length-1) {
					ysum +=arr[j][i];				
				}else {
					arr[j][i] =ysum;
					
				}


			}	
		}
		arr[3][3] = 2*(arr[3][3]);

		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);

				if(j!= arr[i].length-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}

	}




}

