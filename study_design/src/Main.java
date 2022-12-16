import com.company.design.decorator.*;

public class Main {
    public static void main(String[] args) {
        /*
//        SingleTone예제
        AClazz aClazz= new AClazz();
        BClazz bClazz= new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
         */

        /*
        adapter
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V adapter = new SocketAdapter(airConditioner);
        connect(adapter);

        Cleaner cleaner = new Cleaner();
        Electronic110V cleanAdapter = new SocketAdapter(cleaner);
        connect(cleanAdapter);
         */

        /*
        Proxy pattern
//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();

//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },

                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );

        //처음엔 1.5초
        aopBrowser.show();
        System.out.println("loading time : "+ end.get());

        //두번째에는 캐시 사용해서 0초
        aopBrowser.show();
        System.out.println("loading time : "+ end.get());

         */

        /*

         */

        ICar audi = new Audi(1000);
        audi.showPrice();

        //a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();
        //a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();
        //a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();
    }

    /*
    //콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
     */

}