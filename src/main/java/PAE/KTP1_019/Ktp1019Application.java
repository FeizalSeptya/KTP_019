package PAE.KTP1_019;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Ktp1019Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Ktp1019Application.class, args);
	}
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Ktp1019Application.class);
    }

}
