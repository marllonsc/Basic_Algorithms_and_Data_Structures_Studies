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
	
	public static String eval(String string) {
		return "<* Eval("+string+")*>";
	}
	
	public static String if_condition(String condition, String positive, String negative) {
		return "[IF]( "+condition+" ){"+positive+"}"+ ((negative != null && negative.isEmpty()) ? "{"+negative+"}[ENDIF]" : "[ENDIF]");
	}
	
	public static String geq(String value01, String value02) {
		return "[GEQ]("+value01+","+value02+")";
	}
	
	public static String gt(String value01, String value02) {
		return "[GT]("+value01+","+value02+")";
	}
	
	public static String lt(String value01, String value02) {
		return "[LT]("+value01+","+value02+")";
	}
	
	public static String leq(String value01, String value02) {
		return "[LEQ]("+value01+","+value02+")";
	}
	
	public static String like(String value01, String value02) {
		return "[LIKE]("+value01+","+value02+")";
	}
	
	
	public static String execute(String globalSlect, String globalValue, String attSelect, String attValue) {
		String and1 = and(isSelected(globalSlect),isSelected(attSelect));
		String and2 = and(isSelected(globalSlect),not(isSelected(attSelect)));
		String or = or(and1,and2);
		return and( or ,neq(getValueCheckBox(attValue), getValueCheckBox(globalValue)));
	}
	

}
