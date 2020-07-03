package com.task3;

import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FahrenheittoCelsius {
	

@RequestMapping("/celsius")
public int celsius()
{
	int fahrenheit=77;
	int celsius=(fahrenheit-32)*5/9;
	return celsius;
	
}
}
