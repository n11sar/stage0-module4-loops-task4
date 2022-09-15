package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sumSkipped = 0;
        int sum = 0;
        if (numberToSkip > lastInRow){
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        }else {
            for (int i = 0; i <= numberToSkip; i++){
                sumSkipped += i;
            }
            for (int i = numberToSkip + 1; i <= lastInRow; i++){
                sum += i;
            }
            System.out.println("skipped sum is "+ sumSkipped);
            System.out.println("counted sum is "+ sum);
        }


    }
}
