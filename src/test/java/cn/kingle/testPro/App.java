package cn.kingle.testPro;

import java.lang.management.ManagementFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import cn.kingle.app.ApplicationContextcConfig;

public class App {
	  public static void main(String[] args)
	  {
	    String vm = ManagementFactory.getRuntimeMXBean().getName();
	    AbstractApplicationContext context = new AnnotationConfigApplicationContext( ApplicationContextcConfig.class);
	    context.registerShutdownHook();
	    context.start();
	  }
}

