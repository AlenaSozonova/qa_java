package com.example;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest extends TestCase {

    @Test
    public void testEatMeatShouldReturnPredatorGetFood() throws Exception {
        Feline feline = new Feline();
        List actual = feline.eatMeat();
        List expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFamilyShouldReturnFeline() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetKittensWithoutArg() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetKittensWithArg() {
        Feline feline = new Feline();
        int actual = feline.getKittens(2);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
}
