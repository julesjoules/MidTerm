package cisc.PkgExceptions;


import com.cisc181.core.Person;


public class PersonException extends Exception {
	
	private Person p;

	public PersonException(Person p) {
		super();
		this.p = p;
	}

	protected Person getPerson() {
		return p;
	}
	
}