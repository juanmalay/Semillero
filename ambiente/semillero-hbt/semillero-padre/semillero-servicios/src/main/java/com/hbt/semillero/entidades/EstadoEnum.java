package com.hbt.semillero.entidades;

public enum EstadoEnum {

	ACTIVO("enum.estado.activo"), INACTIVO("enum.estado.inactivo");
	private String codigoMensaje;
	
	

	private EstadoEnum(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

	public String getCodigoMensaje() {
		return codigoMensaje;
	}

	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	
}
