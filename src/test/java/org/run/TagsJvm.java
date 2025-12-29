package org.run;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class TagsJvm {
    public static void tagsReport(String path) {
    File f=new File("src\\test\\resources\\tagsjvm");
    
    Configuration c=new Configuration(f, "tag");
    c.addClassifications("windows ","11");
    c.addClassifications("tester","sathya");
    
    List<String> l=new LinkedList<String>();
    l.add(path);
    
    ReportBuilder r=new ReportBuilder(l, c);
    r.generateReports();
    
    
	}
}
