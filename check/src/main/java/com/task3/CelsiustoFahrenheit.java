package com.task3;

import java.util.Scanner;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CelsiustoFahrenheit {
	
  
  
	@RequestMapping("/fahernheit/{degree}")
	public @ResponseBody int fahrenheit(@PathVariable(value="someID") String degree)
	{
	    int celsius=Integer.parseInt(degree);
		int fahrenheit=((celsius*9/5)+32);
		return fahrenheit;
		
	}
	@RequestMapping("/celsius/{degree}")
public @ResponseBody int celsius(@PathVariable(value="someID") String degree)
{
	int fahrenheit=Integer.parseInt(degree);
	int celsius=(fahrenheit-32)*5/9;
	return celsius;
	
}
}
