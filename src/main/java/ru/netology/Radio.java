package ru.netology;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int currentVolume;
    private int currentRadio;
    private int currentStation = 10;
    private int maxRadio = 9;
    private int minRadio = 0;
    private int minVolume = 0;
    private int maxVolume = 100;

//   public Radio(int currentStation) {

//     this.maxRadio = currentStation - 1;
//     this.currentVolume = minVolume;
// }

    // public Radio() {
    // }


//  public int getCurrentRadio() {
//      return currentRadio;
//   }

    //public int getMaxRadio() {
//      return maxRadio;
// }
    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < minRadio) {
            return;
        }
        if (newCurrentRadio > maxRadio) {
            return;
        }

        currentRadio = newCurrentRadio;
    }

    public void nextCurrentRadio() {
        if (currentRadio == maxRadio) {
            currentRadio = minRadio;
        } else {
            currentRadio = currentRadio + 1;
        }
    }

    public void prevCurrentRadio() {
        if (currentRadio == minRadio) {
            currentRadio = maxRadio;
        } else {
            currentRadio = currentRadio - 1;
        }
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
