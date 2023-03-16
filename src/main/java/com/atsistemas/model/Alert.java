package com.atsistemas.model;

public class Alert {

	private String name;

	public Alert() {
	}

	public Alert(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Alert[name='%s']", name);
	}

}
