package test;

import org.jbpm.JbpmConfiguration;

public class JbpmContextDataBase {

	public static void main(String[] args) {
		JbpmConfiguration jbpmConfiguration = JbpmConfiguration.getInstance();
		//此方法慎用！每次执行将会删除jbpm数据库重新创建！
		jbpmConfiguration.createSchema();//构建JBPM数据库的方法
	}
}
