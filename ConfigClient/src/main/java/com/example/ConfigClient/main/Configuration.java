package com.example.ConfigClient.main;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;

@Data
@Component
@ConfigurationProperties("limits")
public class Configuration {
	@Getter
 private int minimum;
 private int maximum;

}
