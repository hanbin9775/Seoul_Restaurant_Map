package kr.or.connect.restaurant_map.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.connect.restaurant_map.dto.Chicken;
import kr.or.connect.restaurant_map.service.ChickenService;

@Controller
public class ChickenController {
	@Autowired
	ChickenService chickenService;
	
	@GetMapping(path="/")
	public String list(@RequestParam(name="start",required=false, defaultValue="0") int start, ModelMap model) {
	
		List<Chicken> top3 = chickenService.getTop3Chicken(start);
		
		model.addAttribute("top3",top3);
		
		return "index";
	}
	
	
}
