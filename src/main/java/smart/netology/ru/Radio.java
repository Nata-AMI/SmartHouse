package smart.netology.ru;

public class Radio {
    private final static int MAX_STATION = 10;
    private final static int MIN_STATION = 0;
    private final static int MAX_VOLUME = 100;
    private final static int MIN_VOLUME = 0;
    public int currentStation;
    public int volume;


    public int getCurrentStation() {
        return currentStation;
    }

    public int getVolume() {
        return volume;
    }

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

    }

    public void decreaseVolume() {
        if (volume > MIN_VOLUME)
            this.volume = volume - 1;

    }

    public void setStation(int currentStation) {
        if (currentStation <= MAX_STATION && currentStation >= MIN_STATION) {
            this.currentStation = currentStation;
        } else {
            this.currentStation = MIN_STATION;
        }

    }

    public void setVolume(int volume) {
        if (volume <= MAX_VOLUME && volume >= MIN_VOLUME) {
            this.volume = volume;
        } else {
            this.volume = MIN_VOLUME;
        }
    }
    }




