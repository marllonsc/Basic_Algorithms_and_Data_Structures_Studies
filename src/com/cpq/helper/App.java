package com.cpq.helper;

public class App extends CpqHelper{
	
	
	/*
	 * 
	 [AND]([AND](<*ATTSEL(MQonCloudOffering)*>,
	<*ISSELECTED(Global_SaaSESupport.MQ on Cloud Virtual Processor Core Advanced Support)*>),
	[NEQ](<*QUANTITY(MQonCloudOffering)*>,<*GETATVQTY(Global_SaaSESupport:E0DUVZX)*>))
	 
	 */
	public static void main(String[] args) {
		
		String checking = ""+and(
				and(isSelected("Global_SaaSESupport.MQ on Cloud Virtual Processor Core Advanced Support"),
						anySelect("MQonCloudOffering")),neq(getValueRadio("MQonCloudOffering"), getValueCheckBox("Global_SaaSESupport:E0DUVZX")));
		
		
		System.out.println(checking);
		
	}

}
