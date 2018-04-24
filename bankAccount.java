package by.epam.jb24.less08.task1;

import java.lang.*;

public class bankAccount {

	private String acntNumber;
	private person acntHolder;
	private Currency acntCurr;
	
	public bankAccount ( String aNumber, person aHolder, Currency aCurr) {
		
		acntNumber = aNumber;
		acntHolder = aHolder;
		acntCurr = aCurr;
	}

	public String getAcntNumber() {
		return acntNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acntCurr == null) ? 0 : acntCurr.hashCode());
		result = prime * result + ((acntHolder == null) ? 0 : acntHolder.hashCode());
		result = prime * result + ((acntNumber == null) ? 0 : acntNumber.hashCode());
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
		bankAccount other = (bankAccount) obj;
		if (acntCurr == null) {
			if (other.acntCurr != null)
				return false;
		} else if (!acntCurr.equals(other.acntCurr))
			return false;
		if (acntHolder == null) {
			if (other.acntHolder != null)
				return false;
		} else if (!acntHolder.equals(other.acntHolder))
			return false;
		if (acntNumber == null) {
			if (other.acntNumber != null)
				return false;
		} else if (!acntNumber.equals(other.acntNumber))
			return false;
		return true;
	}

	public void setAcntNumber(String acntNumber) {
		this.acntNumber = acntNumber;
	}

	public person getAcntHolder() {
		return acntHolder;
	}

	public void setAcntHolder(person acntHolder) {
		this.acntHolder = acntHolder;
	}

	public Currency getAcntCurr() {
		return acntCurr;
	}

	public void setAcntCurr(Currency acntCurr) {
		this.acntCurr = acntCurr;
	}

	@Override
	public String toString() {
		return "bankAccount [acntNumber=" + acntNumber + ", acntCurr=" + acntCurr.getCurrCode() +
				", Identifier=" + acntHolder.getIdentifier() + "]";
	}
	
}
