package fr.formation.toptrip.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.toptrip.model.Menu;
import fr.formation.toptrip.controller.MainController;
import fr.formation.toptrip.dao.CountryRepository;
import fr.formation.toptrip.entity.Country;

@Controller
public class MainController {

	private static final String KEY_SUFFIX_URL = ".url";
	private static final Logger LOGGER= LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private CountryRepository countryRepository;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		mav.getModel().put("countryList", this.countryRepository.findAll());
		return mav;
		}
		
	private String getMessage(final String key){
		return this.messageSource.getMessage(key,null,Locale.getDefault());
	}
	
}
