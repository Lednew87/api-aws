package lednewcodes.apirest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(PersonRepository repository) {
		return args -> {
			repository.save(new Person("John", "Doe"));
			repository.save(new Person("Diana", "Tonzar"));
		};
	}
}
