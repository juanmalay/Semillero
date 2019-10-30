package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.entidades.EstadoEnum;

public class AppTest {

	public void shouldAnswerWithTrue() {

	}
	/**
	 * Metodo que permite validar si dada la suma de dos numero el resultado es el
	 * correcto
	 */
	@Test
	public void primeraPU() {
		Long resultadoEsperado = 2159L;
		Long sumando1 = 1500L;
		Long sumando2 = 659L;
		Long resultado = sumando1 + sumando2;
		Assert.assertEquals(resultado, resultadoEsperado);
	}

	/**
	 * 
	 * Metodo encargado de dada una cadena invertir su posicion y retornarla al
	 * revez
	 * 
	 * @param cadena
	 * @return
	 */
	private String invertirCadena(String cadena) {
		String cadenaInvertida = "";
		for (int x = cadena.length() - 1; x >= 0; x--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(x);
		}
		return cadenaInvertida;
	}
	
	@Test
	public void segundaPrueba() {
		String resultadoEsperado = "leunaM";
		String resultado = invertirCadena("Manuel");
		Assert.assertEquals(resultado, resultadoEsperado);
	}
	
	@Test
	public enum EstadoNum {ACTIVO,INACTIVO}{
		/**
		 * instancia de un enum la clase estadoEnum
		 */
		EstadoEnum activo=EstadoEnum.ACTIVO;
		EstadoEnum inactivo=EstadoEnum.INACTIVO;
		/**
		 * Devuelve un String con el nombre de la constante(ACTIVO)
		 */
		Assert.assertEquals(activo.name(), activo);
		System.out.println("activo.name()="+activo.name());
		/**
		 * Devuelve un String con el nombre de la constante(ACTIVO)
		 */
		Assert.assertEquals(activo.toString(), activo);
		System.out.println("activo.toString()="+activo.toString());
		/**
		 * Devuleve un entero con la posicion del enum segun declarado(0)
		 */
		Assert.assertEquals(activo.ordinal(), 0);
		System.out.println("activo.ordinal()="+activo.ordinal());
		/**
		 * Compara el enum con el parametro segun el orden en el q esten declarados
		 */
		Assert.assertEquals(activo.compareTo(activo), 0);
		System.out.println("activo.compareTo(activo)= "+activo.compareTo(inactivo));
		/**
		 * Devuelve un array que contiene todos los enum
		 */
		Assert.assertEquals(EstadoEnum.values(), null);
		for(EstadoEnum ee: EstadoEnum.values()){
			System.out.println(ee.toString()+" - ");
		}
	}
	
	
	//TODO
	/**
	 * Pendiente hacer un metodo que ise el metodo toString de la entidad COMIC
	 */
}
