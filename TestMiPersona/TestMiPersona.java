import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.util.GregorianCalendar;
/**
 * Implementa el programa "TestMiPersona.java" que:
 * Guarde un objeto persona en un flujo con los siguientes datos:
 * Tu nombre
 * Tus apellidos
 * Tu fecha de nacimiento (utiliza la clase Calendar)
 * Recupere el objeto persona y muestre:
 *  Tu nombre
 *  Tus apellidos
 *  Tu edad
 *  
 */
public class TestMiPersona {
	public static void main(String[] args) throws IOException{
		Persona persona=new Persona("Pepe","Sanchez",1990,10,10);
		
		try(ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("persona.ser"));
			ObjectInputStream input=new ObjectInputStream(new FileInputStream("persona.ser"))){
			
			output.writeObject(persona);
			System.out.println(input.readObject());
		}
		
		//Captura de excepciones
		catch(NotSerializableException e){
			System.err.println("Clase no serializada");
		}
		
		catch(FileNotFoundException e){
			System.err.println("Archivo inexistente");
		}
		
		catch(ClassNotFoundException e){
			System.err.println("Clase inexistente");
		}
	}
}