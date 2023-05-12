package com.cpq.helper;

public class App_5900AH7 extends CpqHelper{
	
	private static String and1 = execute("Global_SaaSESupport.Security Verify for Marketplaces Employees 100 Employees Advanced Support",
			"Global_SaaSESupport:E0ECKZX", 
			"IBMSecurityVerify.Employees", 
			"IBMSecurityVerify:Employees");
	
	private static String  and2 = execute("Global_SaaSESupport.Security Verify for Marketplaces Consumer Ten Thousand Eligible Participants Advanced Support", 
			"Global_SaaSESupport:E0ECLZX", 
			"IBMSecurityVerify.Consumer", 
			"IBMSecurityVerify:Consumer");
	
	private static String  result = or(and1, and2);
	
	public static void main(String[] args) {
		System.out.println(result);
	}

}
