package condicional;

import java.util.Scanner;

public class Anidado {
	
	Scanner entrada;

	public Anidado() {
		entrada = new Scanner(System.in);
	}
	

	public void numeros() {

		int n;
		String res;
		
		System.out.println("Ingrese un número");
		n = entrada.nextInt();
		
		if(n > 0) {
			res = "Positivo";
		}else {
			if(n < 0) {
				res = "Negativo";
			}else {
				res = "Neutro";
			}
		}//fin if
		
		System.out.println("El resultado es: " + res);
		
	}
	
	
	public void numeros2() {
		
		int n;
		String res;
		
		System.out.println("Ingrese un número");
		n = entrada.nextInt();
		
		if(n > 0) {
			res = "Positivo";
		}else if(n < 0) {
			res = "Negativo";
		}else {
			res = "Neutro";
		}//fin if
		System.out.println("El resultado es: " + res);
	}//fin numeros2
	
	public void calcularMontos() {
		
		double desc, montoFinal, montoDesc, importeImp;
		final double IGV = 0.18;

		System.out.println("Ingrese un monto por favor");
		double monto = entrada.nextDouble();
		
		if(monto <= 100) {
			desc = 0.1;
		}else if(monto <= 200){
			desc = 0.2;
		}else {
			desc = 0.3;
		}
		
		montoDesc = monto * desc;
		System.out.println("Monto a descontar: " + montoDesc);
		
		montoFinal = monto - montoDesc;
		System.out.println("Monto final solo con descuento: " + montoFinal);
		
		importeImp = montoFinal * IGV;
		System.out.println("Importe impuesto: " + importeImp);
		
		montoFinal = montoFinal + importeImp;
		System.out.println("Monto final con impuesto: " +  montoFinal);
	}
	
	
	public void validacion() {
		String usu, con;
		
		System.out.println("Ingrese Usuario");
		usu = entrada.nextLine();
		
		System.out.println("Ingrese contraseña");
		con = entrada.nextLine();
		
		
		if(usu.equals("aLeandro") || con.equals("1234")) {
			System.out.println("Bienvenido al sistema");//V
		}else {
			System.out.println("Error de validación");//F
		}
		
//		System.out.println("usu:" + usu);
//		System.out.println("con: " + con);
	}
}
