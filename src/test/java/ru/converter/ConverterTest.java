package ru.converter;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class ConverterTest {

    @Test
    void whenConvert180RblThen2Dlr() {
        float in = 180;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert200RblThen2dot2222Dlr() {
        float in = 200;
        float expected = 2.222f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert200RblThen2Euro() {
        float in = 200;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RblThen1dot8Euro() {
        float in = 180;
        float expected = 1.8f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.1f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}