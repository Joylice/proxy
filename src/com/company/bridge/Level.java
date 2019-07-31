package com.company.bridge;

/**
 * @Author: Joylice
 * @Date: 2019/6/11 9:08
 */
public enum Level {
    /**
     * 傅里叶变换类型
     */
    FFTSTYLE(0, "FFT"),
    /**
     * 通用的服务类型
     */
    COMMSTYLE(1, "COMM"),
    /**
     * 预警服务类型
     */
    ALERTSTYLE(2, "ALERT"),
    /**
     * 交通荷载服务类型
     */
    TRAFFICSTYLE(3, "TRA");

    private Integer index;
    private String name;

    Level(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Level getTypeEnum(String name) {
        Level[] socketTypeEnums = Level.values();
        for (Level one : socketTypeEnums) {
            if (one.getName().equals(name)) {
                return one;
            }
        }
        return null;
    }
}

