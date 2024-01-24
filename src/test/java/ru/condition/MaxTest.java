package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To8Then10() {
        int left = 10;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8To12Then12() {
        int left = 8;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5And4And7Then7() {
        int a = 5;
        int b = 4;
        int c = 7;
        int result = Max.max(a, b, c);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5And4And7And8Then8() {
        int a = 5;
        int b = 4;
        int c = 7;
        int d = 8;
        int result = Max.max(a, b, c, d);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
}