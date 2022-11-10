package cadastroAlunoProfessor.tui;

import java.util.Scanner;
import cadastroAlunoProfessor.persistence.PessoaDAO;
import cadastroAlunoProfessor.domain.*;

public class PessoaTUI {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Escolha a ação:"
				+ "\n1)Cadastrar Aluno"
				+ "\n2)Cadastrar Professor");
		int escolha = ent.nextInt();
		switch (escolha) {
		case 1:
			try {
				PessoaDAO.inserirPessoa(cadastrarAluno());
			} catch (ValorNaoInformadoException e) {
				e.printStackTrace();
			}
			break;
		case 2:
				cadastrarProfessor();
			break;
		}
		
	}
	
	public static Aluno cadastrarAluno() throws ValorNaoInformadoException {
		
		String nome, email, telefone, nomeDaEscola;
		int anoDeNascimento;
		
		Scanner ent = new Scanner(System.in);

		System.out.println("********** CADASTRO DE ALUNOS **********");
		
		System.out.println("Informe o nome:");
		nome = ent.next();
		
		System.out.println("Informe o email:");
		email = ent.next();
		
		System.out.println("Informe o telefone:");
		telefone = ent.next();
		
		System.out.println("Informe o ano de nascimento:");
		anoDeNascimento = ent.nextInt();
		
		System.out.println("Informe o nome da escola de origem");
		nomeDaEscola = ent.next();
		
		Aluno aluno = new Aluno(nome, email, telefone, anoDeNascimento, nomeDaEscola);
		if (aluno.getTelefone() == null || aluno.getTelefone().isBlank()) {
			throw new ValorNaoInformadoException();
		}
		return aluno;
	}
	public static void cadastrarProfessor() {
		
		Scanner ent = new Scanner(System.in);
		String nome, email, telefone, titulacao;
		
		System.out.println("********** CADASTRO DE PROFESSORES **********");
		
		System.out.println("Informe o nome:");
		nome = ent.next();
		
		System.out.println("Informe o email:");
		email = ent.next();
		
		System.out.println("Informe o telefone:");
		telefone = ent.next();
		
		System.out.println("Informe a titulação:");
		titulacao = ent.next();
		
		Professor professor = new Professor(nome, titulacao, telefone, email);
		PessoaDAO.inserirPessoa(professor);
	}

}
