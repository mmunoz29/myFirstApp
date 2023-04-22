package mx.com.mag.myFirstApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import mx.com.mag.myFirstApp.controller.UsuarioController;
import mx.com.mag.myFirstApp.model.UsuarioModel;

@RestController
public class UsuarioRest {

	@Autowired
	private UsuarioController usuarioController; 
	
	@PostMapping(value = "/guardarUsuario")
	public String guardarUsuario(@RequestBody UsuarioModel usuario) {
		 
		return usuarioController.save(usuario) != null ? "usuario guardado" : "Error al guardar";
	}
	
	@GetMapping(value = "/buscarUsuarios")
	public List<UsuarioModel> buscarUsuarios() {
		return usuarioController.findAll();
	}
	
	@PutMapping(value = "/actualizarUsuario/{id}")
	public String actualizarUsuario(@PathVariable long id, @RequestBody UsuarioModel usuario) {
		
		UsuarioModel u = usuarioController.getOne(id);
		
		u.setUsuario(usuario.getUsuario());
		u.setContrasena(usuario.getContrasena());
		
		return usuarioController.save(u) != null ? "usuario actualizado" : "Erros al actualizar"; 
	}
	
}
