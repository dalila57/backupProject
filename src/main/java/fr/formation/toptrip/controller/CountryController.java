package fr.formation.toptrip.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.toptrip.dao.CountryRepository;
import fr.formation.toptrip.entity.City;
import fr.formation.toptrip.entity.Country;

@Controller
@RequestMapping("/pays")
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@RequestMapping("/index")
	public ModelAndView index(@RequestParam final Integer countryID) {
		final ModelAndView mav = new ModelAndView("country");
		
		Country country = this.countryRepository.findOne(countryID);
		mav.getModel().put("countryDetails", country);
		
		mav.getModel().put("documents", country.getSuitcase().getDocuments());
		mav.getModel().put("medecines", country.getSuitcase().getMedecines());
		mav.getModel().put("multimedias", country.getSuitcase().getMultimedias());
		mav.getModel().put("hygieneobjects", country.getSuitcase().getHygieneObjects());
		
		List<City> cities = new ArrayList<>(country.getCityList());
        Collections.sort(cities, new Comparator<City>() {

            @Override
            public int compare(City o1, City o2) {
                return o1.getCityID().compareTo(o2.getCityID());
            }
            
        });
        mav.getModel().put("cities", cities);
        return mav;
    }
	
}
