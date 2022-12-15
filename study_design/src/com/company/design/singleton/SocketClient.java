package com.company.design.singleton;

//SingleTone
//패턴 혹은 객체가 유일하게 1개만 존재할 때 사용(자원을 공유할 때 사용)
//Ex) 프린터 / 프로그래밍에서는 TCP Socket 통신에서 서버와 연결된 connect 객체에 주로 사용됨

public class SocketClient {
    private static SocketClient socketClient = null;

    //디폴트 막고
    private SocketClient() {
    }

    //스태틱메서드로 겟인스턴스 만듬
    //자신의 객체 널이면 신규생성 / 아니면 자신 리턴
    public static SocketClient getInstance() {
        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }


}
