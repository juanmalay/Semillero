package com.hbt.semillero.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;

/**
 * 
 * @author Layton
 *
 */

public class ComicDTO implements Serializable{
	public ComicDTO() {
		super();
	}
	/**
	 * representa la clase serializable
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributos que tiene un comic
	 */
	private String id;
	/**
	 * atributo nombre de tipo String
	 */
	private String nombre;
	/**
	 * 
	 */
	private String editorial;
	 //TODO
	private TematicaEnum tematicaEnum;
	/**
	 * 
	 */
	private String coleccion;
	/**
	 * 
	 */
	private Integer numeroPaginas;
	/**
	 * 
	 */
	private BigDecimal precio;
	/**
	 * 
	 */
	private Boolean color;
	/**
	 * 
	 */
	private LocalDate fechaVenta;
    //TODO
	private EstadoEnum estadoEnum;
	/**
	 * 
	 */
	private Long cantidad;
	
	/**
	 * Constructor de la clase
	 * @param id
	 * @param nombre
	 * @param editorial
	 * @param tematica
	 * @param coleccion
	 * @param numeroPaginas
	 * @param precio
	 * @param color
	 * @param fechaVenta
	 * @param estado
	 * @param cantidad
	 */
	
	public ComicDTO(String id, String nombre, String editorial, TematicaEnum tematica, String coleccion,
			Integer numeroPaginas, BigDecimal precio, Boolean color, LocalDate fechaVenta, EstadoEnum estado,
			Long cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.editorial = editorial;
		this.tematicaEnum = tematica;
		this.coleccion = coleccion;
		this.numeroPaginas = numeroPaginas;
		this.precio = precio;
		this.color = color;
		this.fechaVenta = fechaVenta;
		this.estadoEnum = estado;
		this.cantidad = cantidad;
	}
	/**
	 * Constructor de la clase
	 * @param id
	 * @param nombre
	 */
	public ComicDTO(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public TematicaEnum getTematica() {
		return tematicaEnum;
	}
	public void setTematica(TematicaEnum tematica) {
		this.tematicaEnum = tematica;
	}
	public String getColeccion() {
		return coleccion;
	}
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Boolean getColor() {
		return color;
	}
	public void setColor(Boolean color) {
		this.color = color;
	}
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public EstadoEnum getEstado() {
		return estadoEnum;
	}
	public void setEstado(EstadoEnum estado) {
		this.estadoEnum = estado;
	}
	public Long getCantidad() {
		return cantidad;
	}
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	
}
