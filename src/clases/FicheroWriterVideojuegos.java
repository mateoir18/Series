package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FicheroWriterVideojuegos {

	public void writeToFile(ArrayList<Videojuego> videojuegos) {

		String ruta = "C:\\Users\\User\\Documents\\videojuegos.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
			for (Videojuego videojuego : videojuegos) {
				bw.write(videojuego.toString());
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
