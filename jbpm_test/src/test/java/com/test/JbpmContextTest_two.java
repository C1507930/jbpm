package com.test;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.exe.ProcessInstance;

public class JbpmContextTest_two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext();
		ProcessInstance pi = jbpmContext.newProcessInstance("helloworld");//创建流程实例
	}

}
