
package predicados;

import java.util.List;
import java.util.function.Predicate;

public interface ListaValida {

	static boolean checaLista(List<?> lista, Predicate<List<?>> p) {
		return p.test(lista);
	}

	static boolean listaValida(List<?> lista) {

		return checaLista(lista, l -> !l.isEmpty());

	}

}
