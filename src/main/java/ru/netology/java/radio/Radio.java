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

    public int next() {
        if (currentRadioStationNumber >= 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        return currentRadioStationNumber;
    }

    public int prev() {
        if (currentRadioStationNumber <= 0) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        return currentRadioStationNumber;
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

    public int increase() {

        if (currentSoundVolumeLevel >= 100) {
            return currentSoundVolumeLevel;
        } else {
            currentSoundVolumeLevel = currentSoundVolumeLevel + 1;
        }
        return currentSoundVolumeLevel;
    }

    public int decrease() {

        if (currentSoundVolumeLevel <= 0) {
            return currentSoundVolumeLevel;
        } else {
            currentSoundVolumeLevel = currentSoundVolumeLevel - 1;
        }
        return currentSoundVolumeLevel;
    }


}
