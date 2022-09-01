package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.sql.SQLOutput;

@RunWith(Parameterized.class)  //  аннотацию для параметризованных тестов

public class LionDoesHaveManeParametrizedTest extends TestCase {

        public LionDoesHaveManeParametrizedTest(String sex, Boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters // Пометь метод аннотацией для параметров
    public static Object[][] getSex() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}, // Заполни массив тестовыми данными и ожидаемым результатом
                {"CheckException", false}, // Заполни массив тестовыми данными и ожидаемым результатом
        };
    }
    private final String sex;
    private final boolean result;
    Feline feline = new Feline();

        @Test
        public void LionParametrizedTestDoesHaveMane() {
            try {
                Lion lion = new Lion(sex, feline);
                // Сравни полученный и ожидаемый результаты
                assertEquals(result, lion.doesHaveMane());
            } catch (Exception exception) {
                assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
            }
        }
    }
