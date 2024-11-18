package com.example.Conditioner2Spring;

public class Conditioner {
    int t_room;
    int t_cond;
    String mode;
    static int resultTemp;

    public Conditioner(int t_room, int t_cond, String mode) {
        this.t_room = t_room;
        this.t_cond = t_cond;
        this.mode = mode;
    }

    public static int getResultTemp(int t_room, int t_cond, String mode) throws Exception {
        switch (mode) {
            case "fan":
                resultTemp = fan(t_room, t_cond);
                return resultTemp;
            case "auto":
                resultTemp = auto(t_room, t_cond);
                return resultTemp;
            case "freeze":
                resultTemp = freeze(t_room, t_cond);
                return resultTemp;
            case "heat":
                resultTemp = heat(t_room, t_cond);
                return resultTemp;
            default:
                throw new Exception("ошибка ввода режима");
        }

    }

    public static int heat(int t_room, int t_cond) {
        if (t_room < t_cond)
            return t_cond;
        else
            return t_room;
    }

    public static int freeze(int t_room, int t_cond) {
        if (t_room > t_cond)
            return t_cond;
        else
            return t_room;
    }

    public static int auto(int t_room, int t_cond) {
        if (t_room > t_cond)
            return freeze(t_room, t_cond);
        else
            return heat(t_room, t_cond);
    }

    public static int fan(int t_room, int t_cond) {
        return t_room;
    }

    @Override
    public String toString() {
        return String.valueOf(resultTemp);
    }
}