package ru.netology.javaqahmwrk;

public class Radio {
    private int currentRadioStation;
    private int currentVolumeRadio;
    private int maxRadioStation;

    public Radio() {
        maxRadioStation = 9;
    }
    public Radio(int stationNumber) {
        maxRadioStation = stationNumber - 1;
    }

    public void nextStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void pervStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void volumeUp() {
        if (currentVolumeRadio < 100) {
            currentVolumeRadio = currentVolumeRadio + 1;
        }
    }

    public void volumeDown(){
        if (currentVolumeRadio > 0) {
            currentVolumeRadio = currentVolumeRadio - 1;
        }
    }









    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolumeRadio() {
        return currentVolumeRadio;
    }

    public void setCurrentVolumeRadio(int currentVolumeRadio) {
        if (currentVolumeRadio < 0) {
            return;
        }
        if (currentVolumeRadio > 100) {
            return;
        }
        this.currentVolumeRadio = currentVolumeRadio;
    }
}
