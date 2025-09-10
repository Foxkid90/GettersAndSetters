package ru.netology.java.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // РАЗДЕЛ РАБОТЫ С РАДИОСТАНЦИЯМИ
    @Test
    public void shouldGetCurrentRadioStationNumber() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentRadioStationNumberEight() { // Эквивалентные группы / граничные значения: 8
        Radio radio = new Radio();

        radio.setRadioStationNumber(8);

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumberNine() { // Эквивалентные группы / граничные значения: 9
        Radio radio = new Radio();

        radio.setRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumberTen() { // Эквивалентные группы / граничные значения: 10
        Radio radio = new Radio();

        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumberMinusOne() { // Эквивалентные группы / граничные значения: -1
        Radio radio = new Radio();

        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumberZero() { // Эквивалентные группы / граничные значения: 0
        Radio radio = new Radio();

        radio.setRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumberOne() { // Эквивалентные группы / граничные значения: 1
        Radio radio = new Radio();

        radio.setRadioStationNumber(1);

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextRadioStation_currentStationEight() { // Эквивалентные группы / граничные значения: 8
        Radio radio = new Radio();
        radio.setRadioStationNumber(8);

        radio.next();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextRadioStation_currentStationNine() { // Эквивалентные группы / граничные значения: 9
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePreviousRadioStation_currentStationOne() { // Эквивалентные группы / граничные значения: 1
        Radio radio = new Radio();
        radio.setRadioStationNumber(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePreviousRadioStation_currentStationZero() { // Эквивалентные группы / граничные значения: 0
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    // РАЗДЕЛ РАБОТЫ С УРОВНЕМ ГРОМКОСТИ
    @Test
    public void shouldGetSoundVolumeLevel() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetSoundVolumeLevelOneHundredOne() { // Эквивалентные группы / граничные значения: 101
        Radio radio = new Radio();

        radio.setSoundVolumeLevel(101);

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeLevelOneHundred() { // Эквивалентные группы / граничные значения: 100
        Radio radio = new Radio();

        radio.setSoundVolumeLevel(100);

        int expected = 100;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeLevelNinetyNine() { // Эквивалентные группы / граничные значения: 99
        Radio radio = new Radio();

        radio.setSoundVolumeLevel(99);

        int expected = 99;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeLevelMinusOne() { // Эквивалентные группы / граничные значения: -1
        Radio radio = new Radio();

        radio.setSoundVolumeLevel(-1);

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeLevelZero() { // Эквивалентные группы / граничные значения: 0
        Radio radio = new Radio();

        radio.setSoundVolumeLevel(0);

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeLevelOne() { // Эквивалентные группы / граничные значения: 1
        Radio radio = new Radio();

        radio.setSoundVolumeLevel(1);

        int expected = 1;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreasedVolumeLevelNinetyNine() { // Эквивалентные группы / граничные значения: 99
        Radio radio = new Radio();
        radio.setSoundVolumeLevel(99);

        radio.increase();

        int expected = 100;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreasedVolumeLevelOneHundred() { // Эквивалентные группы / граничные значения: 100
        Radio radio = new Radio();
        radio.setSoundVolumeLevel(100);

        radio.increase();

        int expected = 100;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasedVolumeLeveZero() { // Эквивалентные группы / граничные значения: 0
        Radio radio = new Radio();
        radio.setSoundVolumeLevel(0);

        radio.decrease();

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasedVolumeLeveOne() { // Эквивалентные группы / граничные значения: 1
        Radio radio = new Radio();
        radio.setSoundVolumeLevel(1);

        radio.decrease();

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
}
