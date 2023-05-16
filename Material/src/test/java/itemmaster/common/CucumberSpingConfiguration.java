package itemmaster.common;

import io.cucumber.spring.CucumberContextConfiguration;
import itemmaster.MaterialApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MaterialApplication.class })
public class CucumberSpingConfiguration {}
