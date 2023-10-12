package com.codecounty.java.core.oops.static_concept;

public class MainPrimeMinister {

	public static void main(String[] args) {

//		PrimeMinister pm1 = new PrimeMinister("Mr Modi", "BJP", 60);
//		PrimeMinister pm2 = new PrimeMinister("Mr Modi", "BJP", 60);
//		System.out.println(pm1.hashCode());
//		System.out.println(pm2.hashCode());

		PrimeMinister pm1 = PrimeMinister.getInstance("Mr Modi", "BJP", 60);
		PrimeMinister pm2 = PrimeMinister.getInstance("Mr Manmohan", "Congress", 60);
		PrimeMinister pm3 = PrimeMinister.getInstance("Mr RajendarPrasad", "BJP", 60);
		
		System.out.println(pm1.hashCode());
		System.out.println(pm2.hashCode());
		System.out.println(pm3.hashCode());
		
		System.out.println(pm1);
		System.out.println(pm2);
		System.out.println(pm3);
		System.out.println(Thread.currentThread());


	}

}
