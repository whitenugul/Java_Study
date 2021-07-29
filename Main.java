import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("숫자 맞추기 게임 시작");
        System.out.println("0부터 99사이의 숫자를 맞추세요");
        System.out.print("입력횟수: ");
        Scanner number = new Scanner(System.in);
        int correct = number.nextInt();
        Random rand = new Random();
        int Value = rand.nextInt(100)+1;

        while(true){
            System.out.print("남은 횟수 "+correct+"회,"+" 어떤 숫자일까? ");
            Scanner num = new Scanner(System.in);
            int num1 = num.nextInt();
            // System.out.println(Value);

            if(Value == num1){
                System.out.println(correct+"회만에 맞추었습니다.");
                System.out.println("정답은 "+Value);
                break;
            }
            correct--;
            if(correct == 0){
                System.out.println("정답을 맞추시지 못했습니다.");
                System.out.println("정답은 "+Value);
                break;
            }

        }


    }
}