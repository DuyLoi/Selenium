package com.tpb.bot;

import java.time.LocalTime;

public class Hello {
	public void HelloWorld(){
		String a = "09:07:00:00";
		String b = "09:10:00:00";
		LocalTime aaa = java.time.LocalTime.now();
		//Date d=new Date();
		//System.out.println("thread is running..."+d);
		//System.out.println(java.time.LocalDateTime.now());
		while(b.equals(aaa.toString())){
			aaa=java.time.LocalTime.now();
			if(a.equals(aaa)){
				System.out.println(aaa);
			}
		}
		
	}

}
