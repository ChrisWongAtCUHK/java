package com.springdemo.test;

import org.springframework.context.ApplicationContext;  
//import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.context.support.FileSystemXmlApplicationContext;
  
import com.springdemo.postProcessor.PostProcessorBean;  
  
import junit.framework.TestCase;  

public class BeanPostPorcessorTest extends TestCase {
	private ApplicationContext context;

	protected void setUp() throws Exception {
		super.setUp();
		//String[] paths = { "classpath*:/spring/applicationContext-*.xml" };

		//context = new ClassPathXmlApplicationContext(paths);
		context = new FileSystemXmlApplicationContext(
				"beans-config.xml");

	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testBeanPostProcessor() {

	}

	// http://blog.csdn.net/ilovejava_2010/article/details/7949040
	public void testBeanFactoryPostProcessor() {
		PostProcessorBean bean = (PostProcessorBean) context.getBean("postProcessorBean");
		System.out.println("---------------testBeanFactoryPostProcessor----------------");
		System.out.println("username:" + bean.getUsername());
		System.out.println("password:" + bean.getPassword());
	}
}
