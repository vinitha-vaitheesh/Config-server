package com.example.ConfigClient.main;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("data")
public class ConfigurationData {
private int minimumdata;
private int maximumdata;
}
