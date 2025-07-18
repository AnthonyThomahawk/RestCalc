package com.tonyt.restcalc.Controllers;

import com.tonyt.restcalc.Services.BasicCalcService;
import com.tonyt.restcalc.Services.EquationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final BasicCalcService basicCalcService;
    private final EquationService equationService;

    @Autowired
    public CalculatorController(BasicCalcService basicCalcService, EquationService equationService) {
        this.basicCalcService = basicCalcService;
        this.equationService = equationService;
    }


    @GetMapping("/add")
    public float add(float a, float b) {
        return basicCalcService.add(a, b);
    }

    @GetMapping("/sub")
    public float sub(float a, float b) {
        return basicCalcService.sub(a, b);
    }

    @GetMapping("/mul")
    public float mul(float a, float b) {
        return basicCalcService.mul(a, b);
    }

    @GetMapping("/div")
    public Object div(float a, float b) {
        return basicCalcService.div(a,b);
    }

    @GetMapping("/sqrt")
    public float sqrt(float a) {
        return basicCalcService.sqrt(a);
    }

    @GetMapping("/pow")
    public float pow(float a, float b) {
        return basicCalcService.pow(a, b);
    }

    @GetMapping("/degree2")
    public float[] degree2(float a, float b, float c) {
        return equationService.degree2(a,b,c);
    }
}
