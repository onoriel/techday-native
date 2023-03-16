package com.atsistemas.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;

import oracle.jdbc.driver.OracleDriver;

public class WorkshopNativeHints implements RuntimeHintsRegistrar {
	

	    @Override
	    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
	    	
	    	
			/*
			 * // Register method for reflection 
			 * // reflection access of a method
			 * Method method = ReflectionUtils.findMethod(MyClass.class, "sayHello", String.class);
			 * hints.reflection().registerMethod(method, ExecutableMode.INVOKE);
			 * 
			 * // Register resources
			 * // Resource file should be packaged into the native image 
			 *  hints.resources().registerPattern("my-resource.txt");
			 * 
			 * // Register serialization
			 * // Type should be serializable
			 * hints.serialization().registerType(MySerializableClass.class);
			 * 
			 * // Register proxy
			 * // Class needs a proxy  
			 * hints.proxies().registerJdkProxy(MyInterface.class);
			 */
	        
	    	hints.reflection().registerType(OracleDriver.class, MemberCategory.INVOKE_PUBLIC_CONSTRUCTORS);
	    	
	        
	    }

	
}
