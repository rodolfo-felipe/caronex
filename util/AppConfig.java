package main.java.br.com.caronex.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@ComponentScan({ "main.java.br.com.caronex.util", "main.java.br.com.caronex.repository"})
@EnableMongoRepositories("main.java.br.com.caronex.repository")
@Import({ MongoConfig.class })
public class AppConfig {

}
