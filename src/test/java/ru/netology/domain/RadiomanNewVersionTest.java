package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadiomanNewVersionTest {
    @Test
    void shouldChangeNextMaxNumberStation() {
        RadiomanNewVersion radiomanNewVersion = new RadiomanNewVersion(15, 15);
        radiomanNewVersion.changeNextNumberStation();
        assertEquals(0, radiomanNewVersion.getCurrentStation());
    }

    @Test
    void shouldChangeNextNumberStation() {
        RadiomanNewVersion radiomanNewVersion = new RadiomanNewVersion(5, 15);
        radiomanNewVersion.changeNextNumberStation();
        assertEquals(6, radiomanNewVersion.getCurrentStation());
    }


    @Test
    void shouldChangePrevMinNumberStationB() {
        RadiomanNewVersion radiomanNewVersion = new RadiomanNewVersion(0, 15);
        radiomanNewVersion.changePrevNumberStation();
        assertEquals(15, radiomanNewVersion.getCurrentStation());
    }

    @Test
    void shouldChangePrevNumberStation() {
        RadiomanNewVersion radiomanNewVersion = new RadiomanNewVersion(5, 15);
        radiomanNewVersion.changePrevNumberStation();
        assertEquals(4, radiomanNewVersion.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolumeUnderMax() {
        RadiomanNewVersion radiomanNewVersion = new RadiomanNewVersion(16, 100, 0);
        radiomanNewVersion.increaseVolume();
        assertEquals(17, radiomanNewVersion.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeHighMax() {
        RadiomanNewVersion radiomanNewVersion = new RadiomanNewVersion(100, 100, 0);
        radiomanNewVersion.increaseVolume();
        assertEquals(100, radiomanNewVersion.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        RadiomanNewVersion radiomanNewVersion = new RadiomanNewVersion(15, 100, 0);
        radiomanNewVersion.decreaseVolume();
        assertEquals(14, radiomanNewVersion.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeBelowMin() {
        RadiomanNewVersion radiomanNewVersion = new RadiomanNewVersion(0, 100, 0);
        radiomanNewVersion.decreaseVolume();
        assertEquals(0, radiomanNewVersion.getCurrentVolume());
    }
}

