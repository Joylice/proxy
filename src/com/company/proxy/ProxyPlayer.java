package com.company.proxy;

/**
 * @Author: Joylice
 * @Date: 2019/6/14 9:47
 */
public class ProxyPlayer implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public ProxyPlayer(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }
}
