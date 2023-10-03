package chap_13;

// 속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)
// ------------------------------------------------
// (문제) 세 살 __ 여든까지 간다
// 정답 입력 => 버릇
// 정답입니다!!!
//
// (문제) 소 잃고 ___ 고친다
// 정답 입력 => 화장실
// 틀렸습니다. 정답은 외양간입니다.
//
// (문제) 천 리 길도 한 __부터
// 정답 입력 => 걸음
// 정답입니다!!!
//
// ------------------------------------------------
// 모든 퀴즈가 완료되었습니다.
// 수고하셨습니다. ^^

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
        System.out.println("------------------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader("src/chap_13/saying.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                if (line.contains("_")) {
                    System.out.printf("%-5s", "(문제)");
                    System.out.println(line);
                } else {
                    System.out.printf("%10s", "정답 입력 => ");
                    String input = sc.nextLine();
                    if (input.equals(line)) {
                        System.out.println("정답입니다!!!");
                        System.out.println();
                    } else {
                        System.out.println("틀렸습니다. 정답은 " + line + "입니다.");
                        System.out.println();
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("------------------------------------------------");
        System.out.println("모든 퀴즈가 완료되었습니다.");
        System.out.println("수고하셨습니다. ^^");
    }
}
