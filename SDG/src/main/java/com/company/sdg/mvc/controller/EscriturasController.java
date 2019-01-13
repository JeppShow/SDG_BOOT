/**
 * 
 */
package com.company.sdg.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author the_d
 *
 */
@Controller
public class EscriturasController {
	@GetMapping("/escrituras")
	public String getMenu(Model model) {
		
		return "escrituras";
	}
}
