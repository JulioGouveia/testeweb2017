package br.com.testeweb2017.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.testeweb2017.dao.MercadoriaDao;
import br.com.testeweb2017.modelo.Mercadoria;

@Controller
@RequestMapping("/cadastrar")
public class MercadoriaController {

	@Autowired
	private MercadoriaDao dao;

	@RequestMapping(method = RequestMethod.GET)
	public String cadastra() {
		
		return "formulario";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView form(Mercadoria mercadoria) {
		
		ModelAndView modelAndView = new ModelAndView("redirect:/");
		dao.cadastra(mercadoria);
		return modelAndView;
	}
	
	@RequestMapping("/delete")
	public String delete(Integer id) {
		System.out.println(id);
		dao.delete(id);
		return "redirect:/";
	}
}
