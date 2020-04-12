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


}



