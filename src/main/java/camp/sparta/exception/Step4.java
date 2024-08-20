package camp.sparta.exception;

public class Step4 {
    public static void main(String[] args) {

        int index = 4;
        Step4 step4 = new Step4();
        try {
            System.out.println("결과 : " + step4.getElement(index));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 길이 초과");
        }
    }

    public int getElement(int index) {
        int[] list = {1, 2, 3};
        return list[index];
    }
}


