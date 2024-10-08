package actividad6;

import java.io.File;
import java.io.IOException;

public class Actividad6 {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("grep", "hugo");
		
		pb.redirectInput(new File("origen.txt"));
		pb.redirectOutput(new File("destino.txt"));
		
		Process p = pb.start();
	}
}
