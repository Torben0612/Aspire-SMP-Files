package tk.theaspiresmp.files;


import java.util.Date;

public class JSONData {

    private String playerName;
    private String message;
    private boolean value;
    private Date date;

    public JSONData(String playerName, boolean value, Date date){
        this.playerName = playerName;
        this.value = value;
        this.date = date;

    }

    public String getPlayerName() { return playerName; }
    public boolean getValue() { return value; }
    public Date getDate() { return date; }
}