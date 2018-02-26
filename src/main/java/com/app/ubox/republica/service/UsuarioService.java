package com.app.ubox.republica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ubox.republica.business.UsuarioBusiness;
import com.app.ubox.republica.dto.UsuarioDto;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioBusiness userBusiness;
	
	public void cadastrarUsuario(UsuarioDto userDto) {
		
		userBusiness.cadastrarUsuario(userDto);		
	}

}
