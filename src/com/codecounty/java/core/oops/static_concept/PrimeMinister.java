package com.codecounty.java.core.oops.static_concept;

public class PrimeMinister {// You have to write some logic to force only a single object being creted for
							// PrimeMinister [static/constructor/private]

	private String name;
	private String party;
	private int age;
	private static PrimeMinister pm;

	private PrimeMinister(String name, String party, int age) {
		super();
		this.name = name;
		this.party = party;
		this.age = age;
	}

	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", party=" + party + ", age=" + age + "]";
	}

	synchronized static PrimeMinister getInstance(String name, String party, int age) {
		if (pm == null) {
			pm = new PrimeMinister(name, party, age);
		}

		return pm;

	}

}
