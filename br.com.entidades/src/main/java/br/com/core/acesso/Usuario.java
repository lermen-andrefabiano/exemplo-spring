package br.com.core.acesso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.core.Entidade;

@Entity
@Table(name = "USUARIOS", schema = "dbasgu")
public class Usuario extends Entidade {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CD_USUARIO")
	private String id;

	@Column(name = "NM_USUARIO")
	private String nome;

	@Column(name = "CD_SENHA")
	private String senha;

	public void setId(String id) {
		this.id = id.toUpperCase();
	}

	public Usuario() {
	}

	public Usuario(String id) {
		this.setId(id);
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
