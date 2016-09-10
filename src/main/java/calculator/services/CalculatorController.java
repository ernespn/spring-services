package calculator.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calculator.models.Result;

@RestController
public class CalculatorController {
    @RequestMapping("/add/{num1}/{num2}")
    public Result add( @PathVariable Integer num1,  @PathVariable Integer num2) {
        return new Result(num1, num2);
    }
}
