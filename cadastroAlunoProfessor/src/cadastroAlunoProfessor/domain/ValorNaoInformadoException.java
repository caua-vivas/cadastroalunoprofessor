package cadastroAlunoProfessor.domain;

public class ValorNaoInformadoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "Telefone do aluno não foi informado, os alunos precisam ter telefone cadastrado.";
	}

}