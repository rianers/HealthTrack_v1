package br.com.healthtrack;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**	
 * Classe que representa uma pessoa.
 * @author LiftOff
 * @version 1.0
 */

public abstract class Person {

	protected String name;
	protected LocalDate birthDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return Retorna a idade do usuário.
	 */
	public long getAge() {
		return ChronoUnit.YEARS.between(this.birthDate, LocalDate.now());
	}
}
