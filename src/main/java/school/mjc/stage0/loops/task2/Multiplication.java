package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive != 0) {
            int i  = 0;

            while (i <= (multiplyByAndToInclusive* (multiplyByAndToInclusive< 0? (-1):1 ))  ){

                System.out.println(i*(multiplyByAndToInclusive));
                i++;
            }

        }else if(multiplyByAndToInclusive == 0){
            System.out.println("");
        }

    }
}
