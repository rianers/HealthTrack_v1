package br.com.healthtrack;

import java.text.DecimalFormat;

/**
 * Classe que representa as atividades físicas.
 * 
 * @author LiftOff
 * @version 1.0
 */

public class PhysicalActivity {

	private int id;
	private String name;
	private int duration;
	private Double calories;

	public PhysicalActivity(String name, int duration, Double calories) {
		this.name = name;
		this.duration = duration;
		this.calories = calories;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");

		return "Atividade Física [id=" + this.id + ", nome=" + this.name + ", duração=" + this.duration + ", calorias="
				+ decimalFormat.format(this.calories) + "]!";
	}
}
