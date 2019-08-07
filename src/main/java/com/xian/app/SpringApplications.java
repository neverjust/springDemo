package com.xian.app;

import com.xian.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ Author     ：mmzs.
 * @ Date       ：Created in 下午11:21 2019/5/13
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
@EnableAutoConfiguration
@ComponentScan("com.xian.controller")

//@SpringBootApplication(scanBasePackageClasses = {"com.xian.controller"})//等于前两个注解
public class SpringApplications {
  public static void main( String[] args ) {
    SpringApplication.run(SpringApplications.class,args);
  }

}
