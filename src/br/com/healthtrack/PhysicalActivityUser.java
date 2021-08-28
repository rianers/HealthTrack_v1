package br.com.healthtrack;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Classe que une as informações de atividade física de um usuário.
 * 
 * @author LiftOff
 * @version 1.0
 */

public class PhysicalActivityUser {

	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private PhysicalActivity physicalActivity;
	private User user;

	public PhysicalActivityUser(PhysicalActivity physicalActivity, User user) {
		this.physicalActivity = physicalActivity;
		this.user = user;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public PhysicalActivity getPhysicalActivity() {
		return physicalActivity;
	}

	public User getUser() {
		return user;
	}

	/*
	 * Atribui a data e hora atual ao início da atividade física
	 */
	public void startActivity() {
		this.startTime = LocalDateTime.now();
	}

	/**
	 * Atribui a data informada ao início da atividade física
	 * 
	 * @param date início da atividade
	 */
	public void startActivity(String date) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		this.startTime = LocalDateTime.parse(date, dateFormat);
	}

	/**
	 * Atribui a data e hora atual ao final da atividade física
	 */
	public void endActivity() {
		this.endTime = LocalDateTime.now();
	}

	/**
	 * Atribui a data informada ao fim da atividade física
	 * @param date fim da atividade
	 */
	public void endActivity(String date) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		this.endTime = LocalDateTime.parse(date, dateFormat);
	}

	/**
	 * @return Retorna uma string com o resumo da atividade física registrada pelo
	 *         usuário.
	 */
	public String generateResume() {

		Double calorias = (this.physicalActivity.getCalories() * ChronoUnit.SECONDS.between(startTime, endTime))
				/ this.physicalActivity.getDuration();

		long userAge = this.user.getAge();
		String moreLessCalories = "";

		if (userAge < 21) {
			calorias *= 1.1;
			moreLessCalories = "mais";
		} else {
			calorias *= 0.9;
			moreLessCalories = "menos";
		}

		return String.format("%s, você perdeu %.2f calorias. Por você ter %d anos, seu corpo queima %s calorias.",
				this.user.getName(), calorias, userAge, moreLessCalories);
	}
}