package com.lw.test;

import com.lw.bean.Student;
import com.lw.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liwei-4
 * @description:
 * @date 2019-09-16
 */
public class TestSpring {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(annotationConfigApplicationContext.getBean(Student.class));
		System.out.println(annotationConfigApplicationContext.getBean("user"));

		Student student = (Student) annotationConfigApplicationContext.getBean("user");
		System.out.println(student.getName() + "  " + student.getStuno());

	}
}
