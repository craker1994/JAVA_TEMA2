package estructuraselectiva;

import java.util.Scanner;

public class Selectiva {
	
	Scanner entrada;

	//constructor
	public Selectiva() {
		entrada = new Scanner(System.in);
	}
	
	public void estaciones() {		
		String res = "";		
		System.out.println("Ingrese un número de estacion");
		int estacion = entrada.nextInt();
		
		switch(estacion) {
			case 1: res = "Verano"; break;
			case 2: res =  "Invierno"; break;
			case 3: res = "Otoño"; break;
			case 4: res = "Primavera"; break;
			default: res = "Valor incorrecto";
		}//fin switch		
		System.out.println("La estación es: " + res);		
		
	}
	
	public String vocales() {
		String vocal, res = "No";
		
		System.out.println("Ingrese una vocal");
		vocal = entrada.nextLine();
		
		switch(vocal) {
			case "a": res = "Si"; break;
			case "e": res = "Si"; break;
			case "i": res = "Si"; break;
			case "o": res = "Si"; break;
			case "u": res = "Si"; break;
		}		
//		System.out.println("Resultado: " + res + " es vocal");
		return res;
		
	}
	
	
	public void bucle1() {
		
		int n;
		int c = 1;
		int s = 0;
		
		System.out.println("Ingrese numero");
		n = entrada.nextInt();
		
		while(c <= n) {
			s = s + c;
			c = c + 1;
		}
		
		System.out.println("Suma total: " + s);
	}
	
	
}
