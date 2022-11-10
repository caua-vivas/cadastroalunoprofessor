package cadastroAlunoProfessor.domain;

public class Aluno extends Pessoa {
	private int anoDeNascimento;
	private String escolaDeOrigem;
	
	public Aluno(String nome, String email, String telefone, int anoDeNascimento, String nomeDaEscola) {
		super(nome, email, telefone);
		this.anoDeNascimento = anoDeNascimento;
		this.escolaDeOrigem = nomeDaEscola;
		
	}

//toString
	
	@Override
	public String toString() {
		return "Aluno [nome = " + getNome() + ", email = " + getEmail() + ", telefone = " + getTelefone() + "anoDeNascimento = " + anoDeNascimento + ", escolaDeOrigem = " + escolaDeOrigem + "]";
	}

//getters e setters 

	
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}

	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}

	public String getNomeDaEscola() {
		return escolaDeOrigem;
	}

	public void setNomeDaEscola(String nomeDaEscola) {
		this.escolaDeOrigem = nomeDaEscola;
	}
}
