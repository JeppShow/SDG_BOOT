/**
 * 
 */
package com.company.sdg.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.company.sdg.mvc.beans.Login;
import com.company.sdg.mvc.entity.LoginEntity;
import com.company.sdg.mvc.repository.LoginRepository;

/**
 * @author the_d
 *
 */
@Controller
public class LoginController {
	@Autowired
	private LoginRepository loginRepository;
	
	@GetMapping("/login")
	public String getLogin(Model model) {
		model.addAttribute("loginOBJ", new Login());
		return "login";
	}
	
	@GetMapping("/listausuarios")
	public String getUsuarios(Model model) {
		
		List<LoginEntity> usuarios=(List<LoginEntity>)loginRepository.findAll(); //Select * from login
		
		for(LoginEntity user : usuarios) {
			System.out.println("u: "+user.getUsuario_id());
			System.out.println("u: "+user.getNombre1());
			System.out.println("u: "+user.getNombre2());
			System.out.println("u: "+user.getApellido_paterno());
			System.out.println("u: "+user.getApellido_materno());
			System.out.println("u: "+user.getCorreo_electronico());
			System.out.println("u: "+user.getTelefono());
			System.out.println("u: "+user.getEstatus());
			System.out.println("u: "+user.getUsuario());
			System.out.println("u: "+user.getContrasena());
		}
		
		model.addAttribute("listausuarios", usuarios);
		
		return "listausuarios";		
	}
}
