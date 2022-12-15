import com.company.design.adapter.*;

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

        //110V 짜리 드라이기
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        //220V 짜리 청소기
        Cleaner cleaner = new Cleaner();
//        connect(cleaner);
        //어댑터에 220V짜리 청소기 넣음
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        //220V 에어컨
        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(adapter);
    }


    //콘센트
    //main이 static 이라 얘도 static 으로 만들어야 함
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}