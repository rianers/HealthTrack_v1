package br.com.healthtrack;

import java.time.LocalDate;

/**
 * Classe que abstrai uma pessoa e gera um usuário.
 * 
 * @author LiftOff
 * @version 1.0
 */

public class User extends Person {

	private String email;
	private String password;
	private Double height;
	private Double weight;

	public User(String email, String password, Double height, Double weight, String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
		this.email = email;
		this.password = password;
		this.height = height;
		this.weight = weight;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
}
