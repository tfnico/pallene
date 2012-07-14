package com.tfnico.examples.building.pallene;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.tfnico.examples.building.methone.Methone;

public class Pallene {

	@Override
	public String toString() {
		return "pallene " + getVersion() + ", using methone" + new Methone().toString();
	}
	
	public String getVersion() {
		String file = getClass().getClassLoader().getResource("pallene-version.properties").getFile();
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(file);
			Properties props = new Properties();
			props.load(fileInputStream);
			return props.getProperty("version");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}	
}
