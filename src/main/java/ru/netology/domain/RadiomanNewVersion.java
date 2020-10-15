package ru.netology.domain;

public class RadiomanNewVersion {
    private int currentStation = 5;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentVolume = 15;
    private int maxVolume = 100;
    private int minVolume = 0;

    public RadiomanNewVersion() {
    }

    public RadiomanNewVersion(int currentStation, int maxStation) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
    }

    public RadiomanNewVersion(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void changeNextNumberStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation ++;
        }
    }

    public void changePrevNumberStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation --;
        }
    }

    public RadiomanNewVersion(int currentVolume, int maxVolume, int minVolume) {
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;

    }

    public void increaseVolume() {
        if (currentVolume != maxVolume) {
            currentVolume ++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != minVolume) {
            currentVolume --;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}

