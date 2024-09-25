package pl.kalisz.zste.model;

import androidx.annotation.NonNull;

public class Coffee {
    public String name;
    public String desc;
    public int picture;

    public Coffee(String name, String desc, int picture) {
        this.name = name;
        this.desc = desc;
        this.picture = picture;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
