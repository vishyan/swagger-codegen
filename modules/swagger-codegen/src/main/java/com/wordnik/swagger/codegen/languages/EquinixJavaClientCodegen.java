package com.wordnik.swagger.codegen.languages;

import com.wordnik.swagger.codegen.*;

import java.util.*;
import java.io.File;

public class EquinixJavaClientCodegen extends JavaClientCodegen {
	
	protected String invokerPackage = "com.equinix.ecx.client";
	protected String groupId = "com.equinix.ecx";

	public EquinixJavaClientCodegen() {
		super();
		outputFolder = "generated-code/java";
		modelTemplateFiles.put("model.mustache", ".java");
		apiTemplateFiles.put("api.mustache", ".java");
		templateDir = "Java";
		invokerPackage = "com.equinix.ecx.client";
		apiPackage = "com.equinix.ecx.client.api";
		modelPackage = "com.equinix.ecx.client.model";

		additionalProperties.put("invokerPackage", invokerPackage);
	    additionalProperties.put("groupId", groupId);

	    supportingFiles.clear();
	    supportingFiles.add(new SupportingFile("pom.mustache", "", "pom.xml"));
	    supportingFiles.add(new SupportingFile("apiInvoker.mustache", 
	      (sourceFolder + File.separator + invokerPackage).replace(".", java.io.File.separator), "ApiInvoker.java"));
	    supportingFiles.add(new SupportingFile("JsonUtil.mustache", 
	      (sourceFolder + File.separator + invokerPackage).replace(".", java.io.File.separator), "JsonUtil.java"));
	    supportingFiles.add(new SupportingFile("apiException.mustache", 
	      (sourceFolder + File.separator + invokerPackage).replace(".", java.io.File.separator), "ApiException.java"));		
	}
	
}
