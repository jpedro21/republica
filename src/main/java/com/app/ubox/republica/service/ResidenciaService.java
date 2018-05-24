package com.app.ubox.republica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ubox.republica.business.ResidenciaBusiness;
import com.app.ubox.republica.dto.ResidenciaDto;
import com.app.ubox.republica.entity.Residencia;

@Service
public class ResidenciaService {
	
	@Autowired
	private ResidenciaBusiness residenciaBusiness;
	
	public List<ResidenciaDto> listResidencias() {
		
		return residenciaBusiness.listResidencias();
	}

	public Residencia cadastrarResidencia(ResidenciaDto residenciaDto) {
		
		return residenciaBusiness.cadastrarResidencia(residenciaDto);
	}
}
