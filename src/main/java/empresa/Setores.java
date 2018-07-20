package empresa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="setores")
public class Setores implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idSetores;
	@Column
	private String descricao;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idColaboradores")
	private Colaboradores colaboradores;
	
	public Setores() {
		// TODO Auto-generated constructor stub
	}

	public Setores(Integer idSetores, String descricao) {
		super();
		this.idSetores = idSetores;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Setores [idSetores=" + idSetores + ", descricao=" + descricao + "]";
	}

	public Integer getIdSetores() {
		return idSetores;
	}

	public void setIdSetores(Integer idSetores) {
		this.idSetores = idSetores;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Colaboradores getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(Colaboradores colaboradores) {
		this.colaboradores = colaboradores;
	}
	
	

}
