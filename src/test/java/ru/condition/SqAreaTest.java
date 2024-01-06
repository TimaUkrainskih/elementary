package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class SqAreaTest {
    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP3K4Square0dot36() {
        double expected = 0.36;
        int p = 3;
        double k = 4;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenP0K0Square0() {
        double expected = 0;
        int p = 0;
        double k = 0;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}