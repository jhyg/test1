package p.common;


import p.BApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BApplication.class })
public class CucumberSpingConfiguration {
    
}
