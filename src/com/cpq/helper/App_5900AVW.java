package com.cpq.helper;

public class App_5900AVW extends CpqHelper{
	
	public static void main(String[] args) {
		System.out.println(execute());
	}
	
	public static String execute(){
		return and(not(anySelect("AIOpsInsightsBase")),anySelect("AIOpsInsightsAddOn"));
	}

}
