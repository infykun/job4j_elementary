package ru.job4j.converter;


import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void whenConvert180RblThen2Euro() {
        int in = 180;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenConvert190RblThen2Euro() {
        int in = 190;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenConvert380RblThen5Euro() {
        int in = 380;
        int expected = 5;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenConvert18RblThen0Euro() {
        int in = 18;
        int expected = 0;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenConvert150RblThen2Dlr() {
        int in = 150;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenConvert80RblThen1Dlr() {
        int in = 80;
        int expected = 1;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenConvert1RblThen0Dlr() {
        int in = 1;
        int expected = 0;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}