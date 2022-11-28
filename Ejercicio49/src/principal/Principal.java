package principal;

public class Principal {
	public static void main (String [] args) {
		System.out.println("\r\n"	
				+ "MÉTODO						||DESCRIPCIÓN\r\n"
				+ "length()					||Nos sirve para conocer la longitud de la cadena\r\n"
				+ "indexOf(‘caracter’)				||Nos entrega la ubicación, el índice, de la primera aparición del carácter buscado.\r\n"
				+ "lastIndexOf(‘caracter’)				||Nos entrega la ubicación, el índice, de la última aparición del carácter buscado.\r\n"
				+ "charAt(n)					||Nos muestra qué carácter se encuentra en la posición solicitada entre paréntesis.\r\n"
				+ "substring(n1,n2)				||Este método nos devuelve la subcadena que se encuentra entre las posiciones n1 y n2-1\r\n"
				+ "toUpperCase()					||Convierte toda la cadena a mayúsculas\r\n"
				+ "toLowerCase()					||Convierte toda la cadena a minúsculas.\r\n"
				+ "equals(«cad»)					||Compara dos cadenas y nos informa True si son iguales\r\n"
				+ "equalsIgnoreCase(«cad»)				||Compara dos cadenas y nos informa True si son iguales y no considera mayúsculas y minúsculas\r\n"
				+ "compareTo(OtroString)				||Uno de los métodos más utilizados, nos devuelve 0 si ambas cadenas son iguales. <0 si la primera es alfabéticamente menor que la segunda ó >0 si la primera es alfabéticamente mayor que la segunda.\r\n"
				+ "String trim()					||Devuelve la copia de la cadena, elimina los espacios en blanco en los extremos, pero no afecta los espacios en blanco intermedios.\r\n"
				+ "valueOf(N)					||Nos sirve para convertir el valor N a String. N puede ser de cualquier tipo.\r\n"
				+ "String replace (char oldChar, char newChar)	||Devuelve una nueva cadena al reemplazar todas las ocurrencias de oldChar con newChar ");
	}
}
