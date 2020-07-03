package com.task3;

import java.util.Scanner;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CelsiustoFahrenheit {
	
  
  
	@RequestMapping("/fahernheit")
	public int fahrenheit()
	{
	    int celsius=50;
		int fahrenheit=((celsius*9/5)+32);
		return fahrenheit;
		
	}
}
