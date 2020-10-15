package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadiomanNewVersionTest {
    RadiomanNewVersion radiomanNewVersion = new RadiomanNewVersion();


    private void constValue() {
        radiomanNewVersion.setMaxStation(9);
        radiomanNewVersion.setMinStation(0);
        radiomanNewVersion.setMaxVolume(10);
        radiomanNewVersion.setMinVolume(0);
    }
//станции

    @Test
        //увеличение станции на 1
    void shouldNextNumberStation() {
        constValue();
        radiomanNewVersion.setCurrentStation(8);
        radiomanNewVersion.nextNumberStation ();
        assertEquals(9, radiomanNewVersion.getCurrentStation());
    }



    @Test                                   //уменьшение станции на 1
    void shouldPrevNumberStation() {
        constValue();
        radiomanNewVersion.setCurrentStation (1);
        radiomanNewVersion.prevNumberStation ();
        assertEquals(0, radiomanNewVersion.getCurrentStation());
    }

    @Test                                 // уменьшение мин.значения станции
    void shouldPrevMinNumberStation() {
        constValue();
        radiomanNewVersion.setCurrentStation(0);
        radiomanNewVersion.prevNumberStation ();
        assertEquals(9, radiomanNewVersion.getCurrentStation());
    }
    @Test                                  //увеличение макс.значения станции
    void shouldNextMaxNumberStation() {
        constValue();
        radiomanNewVersion.setCurrentStation(9);
        radiomanNewVersion.nextNumberStation();
        assertEquals(0, radiomanNewVersion.getCurrentStation());
    }
    @Test                                  //увеличение макс.значения станции
    void shouldCurrentStationHighMax() {
        constValue();
        radiomanNewVersion.setCurrentStation(10);
        assertEquals(0, radiomanNewVersion.getCurrentStation());
    }


    @Test                                  // уменьшение мин.значения станции
    void shouldCurrentStationBelowMin() {
        constValue();
        radiomanNewVersion.setCurrentStation(-1);
        assertEquals(0, radiomanNewVersion.getCurrentStation());
    }


    // громкость
    @Test                                     //увеличение на 1
    void shouldIncreaseVolume() {
        constValue();
        radiomanNewVersion.setCurrentVolume(9);
        radiomanNewVersion.increaseVolume();
        assertEquals(10, radiomanNewVersion.getCurrentVolume());
    }


    @Test                            //уменьшение на 1
    void shouldDecreaseVolume() {
        constValue();
        radiomanNewVersion.setCurrentVolume(1);
        radiomanNewVersion.decreaseVolume();
        assertEquals(0, radiomanNewVersion.getCurrentVolume());
    }

    @Test                           //увеличение макс.значения громкости
    void shouldCurrentVolumeHighMax() {
        constValue();
        radiomanNewVersion.setCurrentVolume(11);
        assertEquals(0, radiomanNewVersion.getCurrentVolume());
    }

    @Test                              //уменьшение мин.значения громкости
    void shouldCurrentVolumeBelowMin() {
        constValue();
        radiomanNewVersion.setCurrentVolume(-1);
        assertEquals(0, radiomanNewVersion.getCurrentVolume());
    }

    @Test                   //увеличение громкости на 1
    void shouldIncreaseMaxVolume() {
        constValue();
        radiomanNewVersion.setCurrentVolume(10);
        radiomanNewVersion.increaseVolume();
        assertEquals(10, radiomanNewVersion.getCurrentVolume());
    }

    @Test              //уменьшение громкости на 1
    void shouldDecreaseMinVolume() {
        constValue();
        radiomanNewVersion.setCurrentVolume(0);
        radiomanNewVersion.decreaseVolume();
        assertEquals(0, radiomanNewVersion.getCurrentVolume());
    }


}

