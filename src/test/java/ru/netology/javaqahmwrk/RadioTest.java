package ru.netology.javaqahmwrk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void radioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);

        radio.nextStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pervRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.pervStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pervRadioStationTest2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.pervStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpToMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(10);

        radio.volumeUp();

        int expected = 10;
        int actual = radio.getCurrentVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpNextTest() {
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(0);

        radio.volumeUp();

        int expected = 1;
        int actual = radio.getCurrentVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownToMinTest() {
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(0);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void volumeDownPervTest() {
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(3);

        radio.volumeDown();

        int expected = 2;
        int actual = radio.getCurrentVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeAboveMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(11);

        int expected = 0;
        int actual = radio.getCurrentVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTestBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

}
