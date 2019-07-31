package com.company.proxy;

/**
 * @Author: Joylice
 * @Date: 2019/6/14 9:34
 */
public interface IGamePlayer {
    /**
     * 登录游戏
     *
     * @param user
     * @param password
     */
    void login(String user, String password);

    /**
     * 杀怪
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();
}
