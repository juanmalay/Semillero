package com.hbt.semillero.pojo;

import java.util.List;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.Comic;

public class GestionComicPojo {
	
	private List<ComicDTO> listaComics = null;
	/**
	 * Continuar llenando para el juevs
	 */
	public void crearComicDTO() {
		ComicDTO comicDTO=new ComicDTO();
	}

	public List<ComicDTO> getListaComics() {
		return listaComics;
	}

	public void setListaComics(List<ComicDTO> listaComics) {
		this.listaComics = listaComics;
	}

}
