package fr.formation.toptrip.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.toptrip.dao.CountryRepository;
import fr.formation.toptrip.entity.Country;

@Controller
@RequestMapping("/country")
@SessionAttributes({ "countryList"})
public class CountryController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
	
	@Autowired
	private CountryRepository countryRepository;
	
	@ModelAttribute
	public List<Country> countryList () {
		return new ArrayList<>();
	}

	@RequestMapping("/index")
	public ModelAndView showCountry(@RequestParam final String countryName){
		final ModelAndView mav = new ModelAndView("country");
		mav.getModel().put("countryList", this.countryRepository.findAll());
		CountryController.LOGGER.warn("liste country classe country :", countryList());
		
		return mav;
	}
}
