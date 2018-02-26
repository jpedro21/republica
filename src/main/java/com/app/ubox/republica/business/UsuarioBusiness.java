package com.app.ubox.republica.business;

import org.joda.time.LocalDate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.ubox.republica.dto.UsuarioDto;
import com.app.ubox.republica.entity.Usuario;
import com.app.ubox.republica.repository.UsuarioRepository;

@Component
public class UsuarioBusiness {
	
	@Autowired
	private UsuarioRepository userRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	public void cadastrarUsuario(UsuarioDto userDto) {
		
		Usuario user = modelMapper.map(userDto, Usuario.class);
		user.setDataCad(LocalDate.now());
		userRepository.save(user);
	}

}
