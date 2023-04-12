package com.edteam.demo;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Calculadora
{
    public double calcular(double peso, double altura) throws InterruptedException
    {
        if (peso == 0 || altura == 0)
        {
            throw new IllegalArgumentException("No puede tener valores con 0");
        }
        double imc = peso /(altura * altura);
        imc = Math.round(imc * 1000);
        imc = imc / 1000;
        TimeUnit.SECONDS.sleep(1);
        return imc;
    }
}
