package br.com.kart.racing.converter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import br.com.kart.racing.model.Laps;
import br.com.kart.racing.model.Pilot;

public class LapConverter {

	public Laps converter(String line) {
		String[] values = line.split("\\s+");
		LocalTime hour = LocalTime.parse(values[0], DateTimeFormatter.ISO_LOCAL_TIME);
		String pilotCode = values[1];
		String pilotName = values[3];
		Integer lapNumber = Integer.parseInt(values[4]);
		String time = "00:0"+values[5];
		LocalTime lapTime = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		String average = values[6].replace(",", ".");
		Double averageSpeed = Double.parseDouble(average);
		return new Laps(new Pilot(pilotCode,  pilotName), hour, lapNumber, lapTime, averageSpeed);
	}
}
