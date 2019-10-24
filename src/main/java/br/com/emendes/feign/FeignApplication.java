package br.com.emendes.feign;

import br.com.emendes.feign.starter.Cep;
import br.com.emendes.feign.starter.CepStarterWS;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}

	@Bean
	public CommandLineRunner cir(CepStarterWS cepStarter) {

		return args->{
			final br.com.emendes.feign.starter.Cep cep2 = cepStarter.findByCep("01435001");
			System.out.println("logradouro com starter: "+ cep2.getLogradouro());
		};
	}

}
