package com.ourownjava.unit.under.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;

public class PropertyLoaderTest {

	private static Properties properties;
	
	@BeforeClass
	public static void initPropertyFile() throws IOException{
		properties = new Properties();
		properties.load(new FileInputStream(new File("src/test/resources/test.properties")));
	}
	
	@Test
	public void shouldGetValueForKey1(){
		assertEquals("one", properties.get("1"));
	}
	
	@Test
	public void shouldGetValueForKey2(){
		assertEquals("two", properties.get("2"));
	}
}
