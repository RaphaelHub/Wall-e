package com.example.robot;

import android.widget.TextView;

public class Read implements Runnable {

	private Controller controller;

	public Read(Controller controller) {
		this.controller = controller;
	}

	@Override
	public void run() {
		// while(true){
		String string = MainActivity.comReadWrite(new byte[] { 'q', '\r', '\n' });
		String[] arr = string.split(" ");
		int [] sensor = new int [arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			sensor[i] = Integer.parseInt(arr[i],16);
		}
		
		int links = sensor[2];
		int rechts = sensor[4];
		int mitte = sensor[3];
		
		if (links != 0 || rechts != 0 || mitte != 0) {
			MainActivity.comReadWrite(new byte[] { 's', '\r', '\n' });
			controller.setStatus(true);
		}
		

		/*
		try {
			Thread.sleep(5000);	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MainActivity.comReadWrite(new byte[] { 's', '\r', '\n' });

		controller.setStatus(true);
		// }*/

	}

}