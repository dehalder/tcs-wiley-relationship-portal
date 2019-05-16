package com.wiley.tcs.relationship.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TcsWileyRelationshipPortalWelcomeController {
	private static String USER_VIEW = "cover";

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView showWelcomePage() {
		final ModelAndView mv = new ModelAndView(USER_VIEW);
		return mv;
	}

}