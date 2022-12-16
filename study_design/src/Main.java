import com.company.design.decorator.*;
import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.SftpClient;
import com.company.design.facade.Writer;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
import com.company.design.strategy.*;

public class Main {
    public static void main(String[] args) {
        /*
        //SingleTon 예제
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
        //Proxy pattern
        IBrowser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();

        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();

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
        //decorator pattern
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
         */

        /*
        //observer pattern
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("메세지 전달 : click 1");
        button.click("메세지 전달 : click 2");
        button.click("메세지 전달 : click 3");
        button.click("메세지 전달 : click 4");
        */

        /*
        facade pattern
        System.out.println("facade pattern 사용  ");

        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisConnect();
        ftpClient.disConnect();

        System.out.println();
        System.out.println("facade pattern 사용 후 ");
        System.out.println();
        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"/home/etc","text.tmp");
        sftpClient.connect();

        sftpClient.write();

        sftpClient.read();

        sftpClient.disConnect();
         */

        //strategy pattern
        Encoder encoder = new Encoder();

        //base64
        EncodingStrategy base64 = new Base64Strategy();

        //normal
        EncodingStrategy normal = new NormalStrategy();
        //원본객체 그대로 주 전략만 수정해서 다른 결과를 얻어냄
        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64result = encoder.getMessage(message);
        System.out.println(base64result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

    }

    /*
    //콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
     */

}