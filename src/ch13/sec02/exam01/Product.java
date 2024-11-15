package ch13.sec02.exam01;

//제네릭타입 = 어떤 타입이 들어갈지 안 정해졌을 때
public class Product <K,M>{
    //사용할 때 K,M 자리에 구체적인 타입을 넣어주면 그 타입이 들어간다.
    //필드
    private K kind;
    private M model;

    //메소드
    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
