package ru.netology.java.radio;

public class Radio {
    public int currentRadioStationNumber;
    public int currentSoundVolumeLevel;


    // РАЗДЕЛ РАБОТЫ С РАДИОСТАНЦИЯМИ
    public int getRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setRadioStationNumber(int newCurrentRadioStationNumber) {

        if (newCurrentRadioStationNumber > 9) {
            return;
        }

        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    // РАЗДЕЛ РАБОТЫ С УРОВНЕМ ГРОМКОСТИ
    public int getSoundVolumeLevel() {
        return currentSoundVolumeLevel;
    }

    public void setSoundVolumeLevel(int newSoundVolumeLevel) {

        if (newSoundVolumeLevel > 100) {
            return;
        }

        if (newSoundVolumeLevel < 0) {
            return;
        }

        currentSoundVolumeLevel = newSoundVolumeLevel;
    }

    public void increase() {

        if (currentSoundVolumeLevel < 100) {
            currentSoundVolumeLevel = currentSoundVolumeLevel + 1;
        }
    }

    public void decrease() {

        if (currentSoundVolumeLevel > 0) {
            currentSoundVolumeLevel = currentSoundVolumeLevel - 1;
        }
    }


}
