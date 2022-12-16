package com.company.design.decorator;


/*
Decorator pattern
데코레이터 패턴은 기존 뼈대 클래스는 유지하되, 이후 필요한 형탤 꾸밀 때 사용한다.
확장이 필요한 경우 상속의 대안으로도 활용 한다.
SOLID중에서 개방폐쇄 원칙 (OCP)과 의존 역전 원칙 (DIP)를 따른다.
Ex) 에스프레소 + 물 -> 아메리카노
	에스프레소 + 우유 -> 라떼
 */
public class AudiDecorator implements ICar{

    protected ICar audi;
    protected String modelName;
    protected int modelPrice;

    public AudiDecorator(ICar audi, String modelName, int modelPrice) {
        this.audi = audi;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }

    @Override
    public int getPrice() {
        return audi.getPrice()+modelPrice;
    }

    @Override
    public void showPrice() {
        System.out.println(modelName + " 의 가격은 " + getPrice() +" 원 입니다.");
    }
}
