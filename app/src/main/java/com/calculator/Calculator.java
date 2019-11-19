package com.calculator;

public class Calculator {
    private float Number1;
    private float Number2;
    private float Result;


    Calculator(float Number1, float Number2) {
        this.Number1 = Number1;
        this.Number2 = Number2;
    }

    public float Add() {
        Result = Number1 + Number2;
        return Result;
    }

    public float Subtract() {
        Result = Number1 - Number2;
        return Result;
    }

    public float Multiply() {
        Result = Number1 * Number2;
        return Result;
    }

    public float Percent() {
        Result = Number1 / 100;
        return Result;
    }


}
