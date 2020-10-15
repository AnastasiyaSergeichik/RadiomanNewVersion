package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class RadiomanNewVersion {
    private int currentStation = 5;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentVolume = 15;
    private int maxVolume = 100;
    private int minVolume = 0;

    public RadiomanNewVersion(int currentStation, int maxStation) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
    }

    public RadiomanNewVersion(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void changeNextNumberStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void changePrevNumberStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public RadiomanNewVersion(int currentVolume, int maxVolume, int minVolume) {
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;

    }

    public void increaseVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        }
    }
}

