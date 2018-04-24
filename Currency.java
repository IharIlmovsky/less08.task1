package by.epam.jb24.less08.task1;

public class Currency {

	private String currName;
	private int currNumber;
	private String currCode;
	
	public Currency ( String aName, int Number, String Code) {
		
		currName = aName;
		currNumber = Number;
		currCode = Code;
	}

	public String getCurrName() {
		return currName;
	}

	public void setCurrName(String currName) {
		this.currName = currName;
	}

	@Override
	public String toString() {
		return "Currency [currCode=" + currCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currNumber;
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
		Currency other = (Currency) obj;
		if (currNumber != other.currNumber)
			return false;
		return true;
	}

	public int getCurrNumber() {
		return currNumber;
	}

	public void setCurrNumber(int currNumber) {
		this.currNumber = currNumber;
	}

	public String getCurrCode() {
		return currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}
}
