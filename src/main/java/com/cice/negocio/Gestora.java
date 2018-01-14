package com.cice.negocio;

import java.util.ArrayList;
import java.util.Scanner;

import com.cice.modelo.Punto;

/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */

public class Gestora {
	
private ArrayList <Punto> listaPuntos= new ArrayList <>();	
	
	public void showMenu() {
		Scanner sc = new Scanner (System.in);
		int opcion = 0;
		
		do {
			System.out.println("------------------------------------");
			System.out.println("Bienvenido a tu gestor de coordenadas");
			System.out.println("Esto es lo que puedo hacer por ti:");
			System.out.println("1. Crear Punto");
			System.out.println("2. Eliminar Punto");
			System.out.println("3. Mostrar Punto");	
			System.out.println("4. Calcular Distancia entre dos Puntos");
			System.out.println("5. Calcular Distancia entre un Punto y el Centro de Coordenadas");
			System.out.println("0. Salir");
			System.out.println("------------------------------------");
			opcion = sc.nextInt();
			
			controles (opcion);			
		}while (opcion!=0);
		sc.close();
	}
	
	private void controles (int opcion) {
		switch (opcion){
			case 0:
				break;
			case 1:
				//Crear Punto
				crearPunto();
				break;
			case 2:
				//Eliminar Punto
				eliminarPunto();
				break;
			case 3:
				//Mostrar Punto
				mostrarPunto();
				break;	
			case 4:
				calculaDistancia();
				break;		
				
			case 5:
				calculaDistanciaCentro();
				break;
			default:
				System.out.println("la opcion seleccionada no es valida");
				
				
		}
	}
	
	private void crearPunto() {
		
		Punto punto;
		float x, y;

		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la coordenada X");
		x = sc.nextFloat();
		System.out.println("Introduzca la coordenada Y");
		y = sc.nextFloat();
		punto = new Punto (x,y);
		listaPuntos.add(punto);
		
	}
	
	private void mostrarPunto() {		
			
		int opcion = 0;
			if(listaPuntos.size()>0) {
			for (Punto punto : listaPuntos) {
				System.out.println("------------------------------------------------");
				System.out.println(opcion+1 + ") " + punto.toString());
				opcion++;
			}
			System.out.println("------------------------------------------------");
			}
			else {
				System.out.println("El Gestor esta vacio todavia debe crear un punto antes");
			}
		}
	
	private void calculaDistancia() {
		int opcion1 = 0;
		int seleccion1 = 0;
		int opcion2 = 0;
		int seleccion2 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		if(listaPuntos.size()>0) {
			for (Punto punto : listaPuntos) {
				System.out.println("------------------------------------------------");
				System.out.println("Seleccione un punto");
				System.out.println(opcion1+1 + ") " + punto.toString());
				opcion1++;
			}
		System.out.println("------------------------------------------------");
		seleccion1 = sc.nextInt();
		seleccion1--;
		
		for (Punto punto : listaPuntos) {
			System.out.println("------------------------------------------------");
			System.out.println("Seleccione otro punto");
			System.out.println(opcion2+1 + ") " + punto.toString());
			opcion2++;
		}
	System.out.println("------------------------------------------------");
	seleccion2 = sc.nextInt();
	seleccion2--;
		if(seleccion1 < listaPuntos.size() && seleccion2 < listaPuntos.size()) {
			System.out.println(listaPuntos.get(seleccion1).calculaDistanciaPuntos(listaPuntos.get(seleccion2)));
			
		}
		else {
			System.out.println("Opcion erronea");
		}
		
		}
		else {
			System.out.println("El Gestor esta vacio todavia debe crear un punto antes");
		}
		
	}
	
	private void calculaDistanciaCentro() {
		int opcion1 = 0;
		int seleccion1 = 0;
		
		
		Scanner sc = new Scanner (System.in);
		
		if(listaPuntos.size()>0) {
			for (Punto punto : listaPuntos) {
				System.out.println("------------------------------------------------");
				System.out.println("Seleccione un punto");
				System.out.println(opcion1+1 + ") " + punto.toString());
				opcion1++;
			}
		System.out.println("------------------------------------------------");
		seleccion1 = sc.nextInt();
		seleccion1--;
		
		
		if(seleccion1 < listaPuntos.size()) {
			System.out.println(listaPuntos.get(seleccion1).calculaDistanciaCentroCoordenadas());
			
		}
		else {
			System.out.println("Opcion erronea");
		}
		
		}
		else {
			System.out.println("El Gestor esta vacio todavia debe crear un punto antes");
		}
		
	}
		
	private void eliminarPunto() {
		int opcion = 0;
		int seleccion = 0;
		Scanner sc = new Scanner (System.in);
		
		if(listaPuntos.size()>0) {
			for (Punto punto : listaPuntos) {
				System.out.println("------------------------------------------------");
				System.out.println("Seleccione un punto a eliminar");
				System.out.println(opcion+1 + ") " + punto.toString());
				opcion++;
			}
		System.out.println("------------------------------------------------");
		seleccion = sc.nextInt();
		seleccion--;
		if(seleccion < listaPuntos.size()) {
			listaPuntos.remove(seleccion);
		}
		else {
			System.out.println("Opcion erronea");
		}
		
		}
		else {
			System.out.println("El Gestor esta vacio todavia debe crear un punto antes");
		}
		
	}
	

}
