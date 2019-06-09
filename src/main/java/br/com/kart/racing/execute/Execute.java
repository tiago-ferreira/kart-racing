package br.com.kart.racing.execute;

import java.io.IOException;
import java.util.stream.Stream;

import br.com.kart.racing.enums.IgnoreTitle;
import br.com.kart.racing.util.FileReader;

public class Execute {

	public static void main(String[] args) {
		FileReader fileReader = new FileReader();
		try {
			Stream<String> lines = fileReader.readFile("data.txt", true, IgnoreTitle.Yes);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
