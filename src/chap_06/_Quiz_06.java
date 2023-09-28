package chap_06;

// 실행 결과
// 이름 : 김**
// 주민등록번호 : 981019-1******
// 전화번호 : 010-1234-****

// 힌트
// substring()
// length()

public class _Quiz_06 {
//    public static int hiddenLen(String s, int num) {
//        return s.length() - num;
//    }
    public static String getHiddenData(String input, int num) {
        String output = input.substring(0, num); // 김태훈 -> 김
        for (int i = num; i < input.length(); i++) {
            output += "*"; // 김**
        }
        return output;
    }

    public static void main(String[] args) {
        String name = "김태훈"; // 이름
        String id = "981019-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
