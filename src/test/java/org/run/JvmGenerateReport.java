package org.run;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JvmGenerateReport {

	public static void generateReport(String path) {
		File f=new File("src\\test\\resources\\Jvm");
		
		Configuration c=new Configuration(f, "json1");
		c.addClassifications("windows", "10");
		
		List<String> l=new LinkedList<String>();
		l.add(path);
		
		ReportBuilder r =new ReportBuilder(l, c);
		r.generateReports();
		
		
	}
}
