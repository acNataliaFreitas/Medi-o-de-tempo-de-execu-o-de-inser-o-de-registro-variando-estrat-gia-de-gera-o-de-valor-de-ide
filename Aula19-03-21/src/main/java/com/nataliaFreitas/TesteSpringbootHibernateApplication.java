package com.nataliaFreitas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteSpringbootHibernateApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository repo;

	@Autowired
	ItemRepository itemRepository;
	public static void main(String[] args) {
		SpringApplication.run(TesteSpringbootHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Categoria c1 = new Categoria(null,"esportes");
            dao.save(c1);*/

		/*
		 * repo.save(new Categoria(null,"teste")); BotaoLigaDesliga botaoLigaDesliga =
		 * new BotaoLigaDesliga(lampada); botaoLigaDesliga.pressionar();
		 * botaoLigaDesliga.pressionar();
		 */

		long startTime = System.currentTimeMillis();
		inserir();
		long totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tempo em miliSegundos" + totalTime);
	}

	private void inserir() {
		for (int i = 0; i < 1000; i++) {
			itemRepository.save(new Item());
		}
	}
}