import java.util.ArrayList;

public class Musica implements Orquesta{
	ArrayList<Instrumento> orquesta;
	
	/**
	 * Constructor de la clase musica
	 * @param orquesta ArrayList del conjunto de instrumentos
	 */
	Musica(ArrayList<Instrumento> orquesta){
		this.orquesta=orquesta;
	}
	/**
	 * Metodo get que devuelve un arraylist con el conjunto de instrumentos
	 * @return ArrayList de instrumentos
	 */
	public ArrayList<Instrumento> getOrquesta() {
		return orquesta;
	}

	/**
	 * Metodo para afinar todos los instrumentos
	 */
	@Override
	public void afinarTodos(ArrayList<Instrumento> orquesta) {
		for(int i=0;i<orquesta.size();++i)
			System.out.println(orquesta.get(i).afinar());	
	}

	/**
	 * Metodo para tocar todos los instrumentos
	 */
	@Override
	public void tocarTodos(ArrayList<Instrumento> orquesta) {
		for(int i=0;i<orquesta.size();++i){
			System.out.println(orquesta.get(i).getInstrumento()+":"+(orquesta.get(i).tocar(Nota.DO)));
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Instrumento> orquesta=new ArrayList<Instrumento>();
	
		orquesta.add(new Viento("Flauta"));
		orquesta.add(new Percusion("Bateria"));
		orquesta.add(new Cuerda("Violin"));
		
		
		Musica musica=new Musica(orquesta);
		musica.afinarTodos(orquesta);
		musica.tocarTodos(orquesta);
	}
}