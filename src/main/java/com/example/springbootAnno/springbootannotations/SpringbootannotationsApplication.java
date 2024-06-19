package com.example.springbootAnno.springbootannotations;

import com.example.springbootAnno.springbootannotations.controller.SubjectController;
import com.example.springbootAnno.springbootannotations.controller.TeacherContorller;
import com.example.springbootAnno.springbootannotations.lazy.LazyLoader;
import com.example.springbootAnno.springbootannotations.propertySource.DemoPropertySource;
import com.example.springbootAnno.springbootannotations.scope.PrototypeBean;
import com.example.springbootAnno.springbootannotations.scope.SingletonBean;
import com.example.springbootAnno.springbootannotations.service.MathSubject;
import com.example.springbootAnno.springbootannotations.value.DemoValue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootannotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringbootannotationsApplication.class, args);
		// run() return type ConfigurableApplicationContext
		// context contains all the object of all beans in project

		//if component name String passed then returntype: Object, so need to downcast it
//		SubjectController subjectController =
//				(SubjectController) context.getBean("testSubjectController");

//		SubjectController subjectController = (SubjectController) context.getBean("subjectController");
//		System.out.println(subjectController.getSubject());

//		MathSubject mathSubject = context.getBean(MathSubject.class);
//		System.out.println(mathSubject.getSubject());


		// Lazy Concept
//		LazyLoader lazyLoader = context.getBean(LazyLoader.class);

//		SingletonBean sb1 = context.getBean(SingletonBean.class); // one time const called for both
//		SingletonBean sb2 = context.getBean(SingletonBean.class);
//		if(sb1 == sb2) System.out.println("Shit that worked.");
//		System.out.println(sb1.hashCode() == sb2.hashCode()); //true

//		PrototypeBean pb1 = context.getBean(PrototypeBean.class); // 2 times const called
//		PrototypeBean pb2 = context.getBean(PrototypeBean.class);
//		System.out.println(pb1.hashCode() == pb2.hashCode()); // false

//		DemoValue dval = context.getBean(DemoValue.class);
//		System.out.println(dval.getString());

		DemoPropertySource demoPropertySource = context.getBean(DemoPropertySource.class);
		System.out.println(demoPropertySource.getDBusername());
		System.out.println(demoPropertySource.getDBpassword());
		System.out.println(demoPropertySource.getDBport());
		System.out.println(demoPropertySource.getMailUsername());
	}

}