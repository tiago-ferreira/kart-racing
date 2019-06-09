package br.com.kart.racing.dao;

import java.util.LinkedList;
import java.util.List;

import br.com.kart.racing.model.Laps;

public class LapsDAO {

	private static List<Laps> laps = new LinkedList<>();
	
	private LapsDAO() {
		
	}
	
	public static void add(Laps lap) {
		laps.add(lap);
	}
	
	public static List<Laps> getLaps() {
		return laps;
	}
}
