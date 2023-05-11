package com.cpq.helper;

import java.util.ArrayList;
import java.util.List;

public class App extends CpqHelper{
	
	
	public static void main(String[] args) {
		
		//List<String> list = new ArrayList<>();
		
//		String and1 = generatCheck("Global_SaaSESupport.Trusteer Pinpoint Detect for Connections 100 Connections Subscription Advanced Support","Global_SaaSESupport:E0DVKZX","PinpointDetectOffering.Pinpoint Detect for Connections","PinpointDetectOffering:PinpointDetectforConnections");
//		String and2 = generatCheck("Global_SaaSESupport.Trusteer Pinpoint Detect Bundle Active User Advanced Support", "Global_SaaSESupport:E0DVLZX", "PinpointDetectOffering.Pinpoint Detect for Active Users", "PinpointDetectOffering:PinpointDetectBundle");
//		String and3 = generatCheck("Global_SaaSESupport.Trusteer Mobile Carrier Intelligence for Pinpoint Detect US 100 Connections Advanced Support", " Global_SaaSESupport:E0DVIZX", " PinpointDetectConnectionsOptions.Mobile Carrier Intelligence - US", "PinpointDetectConnectionsOptions:MobileCarrierIntelligenceUS");
//		String and4 = generatCheck("Global_SaaSESupport.Trusteer Mobile Carrier Intelligence for Pinpoint Detect Non US 100 Connections Advanced Support", "Global_SaaSESupport:E0DVJZX", "PinpointDetectConnectionsOptions.Mobile Carrier Intelligence - Non-US", "PinpointDetectConnectionsOptions:MobileCarrierIntelligenceNonUS");
//		String and5 = generatCheck("Global_SaaSESupport.Trusteer Rapport for Mitigation for Retail 100 Eligible Participants Advanced Support", "Global_SaaSESupport:E0DWCZX", "PinpointDetectConnectionsOptions.Rapport for Mitigation", "PinpointDetectConnectionsOptions:RapportforMitigation");
//		
//		String checking = or(and1, or(and2, or(and3, or(and4, and5))));
//		
//		//System.out.println(or);
//		System.out.println(checking);
		
	
		String and1 = generatCheck("Global_SaaSESupport.QRadar Suite - EDR Enterprise as a Service Client Device Advanced Support", "Global_SaaSESupport:E0DZ3ZX", "ReaQTAServiceOffering.QRadar Suite - EDR Enterprise", "ReaQTAServiceOffering:ReaQTAEnterpriseasaServicev3");
		String and2 = generatCheck("Global_SaaSESupport.QRadar Suite - EDR Client Device Advanced Support", "Global_SaaSESupport:E0DZ4ZX", "ReaQTAServiceOffering.QRadar Suite - EDR", "ReaQTAServiceOffering:ReaQTAasaServicev3");
		String and3 = generatCheck("Global_SaaSESupport.QRadar Suite - EDR Essential Managed Detection and Response Client Device Advanced Support", "Global_SaaSESupport:E0DYZZX", "ReaQTAServiceMDR.QRadar Suite - Managed Detection and Response (MDR)", "ReaQTAServiceMDR:EssentialManagedDetectionandResponsev3");
		
		String checking = or(and1, or(and2, and3));
		
		
		System.out.println(checking);
		
	}

	private static String generatCheck(String globalSlect, String globalValue, String attSelect, String attValue) {
		String and1 = and(isSelected(globalSlect),isSelected(attSelect));
		String and2 = and(isSelected(globalSlect),not(isSelected(attSelect)));
		String or = or(and1,and2);
		return and( or ,neq(getValueCheckBox(attValue), getValueCheckBox(globalValue)));
	}
	
	//private static void addItem(List<String> list);

}
