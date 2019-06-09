package br.com.kart.racing.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import br.com.kart.racing.enums.IgnoreTitle;

public class FileReader {

	public Stream<String> readFile(String path, boolean isClasspath, IgnoreTitle ignoreTitle) throws IOException {
		if (isClasspath) {
			try {
				return Files.lines(Paths.get(getClass().getClassLoader().getResource(path).toURI()))
						.skip(ignoreTitle.value());

			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		}
		return Files.lines(Paths.get(path));
	}

	public Boolean isReadable(String path) {
		return Files.isReadable(Paths.get(path));
	}
}
