package chap_04;

// 주차요금은 시간당 4000 원 (일일 최대 요금은 30000 원)
// 경차 또는 장애인 차량은 최종 요금에서 50% 할인

// 일반 차량 5시간 주차 시 20000원
// 경차 5시간 주차 시 10000원
// 장애인 차량 10시간 주차 시 15000 원

// 실행결과 : 주차 요금은 xx 원입니다.

public class _Quiz_04 {
    public static void main(String[] args) {
        boolean isSmallCar = true; // 경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부
        int charge = 0;
        int hour = 5; // 주차 시간

        for (int index = 0; index < hour; index++)
        {
            charge += 4000;
            // 30000 원 초과 시 일일 최대 요금으로 수정
            if (charge >= 30000) {
                charge = 30000; // 일일 최대 요금 적용
                break;
            }
        }
        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            charge *= 0.5F; // 50% 할인 적용
        }
        System.out.println("주차 요금은 " + charge + " 원입니다.");
    }
}
