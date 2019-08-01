package com.jm3007.learn.spring.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/items")
public class ItemController {

	private Map<String, String> items = new HashMap<>();

	public ItemController() {
		items.put("1001", "Item One");
		items.put("1002", "Item Two");
		items.put("1003", "Item Three");
		items.put("1004", "Item Four");
	}

	@RequestMapping(value = "/name/{id}/fun", method = RequestMethod.GET)
	public @ResponseBody String getItemNameById(@PathVariable("id") String myId) {
		return items.get(myId);
	}
}
