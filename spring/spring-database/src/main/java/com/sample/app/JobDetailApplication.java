package com.sample.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.service.JobService;
import com.sample.vo.Job;

public class JobDetailApplication {
	public static void main(String[] args) {
		String resource = "classpath:/spring/context-jdbc.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		JobService service = ctx.getBean(JobService.class);
		
		Job job = service.getJobDetail("AD_VP");
		System.out.println(job.getId());
		System.out.println(job.getTitle());
		System.out.println(job.getMinSalary());
		System.out.println(job.getMaxSalary());
	}
}
