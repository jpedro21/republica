package com.app.ubox.republica.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.app.ubox.republica.dto.ResidenciaDto;
import com.app.ubox.republica.entity.Residencia;
import com.app.ubox.republica.service.ResidenciaService;

@RestController
@RequestMapping("/residencia")
public class ResidenciaController {
	
	@Autowired
	private ResidenciaService residenciaService;
	
	@GetMapping
	public ResponseEntity<List<ResidenciaDto>> listResidencias() {
		
		return ResponseEntity.status(HttpStatus.OK).body(residenciaService.listResidencias());
	}
	
	@PostMapping
	public ResponseEntity<Void> cadastrarResidencia(@RequestBody ResidenciaDto residenciaDto) {
	
		Residencia residencia =  residenciaService.cadastrarResidencia(residenciaDto);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(residencia.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}

}
