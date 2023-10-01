package ru.mativ.weather.dto;

public class ConditionDto {
    private String text; //Weather condition text
    private String icon; //Weather icon url

    public ConditionDto() {
        super();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Condition [text=" + text + ", icon=" + icon + "]";
    }

}
