package com.company.design.singleton;

public class AClazz {
    private SocketClient socketClient;

    public AClazz(){
        this.socketClient = SocketClient.getInstance();
//        this.socketClient = new SocketClient();
        //이래버리면 안됨 새로생성한거라 BClazz에서 만든거랑 다른게 생성됨
    }


    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
