package ru.netology;

public class Radio {
    public int currentRadio;
    public int currentVolume;


    public int getCurrentRadio() {
        return currentRadio;
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
