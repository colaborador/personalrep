package AcumulaSumas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *  Este programa realiza sumas acumuladas de enteros.
 */
public class AcumulaSumas {
	
	/**
	 * Metodo mediante el cual comprobamos si el archivo no ha sido creado
	 * @throws FileNotFoundException Excepcion de archivo no encontrado
	 */
	static void checkFile() throws FileNotFoundException{
		if(!Files.exists(Paths.get("entero.txt")))
			throw new FileNotFoundException();
	}

	/**
	 * Metodo mediante el cual conseguimos el valor inicial
	 * @return El valor del fichero, o un 0
	 */
	static int getInitialValue(){		
        try (Scanner scan = new Scanner(new BufferedReader(new FileReader("entero.txt")))) {			
        	checkFile();
        	return scan.nextInt();
		} 
			
		catch (FileNotFoundException | NoSuchElementException e) {//¿Por que considera siempre mi fichero como vacío?
			return 0;
		}
	}
	
	/**
	 * Metodo mediante el cual insertamos valores por teclado
	 * @param scan Scanner
	 * @return Entero introducido
	 */
	static int write(Scanner scan){
		while(!scan.hasNextInt()){
			try{
				scan.nextInt();		
			}
			
			catch(InputMismatchException e){
				System.err.println("Introduce un valor valido (no es un entero");
				scan.next();
			}
		}
		
		return scan.nextInt();
		
	}

	/**
	 * Metodo main
	 * @param args Argumentos
	 * @throws IOException Excepcion de flujos de entrada y salida
	 */
	public static void main(String[] args) throws IOException {
		int num,sum;
		System.out.println("Introduce una serie de numeros enteros, y seran sumados");
		
		try(Scanner scan=new Scanner(System.in);
			PrintWriter printer=new PrintWriter(new FileWriter("entero.txt"));){
			
			sum=getInitialValue();
			while((num=write(scan))!=0)
				sum+=num;
			
			printer.println("Resultado de la suma:\t"+(sum));
		}
	}
}