package org.com;

public class Encapsul {

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setUsername("Kamali");
		e.setPassword(123);


		String username = e.getUsername();
		System.out.println(username);

		int password = e.getPassword();
		System.out.println(password);

	}


}
