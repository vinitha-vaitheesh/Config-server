package com.example.ConfigClient.main;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BeanConfiguration {
private int minResult;
private int maxResult;
private String value;
private String valueString;
public BeanConfiguration(int minResult, int maxResult, String value, String valueString) {
	super();
	this.minResult = minResult;
	this.maxResult = maxResult;
	this.value = value;
	this.valueString = valueString;
}


}
