package br.com.meli.anuncios.service.impl;

import br.com.meli.anuncios.dto.AnuncioDto;
import br.com.meli.anuncios.service.AnuncioService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AnuncioServiceImpl implements AnuncioService {


    @Override
    public AnuncioDto create(AnuncioDto anuncioDto) {
        anuncioDto.setId(1L);
        anuncioDto.setIps(Arrays.asList("123","321"));
        return anuncioDto;
    }

    @Override
    public AnuncioDto findById(Long id) {
        return new AnuncioDto(id, "teste", null);
    }

    @Override
    public AnuncioDto findByTitulo(String titulo) {
        return  new AnuncioDto(1L, "teste",null);
    }

    @Override
    public List<AnuncioDto> findAll() {
        List<AnuncioDto> anuncioDtoList = new ArrayList<>();
        AnuncioDto anuncioDto1 = new AnuncioDto(1L, "teste",null);
        AnuncioDto anuncioDto2 = new AnuncioDto(1L, "teste",null);
        anuncioDtoList.add(anuncioDto1);
        anuncioDtoList.add(anuncioDto2);
        return anuncioDtoList;

    }
}
