package kr.or.connect.restaurant_map.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.connect.restaurant_map.dto.Chicken;
import kr.or.connect.restaurant_map.service.ChickenService;

import kr.or.connect.restaurant_map.dto.Cafe;
import kr.or.connect.restaurant_map.service.CafeService;

import kr.or.connect.restaurant_map.dto.DDuck;
import kr.or.connect.restaurant_map.service.DDuckService;

@Controller
public class RestaurantController {
	@Autowired
	ChickenService chickenService;
	
	@Autowired
	CafeService cafeService;
	
	@Autowired
	DDuckService dduckService;
	
	@GetMapping(path="/")
	public String list(@RequestParam(name="start",required=false, defaultValue="0") int start, ModelMap model) {
		
		//chicken
		List<Chicken> top3chicken = chickenService.getTop3Chicken(start);
		List<Chicken> groupByLocChicken = chickenService.getGroupByLocChicken();
		model.addAttribute("top3chicken",top3chicken);
		model.addAttribute("groupByLocChicken", groupByLocChicken);
		
		//cafe
		List<Cafe> top3cafe = cafeService.getTop3Cafe(start);
		List<Cafe> groupByLocCafe = cafeService.getGroupByLocCafe();
		model.addAttribute("top3cafe",top3cafe);
		model.addAttribute("groupByLocCafe", groupByLocCafe);
		
		//dduck
		List<DDuck> top3dduck = dduckService.getTop3DDuck(start);
		List<DDuck> groupByLocDDuck = dduckService.getGroupByLocDDuck();
		model.addAttribute("top3dduck",top3dduck);
		model.addAttribute("groupByLocDDuck", groupByLocDDuck);
				
		return "index";
	}
	
	
}
