package modelo.fichero;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ManejoFicheros {


	public static List<String>leerFicheroCompletoFilas(String nombreFichero){
		Path FicheroEntrada=Paths.get(nombreFichero);
		List<String>contenido=null;
		
		try {
			contenido=Files.readAllLines(FicheroEntrada, StandardCharsets.ISO_8859_1);
			
		}catch(IOException e) {
			
			System.out.println(e.getMessage());
		}
		return contenido;
	}
	
}


