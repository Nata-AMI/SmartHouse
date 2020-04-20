package smart.netology.ru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void next() {
        Radio radio = new Radio();
        radio.setStation(7);
        radio.next();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void prev() {
        Radio radio = new Radio();
        radio.setStation(7);
        radio.prev();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(7);
        radio.decreaseVolume();
        assertEquals(6, radio.getVolume());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(3);
        radio.increaseVolume();
        assertEquals(4, radio.getVolume());
    }
    @Test
    void setStation () {
        Radio radio = new Radio();
        radio.setStation(15);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void setVolume(){
        Radio radio = new Radio();
        radio.setVolume(117);
        assertEquals(0, radio.getVolume());
    }

}