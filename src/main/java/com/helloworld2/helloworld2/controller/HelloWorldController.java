package com.helloworld2.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-wordl")
public class HelloWorldController {
	
		@GetMapping
		public String helloworld() {
			return "Hello World";
		}
		@GetMapping
		public String persistencia() {
			return "Persistencia";
		}
		
		@GetMapping
		public String mentalidadeecrescimento() {
			return "Mentalidade e Crescimento";
		}
		
		@GetMapping
		public String orientaçãoaofuturo() {
			return "Orientação ao Futuro";
		}
		
        @GetMapping
		public String  responsabilidadepessoal() {
			return "Responsabilidade Pessoal";
		}
        
		@GetMapping
		public String trabalhoemequipe() {
			return "Trabalho em Equipe";
		}
		
         @GetMapping
		public String comunicação() {
			return "Comunicação";
		}
         
		@GetMapping
		public String orientaçãoaosdetalhes() {
			return "Orientação aos Detalhes";
		}
		
		@GetMapping
		public String proatividade() {
			return "Proatividade";
		}
		@GetMapping
		public String aprenderjava() {
			return "Aprender Java";
		}
		@GetMapping
		public String estudarmais() {
			return "Estudar mais";
		}
        @GetMapping
        public String aprenderbancodedados() {
        	return "Aprender Banco De Dados";
        }
}
