package web.config;



@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "web.config")
@PropertySource("classpath:db.properties")
public class AppConfig {

}
