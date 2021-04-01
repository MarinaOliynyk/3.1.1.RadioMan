package ru.netology.domain;

public class Radio {
    private int startStation = 0;
    private int finalStation = 9;
    private int currentRadioStation;
    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > finalStation) {
            this.currentRadioStation = startStation;
            return;
        }
        if (currentRadioStation < startStation) {
            this.currentRadioStation = finalStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int nextRadioStation() {
        currentRadioStation = currentRadioStation >= finalStation ? startStation : ++currentRadioStation;
        return currentRadioStation;
    }

    public int prevRadioStation() {
        currentRadioStation = currentRadioStation <= startStation ? finalStation : --currentRadioStation;
        return currentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            this.currentSoundVolume = maxSoundVolume;
            return;
        }
        if (currentSoundVolume < minSoundVolume) {
            this.currentSoundVolume = minSoundVolume;
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void shouldSoundVolumeUp() {
        if (currentSoundVolume == maxSoundVolume)
            return;
        currentSoundVolume++;
    }

    public void shouldSoundVolumeDown() {
        if (currentSoundVolume == minSoundVolume)
            return;
        currentSoundVolume--;
    }
}
