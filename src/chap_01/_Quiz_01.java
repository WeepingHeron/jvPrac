package chap_01;

/*
(실행 결과)
양천04번 버스
약 5분 후 도착
남은 거리 0.8km
 */

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 번호 (1234, 상암08)
        String busNo = "양천04";

        // 남은 시간 (3분, 5분)
        int leftMin = 5;

        // 남은 거리 (1.5km, 0.8km)
        double leftDistance = 0.8;

        System.out.println(busNo + "번 버스");
        System.out.println("약 " + leftMin + "분 후 도착");
        System.out.println("남은 거리 " + leftDistance + "km");
    }
}
