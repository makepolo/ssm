package common;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;


/**
 * @author liang.zhang
 * @email galosmart@foxmail.com
 * @♬~~~1、2、3...木头人...
 * @Msg:
 * 
 */
public class TestBase extends TestCase{
	
	protected BeanFactory beanFactory = new ClassPathXmlApplicationContext("/application-config.xml");
	
	public Object getBean(String beanName){
		
		return beanFactory.getBean(beanName);
	}
}
