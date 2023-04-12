package com.edteam.demo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.*;

public class CalculadoraTest
{
    private Calculadora calculadora;

    //esto se ejecuta antes de todos
    @BeforeAll
    public void antes_de_todo()
    {

    }

    //esto se ejecuta antes de cualquier test
    @Before
    public void Iniciar()
    {
        calculadora = new Calculadora();
    }
    //esto se ejecuta despues de cada test
    @AfterEach
    public void Ejecutar_despues_de_cada_test()
    {

    }

    //esto se ejecuta despues de todos los tests
    @AfterAll
    public void ejecutar_despues_de_todos_los_tests()
    {

    }
   @Test
    public void CalcularIMC_XXX() throws InterruptedException {
       // GIVEN

       double altura = 175;
       double peso = 72;

       //WHEN
       double imc = calculadora.calcular(peso,altura);

       //THEN

       Assert.assertEquals(0.002,imc,3);
   }
    @Test
    public void CalcularIMC_2() throws InterruptedException {
        // GIVEN

        double altura = 160;
        double peso = 110;

        //WHEN
        double imc = new Calculadora().calcular(peso,altura);

        //THEN
        Assertions.assertAll(
                () -> Assert.assertEquals(0.004, imc, 3),
                () -> Assert.assertTrue(imc > 0));
    }

    @DisplayName("test3")
    @Test
    public void CalcularIMC_3() throws InterruptedException {
        // GIVEN

        double altura = 0;
        double peso = 110;

        //WHEN
        double imc = calculadora.calcular(peso,altura);

        //THEN

        Assert.assertEquals(0.004,imc,3);
    }

    @DisplayName("test4")
    public void CalcularIMC_4() throws InterruptedException {
        // GIVEN

        double altura = 0;
        double peso = 110;

        //WHEN
        double imc = calculadora.calcular(peso,altura);

        //THEN

        Assert.assertEquals(0.004,imc,3);
    }
}
