package ru.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class FitTest {
    @Test
    void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenMan187Then100dot05() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman187Then88dot55() {
        short in = 187;
        double expected = 88.55;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenWoman182Then82dot8() {
        short in = 182;
        double expected = 82.8;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}