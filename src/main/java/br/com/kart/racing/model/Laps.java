package br.com.kart.racing.model;

import java.time.LocalTime;

public class Laps {

	private Pilot pilot;
	private LocalTime hour;
	private Integer lapNumber;
	private LocalTime lapTime;
	private Double averageSpeed;

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public LocalTime getHour() {
		return hour;
	}

	public void setHour(LocalTime hour) {
		this.hour = hour;
	}

	public Integer getLapNumber() {
		return lapNumber;
	}

	public void setLapNumber(Integer lapNumber) {
		this.lapNumber = lapNumber;
	}

	public LocalTime getLapTime() {
		return lapTime;
	}

	public void setLapTime(LocalTime lapTime) {
		this.lapTime = lapTime;
	}

	public Double getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(Double averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

}
