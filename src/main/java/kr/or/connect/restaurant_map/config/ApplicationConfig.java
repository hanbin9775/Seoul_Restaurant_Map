package kr.or.connect.restaurant_map.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "kr.or.connect.restaurant_map.dao",  "kr.or.connect.restaurant_map.service"})
@Import({ DBConfig.class })
public class ApplicationConfig {

}