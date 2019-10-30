package com.hbt.semillero.entidades;
/**
 * 
 * @author Layton
 *
 */
public enum TematicaEnum {
	
	AVENTURAS("enum.tematica.aventuras"), BELICO("enum.tematica.belico")
	,HUMORISTICO("enum.tematica.humoristico"),DEPORTIV0("enum.tematica.deportivo")
	,FANTASTICO("enum.tematica.fantastico"),CIENCIA_FICCION("enum.tematica.ciencia_ficcion")
	,HISTORICO("enum.tematica.historico"),HORROR("enum.tematica.horror");
	private String codigoMensaje;

	private TematicaEnum(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

	public String getCodigoMensaje() {
		return codigoMensaje;
	}

	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	

}
