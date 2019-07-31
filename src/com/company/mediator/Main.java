package com.company.mediator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

/**
 * @Author: Joylice
 * @Date: 2019/6/25 18:00
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("采购人员采购电脑----");
        Purchase purchase = new Purchase();
        purchase.buyIBMcompter(100);

        System.out.println("销售人员销售电脑---");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);

        System.out.println("库房管理人员清库处理---");
        Stock stock = new Stock();
        stock.clearStock();
    }

}
