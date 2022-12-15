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
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V adapter = new SocketAdapter(airConditioner);
        connect(adapter);

        Cleaner cleaner = new Cleaner();
        Electronic110V cleanAdapter = new SocketAdapter(cleaner);
        connect(cleanAdapter);
    }

    //콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}