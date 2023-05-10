package com.cpq.helper;

public class App extends CpqHelper{
	
	
	public static void main(String[] args) {
		
		String checking = ""+and(
				and(isSelected("Global_SaaSESupport.MQ on Cloud Virtual Processor Core Advanced Support"),
						anySelect("MQonCloudOffering")),neq(getValueRadio("MQonCloudOffering"), getValueCheckBox("Global_SaaSESupport:E0DUVZX")));
		
		
		System.out.println(checking);
		
	}

}
