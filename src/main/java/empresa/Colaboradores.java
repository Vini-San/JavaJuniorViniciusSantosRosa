package empresa;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="colaboradores")
public class Colaboradores implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idColaboradores;
	@Column
	private String cpf;
	@Column
	private String nome;
	@Column
	private String telefone;
	@Column
	private String email;
	
	@OneToOne(mappedBy="colaboradores", fetch=FetchType.EAGER, cascade= {CascadeType.ALL})
	private Setores setores;
	
	public Colaboradores() {
		// TODO Auto-generated constructor stub
	}

	public Colaboradores(Integer idColaboradores, String cpf, String nome, String telefone, String email) {
		super();
		this.idColaboradores = idColaboradores;
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Colaboradores [idColaboradores=" + idColaboradores + ", cpf=" + cpf + ", nome=" + nome + ", telefone="
				+ telefone + ", email=" + email + "]";
	}

	public Integer getIdColaboradores() {
		return idColaboradores;
	}

	public void setIdColaboradores(Integer idColaboradores) {
		this.idColaboradores = idColaboradores;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Setores getSetores() {
		return setores;
	}

	public void setSetores(Setores setores) {
		this.setores = setores;
	}
	

}
