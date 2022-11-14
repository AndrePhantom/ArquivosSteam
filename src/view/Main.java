package view;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Controller.Steam_Controller;


public class Main {

	public static void main(String[] args) {
		String path = "C:\\Users\\André\\Desktop\\FATEC\\FATEC Zona Leste\\3° Semestre 2022\\Sistemas Operacionais 1 - Colevati\\SteamCharts.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			Steam_Controller procurarJogos = new Steam_Controller();
			
			while(line != null) {
				if(line.contains("June") && line.contains("2019") && line.contains("389376.72")) {
					System.out.println(procurarJogos.toString());
				}
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		
		
		

	}

}
