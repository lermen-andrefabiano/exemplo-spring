package br.com.core;

import java.io.Serializable;

public abstract class Entidade implements Serializable {

	private static final long serialVersionUID = 1L;

	public abstract Serializable getId();

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " ( id: " + getId() + " )";
	}

	@Override
	public int hashCode() {
		if (getId() == null) {
			return 0;
		}
		return getId().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!this.getClass().isInstance(obj)) {
			// System.out.println("obj nao é da mesma instancia!!!!");
			return false;
		}
		if (obj == this) {
			return true;
		}

		if (!(obj instanceof Entidade)) {
			// System.out.println("obj nao herda entidade!!!!");
			return false;
		}

		Entidade e2 = (Entidade) obj;

		if (this.getId() == null || e2.getId() == null) {
			return false;
		}

		if (this.getId().equals(e2.getId())) {
			// System.out.println("eh igual!!!!");
			return true;
		} else {
			// System.out.println("nao eh igual!!!!");
			return false;
		}

	}
}
