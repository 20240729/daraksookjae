package camp.sparta.exception;

public class Step2 {
    public static void main(String[] args) {
        try {
            int[] list = {1, 2, 3};

            int index = 4;
            int element = list[index];

            System.out.println("결과 : " + element);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 길이 초과");
        }
    }
}
