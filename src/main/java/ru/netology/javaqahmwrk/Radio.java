package ru.netology.javaqahmwrk;

public class Radio {
    private int currentRadioStation;
    private int currentVolumeRadio;

    public void nextStation() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void pervStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void volumeUp() {
        if (currentVolumeRadio < 10) {
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
        if (currentRadioStation > 9) {
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
        if (currentVolumeRadio > 10) {
            return;
        }
        this.currentVolumeRadio = currentVolumeRadio;
    }
}
