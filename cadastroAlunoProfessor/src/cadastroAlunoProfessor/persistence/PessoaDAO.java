package cadastroAlunoProfessor.persistence;

import java.util.ArrayList;
import java.util.List;
import cadastroAlunoProfessor.domain.Pessoa;

public class PessoaDAO {
	
	private static List<Pessoa> pessoas = new ArrayList<>();
	
	public static void inserirPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	public static List<Pessoa> getLista() {
		return pessoas;
	}
}