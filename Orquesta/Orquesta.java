import java.util.ArrayList;

/**
 * Interfaz con el conjunto de metodos propios de una orquesta
 */
public interface Orquesta {
	void afinarTodos(ArrayList<Instrumento> orquesta);
	void tocarTodos(ArrayList<Instrumento> orquesta);
}
