package com.test;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.exe.ProcessInstance;

public class JbpmContextTest_four {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext();
		long processInstanceId = 1;
		ProcessInstance pi = jbpmContext.loadProcessInstance(processInstanceId);//根据ID加载流程实例
	}

}
