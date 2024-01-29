package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int result = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else if (power == 0) {
            System.out.println("1");
        }else {
            System.out.println(1);
            for (int i = 1; i <= power; i++) {
            result = result * 2;
            System.out.println(result);
        }
        }


    }
}
