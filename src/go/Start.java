package go;

import java.util.ArrayList;

import clases.FicheroWriter;
import clases.Serie;
import clases.Videojuego;

public class Start {

	public static void main(String[] args) {
		
		ArrayList<Serie> series = new ArrayList<Serie>(5);
		ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>(5);
		
		int contadorSeries = 0;
		int contadorVideojuegos = 0;
		
		Serie BreakingBad = new Serie("Breaking Bad", "Vince Gilligan");
		Serie LosSoprano = new Serie("Los Soprano", "David Chase");
		Serie JuegoDeTronos = new Serie("Juego De Tronos", "David Benioff");
		Serie TheWire = new Serie("The Wire", "David Simon");
		Serie BandOfBrothers = new Serie("Band of Brothers", "Steven Spielberg");
		
		Videojuego EldenRing = new Videojuego("Elden Ring", 10);
		Videojuego Persona5Royal = new Videojuego("Persona5Royal", 20);
		Videojuego ReadDeadRedemption2 = new Videojuego("Read Dead Redemption 2", 30);
		Videojuego ThelegendOfZelda = new Videojuego("The Legend of Zelda", 15);
		Videojuego GrandTheftAutoIV = new Videojuego("Grand Theft Auto IV",20);
		
		
		series.add(BreakingBad);
		series.add(LosSoprano);
		series.add(JuegoDeTronos);
		series.add(TheWire);
		series.add(BandOfBrothers);
		
		videojuegos.add(EldenRing);
		videojuegos.add(Persona5Royal);
		videojuegos.add(ReadDeadRedemption2);
		videojuegos.add(ThelegendOfZelda);
		videojuegos.add(GrandTheftAutoIV);
		
		
		LosSoprano.entregar();
		JuegoDeTronos.entregar();
		ThelegendOfZelda.entregar();
		EldenRing.entregar();
		
		
		
		
		for(int i = 0; i<series.size(); i++) {
			if(series.get(i).isEntregado() == true) {
				contadorSeries++;
				series.get(i).devolver();
				
			}
		}
		
		for(int i = 0; i<videojuegos.size(); i++) {
			if(videojuegos.get(i).isEntregado() == true) {
				contadorVideojuegos++;
				videojuegos.get(i).devolver();
				
			}
		}
		
		System.out.println("Hay " + contadorSeries + " series entregadas");
		System.out.println("Hay " + contadorVideojuegos + " videojuegos entregados");
		
		FicheroWriter writer = new FicheroWriter();
        writer.writeToFile(series, videojuegos);
		
	}

}
