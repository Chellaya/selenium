package org.com;

public class Encapsulation {
	private String username;
	private int password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if (username.equals("mani")) {
			this.username="Mani personal Account";
		}
		else if (username.equals("babu")) {
			this.username="Babu personal Account";
		}

		else if (username.equals("Kamali")) {
			this.username="Kamali Personal Account";

		}
		else {
			this.username="Invalid Account";
		}
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;

		if (password == (123)) {
			this.password= 1234;
		}
		else if (password==(456)) {
			this.password=5678;
		}
		else if (password==789) {
			this.password=9012;
		}
		else {
			this.password= 0;
		}
	}


}
