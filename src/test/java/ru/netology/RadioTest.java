package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testRadio() {
        Radio cond = new Radio(0, 5, 0, 33);

        Assertions.assertEquals(0, cond.getMinRadio());
        Assertions.assertEquals(5, cond.getMaxRadio());
        Assertions.assertEquals(0, cond.getCurrentRadio());
        Assertions.assertEquals(0, cond.getMinVolume());
        Assertions.assertEquals(33, cond.getMaxVolume());
        Assertions.assertEquals(0, cond.getCurrentVolume());

    }

    @Test
    public void shouldSetRadio() {
        Radio cond = new Radio(4);

        cond.setCurrentRadio(4);

        int expected = 4;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadio() {
        Radio cond = new Radio(9);

        cond.setCurrentRadio(9);
        int expected = 9;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadio() {
        Radio cond = new Radio(0);

        cond.setCurrentRadio(0);
        int expected = 0;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMax() {
        Radio cond = new Radio(0);

        cond.setCurrentRadio(10);

        int expected = 0;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioBeforeMin() {
        Radio cond = new Radio(-1);

        cond.setCurrentRadio(-1); // Пытаемся установить невалидное значение

        int expected = 0;         // Должно остаться значение по умолчанию (0)
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToZeroWhenNine() {
        Radio cond = new Radio(9);

        cond.setCurrentRadio(9);
        cond.nextCurrentRadio();
        int expected = 0;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldInсrementWhenLessThanNine() {
        Radio cond = new Radio(6);

        cond.setCurrentRadio(5);
        cond.nextCurrentRadio();
        int expected = 6;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNineWhenZero() {
        Radio cond = new Radio(0);

        cond.setCurrentRadio(0);
        cond.prevCurrentRadio();
        int expected = 9;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecrementWhenLessThanNinee() {
        Radio cond = new Radio(5);

        cond.setCurrentRadio(5);
        cond.prevCurrentRadio();
        int expected = 4;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio cond = new Radio(50);

        cond.setCurrentVolume(50);

        int expected = 50;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio cond = new Radio(100);

        cond.setCurrentVolume(100);
        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio cond = new Radio(0);

        cond.setCurrentVolume(0);
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio cond = new Radio(101);

        cond.setCurrentVolume(101);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBeforeMin() {
        Radio cond = new Radio(-1);

        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWhenLessThanMax() {
        Radio cond = new Radio(50);

        cond.setCurrentVolume(50);
        cond.increaseVolume();
        int expected = 51;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeWhenMax() {
        Radio cond = new Radio(100);

        cond.setCurrentVolume(100);
        cond.increaseVolume();
        int expected = 100;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeWhenGreaterThanMin() {
        Radio cond = new Radio(50);

        cond.setCurrentVolume(50);
        cond.decreaseVolume();

        int expected = 49;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeWhenMin() {
        Radio cond = new Radio(0);

        cond.setCurrentRadio(0);
        cond.decreaseVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}