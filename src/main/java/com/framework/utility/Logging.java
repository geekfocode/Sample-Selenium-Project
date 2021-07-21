package com.framework.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logging {

	public static Logger log() {
	Logger logger = Logger.getLogger("trial");
	PropertyConfigurator.configure("log4j.properties");
	return logger;
	}
}
