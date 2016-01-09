package test;

import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;

public class TestHelloWorldProcess {

	public static void main(String[] args) {
		ProcessDefinition processDefinition = //
				ProcessDefinition.parseXmlResource("helloworld/processdefinition.xml");
		
		ProcessInstance processInstance = processDefinition.createProcessInstance();
		
		Token token = processInstance.getRootToken();
		
		System.out.println("1 当前流程所处的节点：" + token.getNode().getName());
		token.signal();
		
		System.out.println("2 当前流程所处的节点：" + token.getNode().getName());
		token.signal();
		
		System.out.println("3 当前流程所处的节点：" + token.getNode().getName());
		token.signal();
		
		System.out.println("流程是否结束：" + token.getProcessInstance().hasEnded());
		
		
		
	}
}
