package itemmaster.common;

import io.cucumber.spring.CucumberContextConfiguration;
import itemmaster.ProcessApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProcessApplication.class })
public class CucumberSpingConfiguration {}
