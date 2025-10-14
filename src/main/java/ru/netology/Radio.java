package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentRadio;
    private int currentStation = 10;
    private int maxRadio = currentStation - 1;
    private int minRadio = 0;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int minRadio, int maxRadio, int minVolume, int maxVolume) {
        this.minRadio = minRadio;
        this.maxRadio = maxRadio;
        this.currentRadio = minRadio;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }

    public Radio(int size) {
        maxRadio = minRadio + size;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getMaxRadio() {
        return maxRadio;
    }

    public int getMinRadio() {
        return minRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > 9) {
            return;
        }

        currentRadio = newCurrentRadio;
    }

    public void nextCurrentRadio() {
        if (currentRadio == 9) {
            currentRadio = 0;
        } else {
            currentRadio = currentRadio + 1;
        }
    }

    public void prevCurrentRadio() {
        if (currentRadio == 0) {
            currentRadio = 9;
        } else {
            currentRadio = currentRadio - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
