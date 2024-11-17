package ch06.sec12.hyundai;

import ch06.sec12.hankook.SnowTire;
import ch06.sec12.hankook.Tire;
import ch06.sec12.kumho.AllSeasonTire;

//이름이 같은 클래스 이지만 다른 패키지에 있는 경우 클래스명 앞에 패키지명을 붙이면 구분됨
//이럴땐 import 필요 없음
public class Car {
    Tire tire1 = new Tire();
    ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
}
