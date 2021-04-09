package com.jiawa.jiawa.wiki.config;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

//@SpringBootApplication(scanBasePackages="com.jiawa.jiawa.wiki.controller")
@ComponentScan("com.jiawa")
@SpringBootApplication
public class JiawaWikiApplication {
	private final static Logger logger = LoggerFactory.getLogger(JiawaWikiApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(JiawaWikiApplication.class);
		Environment env =app.run(args).getEnvironment();
		logger.info("启动成功！");
		logger.info("地址为\thttp://127.0.0.1:{}",env.getProperty("server.port"));


	}

}
