package br.edu.fatecpg.spring.ConsomeApi;

import br.edu.fatecpg.spring.ConsomeApi.model.Serie;
import br.edu.fatecpg.spring.ConsomeApi.services.ConsumoApi;
import br.edu.fatecpg.spring.ConsomeApi.services.ConverteDado;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsomeApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsomeApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Olá Mundo!");
		String json = ConsumoApi.obterDado();
		System.out.println(json);
		ConverteDado conversor = new ConverteDado();
		Serie serie = conversor.obterDado(json, Serie.class);
		System.out.println(serie);

	}
}

