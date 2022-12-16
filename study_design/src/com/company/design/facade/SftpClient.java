package com.company.design.facade;

/*
Facade pattern
Facade 는 건물의 앞쪽 정면 이라는 뜻을 가진다.
여러 개의 객체와 실제 사용하는 서브 객체의 사이에 복잡한 의존관계가 있을 때,
중간에 facade 라는 객체를 두고, 여기서 제공하는 interface 만을 활용하여 기능을 사용하는 방식이다.
Facade 는 자신이 가지고 있는 각 클래스의 기능을 명확하게 알아야 한다.
 */

public class SftpClient {

    private Ftp ftp;
    private Reader reader;
    private Writer writer;

    public SftpClient(Ftp ftp, Reader reader, Writer writer) {
        this.ftp = ftp;
        this.reader = reader;
        this.writer = writer;
    }

    public SftpClient(String host, int port, String path, String fileName) {
        this.ftp = new Ftp(host, port, path);
        this.reader = new Reader(fileName);
        this.writer = new Writer(fileName);
    }

    public void connect() {
        ftp.connect();
        ftp.moveDirectory();
        writer.fileConnect();
        reader.fileConnect();
    }

    public void disConnect() {
        writer.fileDisConnect();
        reader.fileDisconnect();
        ftp.disConnect();
    }

    public void read() {
        reader.fileRead();
    }

    public void write() {
        writer.write();
    }
}
