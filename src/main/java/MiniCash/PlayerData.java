package MiniCash;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true) // 未知のフィールド（idなど）が来ても無視する設定

public class PlayerData {
    @SerializedName("playerName")
    private String playerName;
    private String uuid;
    private int emoney;
    private int bank;
    private int point;
    private String message;

    public PlayerData(){}

    public PlayerData(String playerName, String uuid, int emoney, int bank, int point, String message) {
        this.playerName = playerName;
        this.uuid = uuid;
        this.emoney = emoney;
        this.bank = bank;
        this.point = point;
        this.message = message;

    }

    public String getPlayerName(){
        return playerName;
    }

    public String getUuid(){
        return uuid;
    }

    public int getEmoney(){
        return emoney;
    }

    public int getBank(){
        return bank;
    }
    public int getPoint(){
        return point;
    }
    public String getMessage(){
        return message;
    }

}
