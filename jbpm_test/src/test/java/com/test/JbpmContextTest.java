package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipInputStream;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;

public class JbpmContextTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext();
																					//创建JBPM上下文
		try {
			FileInputStream fis = new FileInputStream("F:\\MyEclipse10\\Workspaces\\jbpm_test\\helloworld.zip");
																					//使用文件输入流加入流程模板
			ZipInputStream zis = new ZipInputStream(fis);							//使用zip输入流加入流程模板
			ProcessDefinition processDefinition = ProcessDefinition.parseParZipInputStream(zis);
																					//创建流程模板
			jbpmContext.deployProcessDefinition(processDefinition);
			zis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			jbpmContext.close();
		}
	}

}
