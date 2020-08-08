package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogCapture {
	
	public static void takeLog(String Classname,String Message)
	{
		DOMConfigurator.configure("../Project11_KeyDrivenFramework/Layout.xml");
		Logger l = Logger.getLogger(Classname);
		l.info(Message);
	}
	

}
