package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "clientes")


public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "endereco")
	private String endereco;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "telefone")
	private int telefone;
	
	@Column(name = "email")
	private String email;
	
  
 
  public Cliente() {
	  
  }
  

		
		

public Cliente(String nome, String cpf, String endereco, int numero, String complemento, String cidade, String estado,
		int telefone, String email) {
	super();
	
	this.nome = nome;
	this.cpf = cpf;
	this.endereco = endereco;
	this.numero = numero;
	this.complemento = complemento;
	this.cidade = cidade;
	this.estado = estado;
	this.telefone = telefone;
	this.email = email;
}



@Override
public String toString() {
	return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", numero=" + numero
			+ ", complemento=" + complemento + ", cidade=" + cidade + ", estado=" + estado + ", telefone=" + telefone
			+ ", email=" + email + "]";
}


public long getId() {
	return id;
	
	}
	public void setId(long id) {
	this.id = id;
	

}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public String getComplemento() {
	return complemento;
}

public void setComplemento(String complemento) {
	this.complemento = complemento;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public int getTelefone() {
	return telefone;
}

public void setTelefone(int telefone) {
	this.telefone = telefone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}




}