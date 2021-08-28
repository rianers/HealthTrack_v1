package br.com.healthtrack;

/**	
 * Classe que representa as atividades físicas.
 * @author LiftOff
 * @version 1.0
 */

public class PhysicalActivity {

	private String name;
	private int duration;
	private Double calories;

	public PhysicalActivity(String name, int duration, Double calories) {
		this.name = name;
		this.duration = duration;
		this.calories = calories;
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

}
