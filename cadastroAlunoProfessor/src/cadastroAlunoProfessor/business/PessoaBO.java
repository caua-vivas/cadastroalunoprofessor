package cadastroAlunoProfessor.business;

import cadastroAlunoProfessor.persistence.PessoaDAO;
import cadastroAlunoProfessor.domain.Professor;
import cadastroAlunoProfessor.domain.Aluno;

public class PessoaBO {

	public static void cadastrarProfessor(Professor professor) {
	PessoaDAO.inserirPessoa(professor);
	}

	public static void cadastrarAluno(Aluno aluno) {
	PessoaDAO.inserirPessoa(aluno);
	}
}