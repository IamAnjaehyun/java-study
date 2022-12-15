package com.company.design.proxy;
/*
Proxy pattern
Proxy는 대리인 이라는 뜻, 뭔가를 대신해서 처리하는 것
Proxy Class를 통해서 대신 전달 하는 형태로 설계되며, 실제 Client는 Proxy로 부터 결과를 받는다.
Cache의 기능으로도 활용이 가능 하다.
SOLID중에서 개방폐쇄 원칙 (OCP)과 의존 역전 원칙 (DIP)를 따른다.
 */

public class BrowserProxy implements IBrowser{

    private String url;
    private Html html;

    public BrowserProxy(String url){
        this.url = url;
    }
    @Override
    public Html show() {
        if(html == null){
            this.html = new Html(url);
            System.out.println("BrowserProxy loading html from: "+url);
        }
        System.out.println("BrowserProxy use cache html : "+url);

        return html;
    }

}
