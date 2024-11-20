package com.example.Conditioner2Spring;

public class Conditioner {
    int t_room;
    int t_cond;
    String mode;

    public Conditioner(int t_room, int t_cond, String mode) {
        this.t_room = t_room;
        this.t_cond = t_cond;
        this.mode = mode;
    }

    public int getResultTemp() throws Exception {
        switch (mode) {
            case "fan":
               return fan(t_room, t_cond);
            case "auto":
                return auto(t_room, t_cond);
            case "freeze":
                return freeze(t_room, t_cond);
            case "heat":
                return heat(t_room, t_cond);
            default:
                throw new Exception("ошибка ввода режима");
        }

    }

    public int heat(int t_room, int t_cond) {
        if (t_room < t_cond)
            return t_cond;
        else
            return t_room;
    }

    public int freeze(int t_room, int t_cond) {
        if (t_room > t_cond)
            return t_cond;
        else
            return t_room;
    }

    public int auto(int t_room, int t_cond) {
        if (t_room > t_cond)
            return freeze(t_room, t_cond);
        else
            return heat(t_room, t_cond);
    }

    public int fan(int t_room, int t_cond) {
        return t_room;
    }

    @Override
    public String toString() {
        return "\n ПАРАМЕТРЫ:" + " : " +
                "t в помещении = " + t_room +
                " ,задаваемая t = " + t_cond +
                " ,выбранный режим = " + mode;
    }
}