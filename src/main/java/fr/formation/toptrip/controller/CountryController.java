package fr.formation.toptrip.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.toptrip.dao.CountryRepository;
import fr.formation.toptrip.entity.Country;

@Controller
@RequestMapping("/pays")
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@RequestMapping("/index")
	public ModelAndView index(@RequestParam final Integer countryID) {
		final ModelAndView mav = new ModelAndView("country");
		mav.getModel().put("countryDetails", this.countryRepository.findOne(countryID));
		return mav;
	}
	
	
}
