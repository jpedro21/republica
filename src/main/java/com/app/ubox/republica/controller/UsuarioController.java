package com.app.ubox.republica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ubox.republica.dto.UsuarioDto;
import com.app.ubox.republica.service.UsuarioService;

@RestController
@RequestMapping("/user")
public class UsuarioController {
	
	@Autowired
	private UsuarioService userService;
	
	@PostMapping
	public void cadastrarUsuario(@RequestBody UsuarioDto userDto) {
		
		userService.cadastrarUsuario(userDto);
	}
}
