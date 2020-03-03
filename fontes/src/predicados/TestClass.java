package predicados;

import java.util.ArrayList;

public class TestClass implements ListaValida{
	public static void main(String[] args) {
		boolean a = ListaValida.listaValida(new ArrayList<String>());
		System.out.println(a);
	}
}
