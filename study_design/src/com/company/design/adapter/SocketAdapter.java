package com.company.design.adapter;

/*
Adapter parrtern
실생활에서는 110볼트를 220볼트로 변경해주거나 반대로 해주는 돼지코가 있다
호환성이 없는 기존 클래스의 인터페이스를 변환하여 재사용 할 수 있게 해줌
SOLID 중에서 개방폐쇄 원칙 (OCP)를 따른다.

 */

public class SocketAdapter implements Electronic110V{
    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V=electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
