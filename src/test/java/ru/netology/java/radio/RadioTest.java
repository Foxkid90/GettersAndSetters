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
    public void shouldSetCurrentRadioStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(3);

        int expected = 3;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePreviousRadioStation() {
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
    public void shouldSetSoundVolumeLevel() {
        Radio radio = new Radio();

        radio.setSoundVolumeLevel(57);

        int expected = 57;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreasedVolumeLevel() {
        Radio radio = new Radio();
        radio.setSoundVolumeLevel(100);

        radio.increase();

        int expected = 100;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasedVolumeLevel() {
        Radio radio = new Radio();
        radio.setSoundVolumeLevel(0);

        radio.decrease();

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
}
