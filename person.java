package by.epam.jb24.less08.task1;

import java.util.Date;

public class person {

	private String Name;
	private String Surname;
	private String Identifier;
	private Date birthDate;
	
	public person( String aName, String aSurname, String ident, Date bDate) {
		Name = aName;
		Surname = aSurname;
		Identifier = ident;
		birthDate = bDate;		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Identifier == null) ? 0 : Identifier.hashCode());
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
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
		person other = (person) obj;
		if (Identifier == null) {
			if (other.Identifier != null)
				return false;
		} else if (!Identifier.equals(other.Identifier))
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		return true;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getIdentifier() {
		return Identifier;
	}

	public void setIdentifier(String identifier) {
		Identifier = identifier;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
