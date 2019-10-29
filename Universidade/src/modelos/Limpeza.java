package modelos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.NotNull;

@Entity
public class Limpeza extends Funcionario {

	@NotNull
	private Integer jornadaTrabalho;

	@ManyToOne
	@JoinColumn(name = "gerente_id")
	private Limpeza gerente;

	public Limpeza() {

	}

	public Limpeza(String nome, String sexo, Date data_aniversario, Double salario, Integer joranada_trabalho) {
		super(nome, sexo, data_aniversario, salario);
		this.jornadaTrabalho = joranada_trabalho;
	}

	public Integer getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(Integer jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}

}
