package cadastroAlunoProfessor.domain;

public class Professor extends Pessoa {
	private String titulacao;
	
	public Professor(String nome, String titulacao, String telefone, String email) {
		super(nome, email, telefone);

		this.titulacao = titulacao;
	}
	
//toString	

	@Override
	public String toString() {
		return "Professor [titulacao = " + titulacao + ", telefone() = " + getTelefone() + ", nome() = " + getNome()
				+ ", getEmail() = " + getEmail() + "]";
	}

//getters e setters

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

}