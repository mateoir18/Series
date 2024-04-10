package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FicheroWriterSeries {

	public void writeToFile(ArrayList<Serie> series) {

		String ruta = "C:\\Users\\User\\Documents\\series.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
			for (Serie serie : series) {
				bw.write(serie.toString());
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
