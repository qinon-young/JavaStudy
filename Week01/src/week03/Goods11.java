package week03;

public class Goods11 {
	private String name11;

	public String getName() {
		return name11;
	}

	public void setName(String name) {
		this.name11 = name;
	}

	@Override
	public String toString() {
		return this.name11;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name11 == null) ? 0 : name11.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods11 other = (Goods11) obj;
		if (name11 == null) {
			if (other.name11 != null)
				return false;
		} else if (!name11.equals(other.name11))
			return false;
		return true;
	}

	public Goods11(String name) {
		super();
		this.name11 = name;
	}
	
}
