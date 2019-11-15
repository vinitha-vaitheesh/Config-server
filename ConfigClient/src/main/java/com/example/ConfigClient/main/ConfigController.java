package com.example.ConfigClient.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Autowired
	private Configuration config;
	
	@Autowired
	private ConfigurationData configdata;
	
	@Value("${vault.valueString}")
	private String value;
	
	@Value("${vault.valueFunction}")
	private String valueFun;
	
	
	@RequestMapping(value="/limits",method = RequestMethod.GET)
	public BeanConfiguration getlimits()
	{
		return new BeanConfiguration(config.getMinimum(), config.getMaximum(), value, valueFun);
	}
	@RequestMapping(value="/vault",method=RequestMethod.GET)
	public BeanConfiguration getVault(@Value("${vault.valueFunction}") String valueFunction) {
		return new BeanConfiguration(config.getMinimum(), config.getMaximum(), value, valueFunction);
	}
	@GetMapping("/configData")
	public ConfigurationData getCOnfigData() {
		return configdata;
	}
	
	
	
}
