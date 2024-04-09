package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FicheroWriter {

	public void writeToFile(ArrayList<Serie> series, ArrayList<Videojuego> videojuegos) {

		String ruta = "C:\\Users\\User\\Documents\\estado.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
			for (Serie serie : series) {
				bw.write(serie.toString());
				bw.newLine();
			}
			for (Videojuego videojuego : videojuegos) {
				bw.write(videojuego.toString());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
