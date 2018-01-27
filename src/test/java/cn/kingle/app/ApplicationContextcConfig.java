package cn.kingle.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import cn.kingle.conf.NettyConfig;

@Configuration
@Import({NettyConfig.class})
@ComponentScan(basePackages={"cn.kingle"})
public class ApplicationContextcConfig {
	 @Bean
	  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
	  {
		 System.out.println("ApplicationContextcConfig");
	    return new PropertySourcesPlaceholderConfigurer();
	  }
}

