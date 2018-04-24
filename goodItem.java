package by.epam.jb24.less08.task2;

public class goodItem {

	private String Description;
	private double price;
	private long   codeNumber; 
	
	public goodItem(String aDesc, double fprc, long lNumber) {
		
		Description = aDesc;
		price = fprc;
		codeNumber = lNumber;
	}

	@Override
	public String toString() {
		return "goodItem [Description=" + Description + ", price=" + price + ", codeNumber=" + codeNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codeNumber ^ (codeNumber >>> 32));
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		goodItem other = (goodItem) obj;
		if (codeNumber != other.codeNumber)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(long codeNumber) {
		this.codeNumber = codeNumber;
	}
}
