package com.lw.postprocessor;

import com.lw.bean.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author liwei-4
 * @description: 继承BeanFactoryPostProcessor 可以使我们对BeanFactory中的一些内容进行修改
 * @date 2019-09-16
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("user");
		// 修改 spring IOC中 name为user 的bean对应的class
		beanDefinition.setBeanClassName(Student.class.getName());

	}
}
