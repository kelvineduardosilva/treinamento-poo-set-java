package entities;

import java.util.Objects;

public class Curso {

	private Aluno alunos;

	public Curso(Aluno alunos) {
		super();
		this.alunos = alunos;
	}

	public Aluno getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno alunos) {
		this.alunos = alunos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alunos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(alunos, other.alunos);
	}
	
}
