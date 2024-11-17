package ch11.sec04;

//리소스 파일 자동 닫기 하려면 반드시 AutoClose 상속받아야함
//그러면 finally 에 close 안해도 됨
public class TryWithResourceExample {
    public static void main(String[] args) {
        try (MyResource res = new MyResource("A")){
            String data = res.read1();
            int value = Integer.parseInt(data);

        } catch (Exception e){
            System.out.println("예외처리: " + e.getMessage());
        }
        System.out.println();

        try (MyResource res = new MyResource("A")){
            String data = res.read2();
            int value = Integer.parseInt(data);

        }catch (Exception e){
            System.out.println("예외처리: " + e.getMessage());
        }
        System.out.println();

        // 두개 이상의 리소스 파일 읽기
        MyResource res1 = new MyResource("A");
        MyResource res2 = new MyResource("B");
        try (res1;res2){
            String data1 = res1.read1();
            String data2 = res2.read1();
        } catch (Exception e){
            System.out.println("예외처리: " + e.getMessage());
        }
    }
}
