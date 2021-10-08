package com.waytous.cloud.iot.cucumber;

import com.waytous.cloud.iot.CloudIotGatewayApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = CloudIotGatewayApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
