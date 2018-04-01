package HW4;

public class Car {
	private String type;
	private int year_of_prod;
	private int en_cap;
	public Car() {};
	public Car(String type, int year_of_prod, int en_cap) {
		
		this.type = type;
		this.year_of_prod = year_of_prod;
		this.en_cap = en_cap;
	}
	
	@Override
	public String toString()
	{
		return "Type: "+type+", year of production "+year_of_prod+", engine capacity"+en_cap;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + en_cap;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + year_of_prod;
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
		Car other = (Car) obj;
		if (en_cap != other.en_cap)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (year_of_prod != other.year_of_prod)
			return false;
		return true;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear_of_prod() {
		return year_of_prod;
	}
	public void setYear_of_prod(int year_of_prod) {
		this.year_of_prod = year_of_prod;
	}
	public int getEn_cap() {
		return en_cap;
	}
	public void setEn_cap(int en_cap) {
		this.en_cap = en_cap;
	}
	

}
