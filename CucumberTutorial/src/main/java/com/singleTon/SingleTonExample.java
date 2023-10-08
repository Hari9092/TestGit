package com.singleTon;

public class SingleTonExample{
	
	private static SingleTonExample singleObject;
	
	private SingleTonExample() {}
	
	public static SingleTonExample getInstance() {
		
		if(singleObject==null) {
			singleObject= new SingleTonExample();
			
		}
		return singleObject;
	}
	
	
}