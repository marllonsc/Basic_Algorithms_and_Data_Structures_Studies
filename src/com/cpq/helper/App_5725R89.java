package com.cpq.helper;

public class App_5725R89 extends CpqHelper{
	
	public static void main(String[] args) {
		
//		String and1 = generatCheck("Global_SaaSESupport.Trusteer Pinpoint Detect for Connections 100 Connections Subscription Advanced Support",
//				"Global_SaaSESupport:E0DVKZX", 
//				"PinpointDetectConnections.Pinpoint Detect for Connections", 
//				"PinpointDetectConnections:PinpointDetectforConnections");
		
//		String and2 = generatCheck("Global_SaaSESupport.Trusteer Pinpoint Detect Bundle Active User Advanced Support",
//				"Global_SaaSESupport:E0DVLZX", 
//				"PinpointDetectBundle.Pinpoint Detect Bundle", 
//				"PinpointDetectBundle:PinpointDetectBundle");
//		
		String and3 = generatCheck("Global_SaaSESupport.Trusteer Mobile Carrier Intelligence for Pinpoint Detect Non US 100 Connections Advanced Support",
				"Global_SaaSESupport:E0DVJZX", 
				"PinpointDetectConnectionsOptions.Mobile Carrier Intelligence - Non-US", 
				"PinpointDetectConnectionsOptions:MobileCarrierIntelligenceNonUS");
		
		String and4 = generatCheck("Global_SaaSESupport.Trusteer Mobile Carrier Intelligence for Pinpoint Detect US 100 Connections Advanced Support",
				"Global_SaaSESupport:E0DVIZX", 
				"PinpointDetectConnectionsOptions.Mobile Carrier Intelligence - US", 
				"PinpointDetectConnectionsOptions:MobileCarrierIntelligenceUS");
//		
//		String and5 = generatCheck("Global_SaaSESupport.Trusteer Pinpoint Detect for Connections 100 Connections Subscription Advanced Support",
//				"Global_SaaSESupport:E0DVKZX", 
//				"PinpointDetectConnectionsOptions.Pinpoint Detect for Connections", 
//				"PinpointDetectConnectionsOptions:PinpointDetectforConnections");
//		
//		String and6 = generatCheck("Global_SaaSESupport.Trusteer Pinpoint Detect Standard Premium Support 10 Eligible Participants Advanced Support",
//				"Global_SaaSESupport:E0DV3ZX", 
//				"PinpointDetectEPAddonsBusiness.Premium Support", 
//				"PinpointDetectEPAddonsBusiness:PremiumSupport");
//		
//		String and7 = generatCheck("Global_SaaSESupport.Trusteer Pinpoint Detect Standard for Retail Premium Support 100 Eligible Participants Advanced Support",
//				"Global_SaaSESupport:E0DV2ZX", 
//				"PinpointDetectEPAddonsRetail.Premium Support", 
//				"PinpointDetectEPAddonsRetail:PremiumSupport");
//		
//		String and8 = generatCheck("Global_SaaSESupport.Trusteer Rapport for Mitigation for Retail 100 Eligible Participants Advanced Support",
//				"Global_SaaSESupport:E0DWCZX", 
//				"PinpointDetectEPAddonsRetail.Rapport for Mitigation", 
//				"PinpointDetectEPAddonsRetail:RapportforMitigation");
//		
//		String and9 = generatCheck("Global_SaaSESupport.Trusteer New Account Fraud for Retail 10 API Calls Advanced Support",
//				"Global_SaaSESupport:E0DV6ZX", 
//				"PinpointDetectEPOptionalProductsBusiness.New Account Fraud", 
//				"PinpointDetectEPOptionalProductsBusiness:NewAccountFraud");
//		
//		
//		String and10 = generatCheck("Global_SaaSESupport.Trusteer New Account Fraud for Business 10 API Calls Advanced Support",
//				"Global_SaaSESupport:E0DV7ZX", 
//				"PinpointDetectEPOptionalProductsRetail.New Account Fraud", 
//				"PinpointDetectEPOptionalProductsRetail:New Account Fraud");
//		
//		
//		String and11 = generatCheck("Global_SaaSESupport.Trusteer New Account Fraud for Business 10 API Calls Advanced Support",
//				"Global_SaaSESupport:E0DV7ZX", 
//				"PinpointDetectEPOptionalProductsRetail.New Account Fraud", 
//				"PinpointDetectEPOptionalProductsRetail:New Account Fraud");
		
		
		
		String and1 = generatCheck("Global_SaaSESupport.Trusteer Pinpoint Detect Bundle Active User Advanced Support",
				"Global_SaaSESupport:E0DVLZX", 
				"PinpointDetectOffering.Pinpoint Detect for Active Users", 
				"PinpointDetectOffering:PinpointDetectBundle");
		
		String and2 = generatCheck("Global_SaaSESupport.Trusteer Pinpoint Detect for Connections 100 Connections Subscription Advanced Support",
				"Global_SaaSESupport:E0DVKZX", 
				"PinpointDetectOffering.Pinpoint Detect for Connections", 
				"PinpointDetectOffering:PinpointDetectforConnections");
		
		String and5 = generatCheck("Global_SaaSESupport.Trusteer Rapport for Mitigation for Retail 100 Eligible Participants Advanced Support",
				"Global_SaaSESupport:E0DWCZX", 
				"PinpointDetectConnectionsOptions.Rapport for Mitigation", 
				"PinpointDetectConnectionsOptions:RapportforMitigation");
		
		
		String checking = or(and1, or(and2, or(and3, or(and4, and5))));
		
		System.out.println(checking);
		
	}
	
	private static String generatCheck(String globalSlect, String globalValue, String attSelect, String attValue) {
		String and1 = and(isSelected(globalSlect),isSelected(attSelect));
		String and2 = and(isSelected(globalSlect),not(isSelected(attSelect)));
		String or = or(and1,and2);
		return and( or ,neq(getValueCheckBox(attValue), getValueCheckBox(globalValue)));
	}

}
