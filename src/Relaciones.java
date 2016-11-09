import org.graphstream.*;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.*;
import org.graphstream.graph.Edge; 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Relaciones {
	
	public Graph grafo = new SingleGraph("Ciudades de Guatemala"); 
	public ArrayList<ArrayList> matriz = new ArrayList(); 
	
	public void Pruebas(String direccion){
        BufferedReader crunchifyBuffer = null;

        try {
            String crunchifyLine;
            crunchifyBuffer = new BufferedReader(new FileReader(direccion));

            // How to read file in java line by line?
            while ((crunchifyLine = crunchifyBuffer.readLine()) != null) {

                matriz.add(crunchifyCSVtoArrayList(crunchifyLine));

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (crunchifyBuffer != null) crunchifyBuffer.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    // Utility which converts CSV to ArrayList using Split Operation
    public static ArrayList<String> crunchifyCSVtoArrayList(String crunchifyCSV) {
        ArrayList<String> crunchifyResult = new ArrayList<String>();

        if (crunchifyCSV != null) {
            String[] splitData = crunchifyCSV.split("\\s*;\\s*");
            for (int i = 0; i < splitData.length; i++) {
                if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
                    crunchifyResult.add(splitData[i].trim());
                }
            }
        }

        return crunchifyResult;

    }
	
	
	
	
	
	public void crearNodo(String ciudad){
		grafo.addNode(ciudad); 
	}
	
	public void crearRelacion(String ciudadOrigen, String ciudadDestino, int distancia){
		Edge eje = grafo.addEdge(ciudadOrigen + ciudadDestino, ciudadOrigen, ciudadDestino); 
		eje.addAttribute("distancia", distancia);
		
	}
	
	
}
