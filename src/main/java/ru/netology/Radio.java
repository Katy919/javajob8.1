package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int currentVolume;
    private int currentRadio;
    private int currentStation = 10;
    private int maxRadio;
    private int minRadio;
    private int minVolume;
    private int maxVolume;

    public Radio(int minRadio, int maxRadio, int minVolume, int maxVolume) {
        this.maxRadio = this.currentStation - 1;
        this.minRadio = 0;
        this.minVolume = 0;
        this.maxVolume = 100;
        this.minRadio = minRadio;
        this.maxRadio = maxRadio;
        this.currentRadio = minRadio;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }

    public Radio(int size) {
        this.maxRadio = this.currentStation - 1;
        this.minRadio = 0;
        this.minVolume = 0;
        this.maxVolume = 100;
        this.maxRadio = this.minRadio + size;
    }

    public int getCurrentRadio() {
        return this.currentRadio;
    }

    public int getMaxRadio() {
        return this.maxRadio;
    }

    public int getMinRadio() {
        return this.minRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio >= this.minRadio) {
            if (newCurrentRadio <= this.maxRadio) {
                this.currentRadio = newCurrentRadio;
            }
        }
    }

    public void nextCurrentRadio() {
        if (this.currentRadio == this.maxRadio) {
            this.currentRadio = 0;
        } else {
            ++this.currentRadio;
        }

    }

    public void prevCurrentRadio() {
        if (this.currentRadio == this.minRadio) {
            this.currentRadio = 9;
        } else {
            --this.currentRadio;
        }

    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= this.minVolume) {
            if (newCurrentVolume <= this.maxVolume) {
                this.currentVolume = newCurrentVolume;
            }
        }
    }

    public void increaseVolume() {
        if (this.currentVolume < this.maxVolume) {
            ++this.currentVolume;
        }

    }

    public void decreaseVolume() {
        if (this.currentVolume > this.minVolume) {
            --this.currentVolume;
        }

    }
}