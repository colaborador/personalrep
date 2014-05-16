import java.util.Calendar;
import java.util.GregorianCalendar;

/*
* Clase con los atributos de una persona
*/
public class Persona implements java.io.Serializable{
	private String nombre, apellidos;
	private Calendar fecha;
	

	/**
	 * Constructor de persona
	 * @param nombre Nombre 
	 * @param apellidos Apellidos
	 * @param anyo Año de nacimiento
	 * @param mes Mes
	 * @param dia Dia
	 */
	Persona(String nombre, String apellidos, int anyo, int mes, int dia){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fecha=new GregorianCalendar(anyo,mes,dia);
	}
	

	/**
	 * Metodo get de nombre
	 * @return El nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo get de apellidos
	 * @return Los apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * Metodo get de la fecha
	 * @return La fecha
	 */
	public String getFecha(){
		return String.valueOf(fecha.get(Calendar.DAY_OF_MONTH)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.YEAR));
	}
	
	/**
	 * Metodo toString sobrescrito
	 */
	@Override
	public String toString() {
		return "Nombre completo:"+nombre+" "+apellidos+"\nFecha de nacimiento:"+ getFecha();
	}
}
