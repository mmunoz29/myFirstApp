package mx.com.mag.myFirstApp.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.mag.myFirstApp.model.UsuarioModel;

public interface UsuarioController extends JpaRepository<UsuarioModel, Long> {

}
