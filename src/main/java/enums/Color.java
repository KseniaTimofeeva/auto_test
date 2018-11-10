package enums;

import com.google.gson.annotations.SerializedName;

public enum Color {
    @SerializedName("Red")
    RED("Red"),
    @SerializedName("Green")
    GREEN("Green"),
    @SerializedName("Blue")
    BLUE("Blue"),
    @SerializedName("Yellow")
    YELLOW("Yellow");

    private String displayName;


    Color(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static String type() {
        return "Colors";
    }
}
