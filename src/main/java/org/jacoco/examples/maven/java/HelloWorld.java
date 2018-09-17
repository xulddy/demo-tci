package org.jacoco.examples.maven.java;

public class HelloWorld {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "xin chao Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}
