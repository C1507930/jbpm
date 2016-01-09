package com.test;

import java.util.List;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.taskmgmt.def.Task;

public class JbpmContextTest_three {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext();
		List<Task> taskList = jbpmContext.getTaskList("kaka");//根据参与者返回待办任务列表
		for(Task task:taskList){
			System.out.println(task.getName() + " ");
		}
	}

}
