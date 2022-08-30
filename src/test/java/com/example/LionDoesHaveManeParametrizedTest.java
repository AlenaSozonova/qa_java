package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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
        };
    }
    private final String sex;
    private final boolean result;

        @Test
        public void LionParametrizedTestDoesHaveMane() throws Exception {
            Lion lion = new Lion(sex);
            // Сравни полученный и ожидаемый результаты
            assertEquals(result, lion.doesHaveMane());
        }
    }
