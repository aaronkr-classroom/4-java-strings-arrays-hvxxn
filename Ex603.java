public class Ex603 {
    public static void main(String[] args) {
        double[] myClassGrades = new double[] {
                { 89.1, 88.2, 83.2, 85.5, 75.2 },
                { 95.0, 93.2, 91.1, 89.9, 75.5 },
                { 87.7, 65.2, 54.2, 32.1, 10.0 },
                { 88.3, 66.6, 77.7, 88.8, 99.9 },
                { 100.0, 99.9, 98.0, 97.6, 100.0 }
        };
        String[] myClass = new String[] {
                "국어", "수학", "공학", "사회", "PE"
        };

        for (int i = 0; i < myClass.length; i++) {
            System.out.println(myClass[i] + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.println(myClassGrades[i][j]);
            }
        }
        /*
         * double sum = 0.0;
         * 
         * for (int i = 0; i < myGrades.length; i++) {
         * sum += myGrades[i];
         * }
         * 
         * avg = sum / myGrades.length;
         * 
         * System.out.println(("합계: " + sum));
         * System.out.println("평균: " %.2f avg);
         */
    }
}