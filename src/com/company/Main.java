package com.company;

import com.company.proxy.GamePlayer;
import com.company.proxy.IGamePlayer;
import com.company.proxy.ProxyPlayer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");

        gamePlayer.login("zhangsan", "11222");
        gamePlayer.killBoss();
        gamePlayer.upgrade();


        IGamePlayer proxyPlayer = new ProxyPlayer(gamePlayer);
        proxyPlayer.login("zhangsan", "11111");
        proxyPlayer.killBoss();
        proxyPlayer.upgrade();


        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        //calendar.add(Calendar.YEAR, -1);
        calendar.add(Calendar.MONTH, +1);
        calendar.add(Calendar.DAY_OF_MONTH,+5);
        Date result = calendar.getTime();
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("时间:" + simpleFormatter.format(result));
        List<String> tables = getTablesName(result, "HSD");
        System.out.println(tables);
    }
    public static final int DAY_COUNT = 30;

    public static List<String> getTablesName(Date date, String defApp) {
        List<String> tablesName = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH) + 1;
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);
        String curMonthTableName = "DBR_" + defApp + "_" + year + (month < 10 ? "0" + month : month);
        tablesName.add(curMonthTableName);
        String preMonthTableName = "";
        //1.1月份天数不足30天 需要跨年跨表请求
        if (month == 1) {
            calendar.add(Calendar.DAY_OF_MONTH, -30);
            System.out.println("当月（1月份）且-30天后时间:" + calendar.get(Calendar.YEAR) + (calendar.get(Calendar.MONTH) + 1));
            preMonthTableName = "DBR_" + defApp + "_" + calendar.get(Calendar.YEAR) + ((calendar.get(Calendar.MONTH) + 1) < 10 ? "0" + (calendar.get(Calendar.MONTH) + 1) : (calendar.get(Calendar.MONTH) + 1));
        } else {
            //2.其他月份不足30天，需要跨表请求
            //当月天数少于30天，跨月
            if (days - DAY_COUNT < 0) {
                calendar.add(Calendar.DAY_OF_MONTH, -30);
                System.out.println("当月（非1月份）天数小于30天:" + calendar.get(Calendar.YEAR) + (calendar.get(Calendar.MONTH) + 1));
                preMonthTableName = "DBR_" + defApp + "_" + calendar.get(Calendar.YEAR) + ((calendar.get(Calendar.MONTH) + 1) < 10 ? "0" + (calendar.get(Calendar.MONTH) + 1) : (calendar.get(Calendar.MONTH) + 1));
            }
        }
        tablesName.add(preMonthTableName);
        return tablesName;
    }
}
