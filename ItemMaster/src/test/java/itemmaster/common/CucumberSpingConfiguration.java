package itemmaster.common;

import io.cucumber.spring.CucumberContextConfiguration;
import itemmaster.ItemMasterApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ItemMasterApplication.class })
public class CucumberSpingConfiguration {}
