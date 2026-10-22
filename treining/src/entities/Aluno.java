package entities;

import java.util.Objects;

public class Aluno {
	private int numeroId;

	public Aluno(int numeroId) {
		this.numeroId = numeroId;
	}

	public int getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(numeroId));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return numeroId == other.numeroId;
	}
	

}
