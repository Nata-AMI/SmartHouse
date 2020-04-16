package smart.netology.ru;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private final static int MAX_STATION = 10;
    private final static int MIN_STATION = 0;
    private final static int MAX_VOLUME = 100;
    private final static int MIN_VOLUME = 0;
    public int currentStation;
    public int volume;

    public void next() {
        if (currentStation < MAX_STATION)
            this.currentStation = currentStation + 1;
        if (currentStation == MAX_STATION)
            this.currentStation = 0;
    }

    public void prev() {
        if (currentStation > MIN_STATION)
            this.currentStation = currentStation - 1;
        if (currentStation == MIN_STATION)
            this.currentStation = 10;
    }

    public void increaseVolume() {
        if (volume < MAX_VOLUME)
            this.volume = volume + 1;
        if (volume == MAX_VOLUME)
            this.volume = volume;
    }

    public void decreaseVolume() {
        if (volume > MIN_VOLUME)
            this.volume = volume - 1;
        if (volume == MIN_VOLUME)
            this.volume = volume;
    }

    public void setStation(int currentStation) {
        if (currentStation <= MAX_STATION && currentStation >= MIN_STATION) {
            this.currentStation = currentStation;
        } else {
            this.currentStation = MIN_STATION;
        }
    }


    public void setVolume(int volume) {
        if (volume <= 100 && volume >= 0) {
            this.volume = volume;
        } else {
            this.volume = MIN_VOLUME;
        }
    }
}





