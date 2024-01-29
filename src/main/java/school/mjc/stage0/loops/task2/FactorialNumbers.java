package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        System.out.println(1);
        int result = 1;
        for (int i = 1; i <=printToInclusive; i++){
            if (printToInclusive <= 1 ) {
                System.out.println("1");
            }else {
                result = result*i;
                System.out.println(result);
            }

        }
    }
}
