package aluno.uepb.edu.br.simpleCrud;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import aluno.uepb.edu.br.simpleCrud.rh.dominio.PessoaRepositorio;
import jakarta.transaction.Transactional;
import aluno.uepb.edu.br.simpleCrud.rh.dominio.Pessoa;

@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner {

	@Autowired
	private PessoaRepositorio pessoaRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p1 = new Pessoa("Joao");
		p1.setDataNascimento(LocalDate.of(1990, 4, 1));
		p1.setEmail("joao@gmail.com");
		p1.setCpf("10518516962");
		
		Pessoa p2 = new Pessoa("Maria");
		p2.setDataNascimento(LocalDate.of(1900, 1, 1));
		p2.setEmail("maria@gmail.com");
		p2.setCpf("10518516962");
		
		pessoaRepo.save(p1);
		pessoaRepo.save(p2);
	}
	
}
