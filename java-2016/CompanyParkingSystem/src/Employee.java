
public class Employee {

	private String name;
	private int seniority;
	private String position;
	private boolean hasParkingSpace;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public boolean isHasParkingSpace() {
		return hasParkingSpace;
	}

	public void setHasParkingSpace(boolean hasParkingSpace) {
		this.hasParkingSpace = hasParkingSpace;
	}

	@Override
	public String toString() {
		return name + ", seniority=" + seniority;
	}

	public Employee(String name, int seniority, String position, boolean hasParkingSpace) {
		super();
		this.name = name;
		this.seniority = seniority;
		this.position = position;
		this.hasParkingSpace = hasParkingSpace;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (hasParkingSpace ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + seniority;
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
		Employee other = (Employee) obj;
		if (hasParkingSpace != other.hasParkingSpace)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (seniority != other.seniority)
			return false;
		return true;
	}

}
