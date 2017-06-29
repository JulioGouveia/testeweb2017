package br.com.testeweb2017.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.testeweb2017.dao.MercadoriaDao;
import br.com.testeweb2017.modelo.Mercadoria;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private MercadoriaDao dao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listar() {
		
		ModelAndView modelAndView = new ModelAndView("index");
		List<Mercadoria> listaMercadoria = dao.listaMercadoria();
		modelAndView.addObject("listaMercadorias", listaMercadoria);
		return modelAndView;
	}
	
	
}
