package com.tonyt.restcalc.Services;

import org.springframework.stereotype.Service;

@Service
public class BasicCalcService {
    public float add(float a, float b) {
        return a + b;
    }
    public float sub(float a, float b) {
        return a - b;
    }
    public float mul(float a, float b) {
        return a * b;
    }
    public Object div(float a, float b) {
        if (b == 0) {
            return null;
        }
        return a / b;
    }
    public float sqrt(float a) {
        return (float) Math.sqrt(a);
    }
    public float pow(float a, float b) {
        return (float) Math.pow(a, b);
    }
}
