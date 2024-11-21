public abstract class Color {
    public String fillColor;
    public String borderColor;

    public Color(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getColors() {
        return " Цвет фона:" + fillColor +
                "  Цвет границ:" + borderColor;
    }
}