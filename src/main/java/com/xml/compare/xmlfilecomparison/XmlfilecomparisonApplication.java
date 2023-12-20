package com.xml.compare.xmlfilecomparison;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;

@SpringBootApplication
public class XmlfilecomparisonApplication {

	public static void main(String[] args) throws FileNotFoundException, SAXException, IOException {
		SpringApplication.run(XmlfilecomparisonApplication.class, args);
		
		XMLComparator.xmlcompare();
		
	}
	

}
