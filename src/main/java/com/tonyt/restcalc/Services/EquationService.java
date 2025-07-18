package com.tonyt.restcalc.Services;

import org.springframework.stereotype.Service;

@Service
public class EquationService {
    public float[] degree2(float a, float b, float c) {
        float[] solutions;
        float d = (float) Math.sqrt(b*b - 4*a*c);
        if (d > 0) {
            solutions = new float[2];
            solutions[0] = (-b + d) / (2*a);
            solutions[1] = (-b - d) / (2*a);
        } else if (d == 0) {
            solutions = new float[1];
            solutions[0] = (-b) / (2*a);
        } else {
            solutions = null; // TODO: Implement complex numbers
        }

        return solutions;
    }
}
