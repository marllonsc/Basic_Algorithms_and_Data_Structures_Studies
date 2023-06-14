package com.cpq.helper;

public class App_5900AG5 extends CpqHelper{

	
	private static String and1 = execute("Global_SaaSESupport.Observability by Instana Infrastructure Quality Monitoring SaaS Managed Virtual Server Advanced Support",
			"Global_SaaSESupport:E0DV9ZX", 
			"ObservabilityByInstana.Infrastructure Quality Monitoring SaaS Managed Virtual Server", 
			"ObservabilityByInstana:InfrastructureQualityMonitoring");
	
	private static String  and2 = execute("Global_SaaSESupport.Instana Observability Managed Virtual Server Advanced Support",
			"Global_SaaSESupport:E0EG8ZX", 
			"ObservabilityByInstana.Application Performance Monitoring SaaS Managed Virtual Server", 
			"ObservabilityByInstana:ApplicationPerformanceMonitoring");
	
	private static String  result = or(and1, and2);
	
	private static String result2 = lt(getValueCheckBox("ObservabilityByInstana:InfrastructureQualityMonitoring"), "10");
	private static String result3 = lt(getValueCheckBox("ObservabilityByInstana:ApplicationPerformanceMonitoring"), "10");
	
	public static void main(String[] args) {
		//System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}
	
	
}
