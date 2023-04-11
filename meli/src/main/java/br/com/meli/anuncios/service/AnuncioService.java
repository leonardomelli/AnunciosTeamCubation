package br.com.meli.anuncios.service;

import br.com.meli.anuncios.dto.AnuncioDto;

import java.util.List;

public interface AnuncioService {


    public AnuncioDto create(AnuncioDto anuncioDto);

    public AnuncioDto findById(Long id);
    public AnuncioDto findByTitulo(String titulo);
    public List<AnuncioDto> findAll();
}
