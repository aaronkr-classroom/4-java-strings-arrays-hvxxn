public class Ex601 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] myArr = new String[3];

        System.out.println("3개 문자열을 입력하세요");

        // 사용자 입력 받기
        for (int i = 0; i < 3; i++) {
            myArr[i] = s.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(myArr[i] + " ");
        }
    }
}