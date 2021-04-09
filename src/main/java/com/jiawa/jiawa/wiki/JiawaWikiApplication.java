package com.jiawa.jiawa.wiki;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class JiawaWikiApplication {
	private final static Logger logger = LoggerFactory.getLogger(JiawaWikiApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(JiawaWikiApplication.class);
		Environment env =app.run(args).getEnvironment();
		logger.info("启动成功！");
		logger.info("地址为\thttp://127.0.01:{}",env.getProperty("server.port"));


	}

}
