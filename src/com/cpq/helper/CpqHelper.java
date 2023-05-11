package com.cpq.helper;

public class CpqHelper {
	
	public static String anySelect(String AttName) {
		return "<*ATTSEL("+AttName+")*>";
	}
	
	public static String neq(String value01, String value02) {
		return "[NEQ]("+value01+","+value02+")";
	}
	
	public static String eq(String value01, String value02) {
		return "[EQ]("+value01+","+value02+")";
	}
	
	public static String isSelected(String att_field) {
		return "<*ISSELECTED("+att_field+")*>";
	}
	
	public static String getValueCheckBox(String att_field) {
		return "<*GETATVQTY("+att_field+")*>";
	}
	
	public static String getValueRadio(String AttName) {
		return "<*QUANTITY("+AttName+")*>";
	}
	
	public static String and(String check01, String check02) {
		return "[AND]("+check01+","+check02+")";
	}
	
	public static String or(String check01, String check02) {
		return "[OR]("+check01+","+check02+")";
	}
	
	public static String not(String check) {
		return "[NOT]("+check+")";
	}

}
