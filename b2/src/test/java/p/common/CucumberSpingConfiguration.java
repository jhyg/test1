package p.common;


import p.B2Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { B2Application.class })
public class CucumberSpingConfiguration {
    
}
