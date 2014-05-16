/**
 *  Implementa la siguiente jerarquía de clases:
 *  
 *  Clase abstracta Instrumento:
 *  	Campo privado Instrumento
 *  	Método abstracto tocar(Nota)
 *  	Método público queSoy() que devuelva la cadena "Instrumento"
 *  	Método abstracto afinar(); Para futuras implementaciones, recuerda que para afinar hay que tocar un conjunto de notas.
 *  
 *  Enumeración Nota
 *  	Toma los siete valores constantes DO, RE, MI, FA, SOL, LA, SI.
 *  
 *  Clase Viento que hereda de Instrumento
 *   Implementa los métodos necesarios (que muestre mensaje y argumento si lo tiene)
 *   redefine el método queSoy() que devuelva la cadena "Instrumento de Viento"
 *  
 *  Clase Percusion que hereda de Instrument
 *   Implementa los métodos necesarios (que muestre mensaje y argumento si lo tiene)
 *   redefine el método queSoy() que devuelva la cadena "Instrumento de Percusión"
 *  
 *  Clase Cuerda que hereda de Instrumento
 *   Implementa los métodos necesarios (que muestre mensaje y argumento si lo tiene)
 *   redefine el método queSoy() que devuelva la cadena "Instrumento de Cuerda"
 *  
 *  Clase Musica
 *   Implementa el método main() que cree una orquesta con todos un instrumento de cada tipo.
 *   Implementa un método afinarTodos() que afine todos los instrumentos.
 *   Implementa un método tocarTodos() que toque todos los instrumentos.
 *   
 */
public abstract class Instrumento {
	//Atributos
	private String instrumento;

	//Constructor
	/**
	 * Constructor de instrumento
	 * @param instrumento String que designa el nombre del instrumento
	 */
	Instrumento(String instrumento){
		this.instrumento=instrumento;
	}
	
	//Metodos set y get
	/**
	 * Metodo get del instrumento
	 * @return Cadena con el nombre del instrumento
	 */
	protected String getInstrumento() {
		return instrumento;
	}
	
	//Metodos
	abstract String afinar(); //Metodo para afinar un instrumento
	abstract String tocar(Nota nota); //Metodo para tocar una nota
	
	/**
	 * Metodo que devuelve el nombre del instrumento
	 * @return Nombre del instrumento
	 */
	String queSoy(){
		return instrumento;
	}	

}
/**
 * Enumeracion del conjunto de notas
 */
enum Nota{
	DO,RE,MI,FA,SOL,LA,SI;
}

/**
 * Clase que designa los instrumentos de viento
 */
class Viento extends Instrumento{
	/**
	 * Constructor de un instrumento de viento
	 * @param instrumento Cadena con el nombre del instrumento
	 */
	Viento(String instrumento){
		super(instrumento);
	}

	/**
	 * Metodo sobrescrito de la clase abstracta para tocar una nota
	 */
	@Override
	String tocar(Nota nota) {
			return "\u266B"+nota.name()+"\u266B ";	
	}

	/**
	 * Metodo sobrescrito de la clase abstracta para afinar un instrumento
	 */
	@Override
	String afinar() {
		return "Afinando mi "+super.queSoy().toLowerCase()+": "+tocar(Nota.MI)+tocar(Nota.RE)+tocar(Nota.MI);
	}
	
	/**
	 * Metodo sobrescrito de la clase abstracta que devuelve el nombre del instrumento y su tipo
	 */
	@Override
	String queSoy(){
		return "Soy un instrumento de viento. En concreto soy un "+super.queSoy().toLowerCase();
	}
}

/**
 * Clase que designa los instrumentos de percusion
 */
class Percusion extends Instrumento{
	/**
	 * Constructor de los instrumentos de percusion
	 * @param instrumento Nombre del instrumento
	 */
	Percusion(String instrumento){
		super(instrumento);
	}

	/**
	 * Metodo sobrescrito de la clase abstracta para tocar una nota
	 */
	@Override
	String tocar(Nota nota) {
		return "\u266B"+nota.name()+"\u266B ";	
	}

	/**
	 * Metodo sobrescrito de la clase abstracta para afinar un instrumento
	 */
	@Override
	String afinar() {
		return "Afinando mi "+super.queSoy().toLowerCase()+": "+tocar(Nota.FA)+tocar(Nota.RE)+tocar(Nota.MI);
	}
	
	/**
	 * Metodo sobrescrito de la clase abstracta que devuelve el nombre y tipo de instrumento
	 */
	@Override
	String queSoy(){
		return "Soy un instrumento de percusion. En concreto soy un "+super.queSoy().toLowerCase();
	}
}

/**
 * Clase correspondiente a los instrumentos de cuerda
 */
class Cuerda extends Instrumento{
	
	/**
	 * Constructor de los instrumentos de cuerda
	 * @param instrumento Nombre del instrumento
	 */
	Cuerda(String instrumento){
		super(instrumento);
	}

	/**
	 * Metodo sobrescrito de la clase abstracta para tocar una nota
	 */
	@Override
	String tocar(Nota nota) {
		return "\u266B"+nota.name()+"\u266B ";	
	}

	/**
	 * Metodo sobrescrito de la clase abstracta para afinar un instrumento
	 */
	@Override
	String afinar() {
		return "Afinando mi "+super.queSoy().toLowerCase()+": "+tocar(Nota.SI)+tocar(Nota.RE)+tocar(Nota.MI);
	}
	
	/**
	 * Metodo sobrescrito de la clase abstracta que devuelve el nombre y tipo de instrumento
	 */
	@Override
	String queSoy(){
		return "Soy un instrumento de cuerda. En concreto soy un "+super.queSoy().toLowerCase();
	}
}