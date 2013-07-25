package com.springdemo.postProcessor;

import org.springframework.beans.BeansException;  
import org.springframework.beans.MutablePropertyValues;  
import org.springframework.beans.factory.config.BeanDefinition;  
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;  
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory; 

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
			throws BeansException {
		// Modify postProcessorBean username property
		BeanDefinition bd = beanFactory.getBeanDefinition("postProcessorBean");  
        MutablePropertyValues pv =  bd.getPropertyValues();  
        if(pv.contains("username"))  {  
            pv.addPropertyValue("username", "xiaojun");  
        } 
	}

}
