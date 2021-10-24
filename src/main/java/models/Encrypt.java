package models;

public class Encrypt {
    private String text;
    private int shift;

    public Encrypt(String text, int shift){
        this.text = text;
        this.shift = shift;
    }
    public String getText(){
        return text;
    }
    public int getShift() {
        return shift;
    }
}