package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point point = new Point(0, 0);
        double out = point.distance(new Point(2, 0));
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to20then1dot41() {
        double expected = 1.41;
        Point point = new Point(1, 1);
        double out = point.distance(new Point(2, 0));
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to20then2dot23() {
        double expected = 2.23;
        Point point = new Point(1, 2);
        double out = point.distance(new Point(2, 0));
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to11then1() {
        double expected = 1;
        Point point = new Point(1, 2);
        double out = point.distance(new Point(1, 1));
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to11then0() {
        double expected = 0;
        Point point = new Point(1, 1);
        double out = point.distance(new Point(1, 1));
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when111to111then0() {
        double expected = 0;
        Point point = new Point(1, 1, 1);
        double out = point.distance(new Point(1, 1, 1));
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when121to211then0() {
        double expected = 1.41;
        Point point = new Point(1, 2, 1);
        double out = point.distance(new Point(2, 1, 1));
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}