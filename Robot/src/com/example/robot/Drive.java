package com.example.robot;

public class Drive implements Runnable{

	@Override
	public void run() {
		int n=0;
		while(n>10){
		try {
			MainActivity.driveCM(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			MainActivity.driveANGLE(90);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		n++;
	}

}
