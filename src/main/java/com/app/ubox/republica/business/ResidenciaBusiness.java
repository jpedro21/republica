package com.app.ubox.republica.business;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.ubox.republica.dto.ResidenciaDto;
import com.app.ubox.republica.entity.Residencia;
import com.app.ubox.republica.repository.ResidenciaRepository;

@Component
public class ResidenciaBusiness {
	
	@Autowired
	private ResidenciaRepository residenciaRepository;
	
	public List<ResidenciaDto> listResidencias() {
		
		ModelMapper modelMapper = new ModelMapper();
		
		return residenciaRepository.findAll()
				.stream()
				.map(r -> modelMapper.map(r, ResidenciaDto.class))
				.collect(Collectors.toList());
	}

	public Residencia cadastrarResidencia(ResidenciaDto residenciaDto) {
		
		ModelMapper modelMapper = new ModelMapper();
		
		Residencia residencia = modelMapper.map(residenciaDto, Residencia.class);
		residencia.setId(null);	
		return residenciaRepository.save(residencia);
	}
}
