package com.cpq.helper;

public class App_5900AT2 extends CpqHelper{
	
	public static void main(String[] args) {
		
		String and1 = execute("Global_SaaSESupport.IBM Security Randori Recon Employee Advanced Support",
				"Global_SaaSESupport:E0ERIZX", 
				"SecurityRandoriRecon.IBM Security Randori Recon", 
				"SecurityRandoriRecon:SecRandoriReconQty");
		
		System.out.println(and1);
		
	}

}
