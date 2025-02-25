public class ArrayAlgorithms {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 7, 9, 3, 5, 11, 6, 4, 2, 5, 100};
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        //sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        //mean
        System.out.println("Mean: " + (double) sum / numbers.length);

        //min 
        int smallest = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest: " + smallest);

        //max
        int biggest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
        }
        System.out.println("Biggest: " + biggest);

        //mode
        int[] counts = new int[biggest + 1];
        for (int num : numbers) {
            counts[num]++;
        }
        int biggestCount = counts[0];
        int biggestCountIndex = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > biggestCount) {
                biggestCount = counts[i];
                biggestCountIndex = i;
            }
        }
        System.out.println("Mode: " + biggestCountIndex);

        //mode 2
        int mostCommonSoFar = numbers[0];
        int mostCommonCountSoFar = 0;
        for (int num : numbers) {
            int count = 0;
            for (int num2 : numbers) {
                if (num == num2) {
                    count++;
                }
            }
            if (count > mostCommonCountSoFar) {
                mostCommonSoFar = num;
                mostCommonCountSoFar = count;
            }
        }
        System.out.println("Mode 2: " + mostCommonSoFar);

        //reverse
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[numbers.length - 1 - i] = numbers[i];
        }
        System.out.println("Reversed:");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println();

        //shift (positive and negative)
        int shift = 3;
        int[] shifted = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            shifted[(i + shift + numbers.length) % numbers.length] = numbers[i];
        }
        System.out.println("Shifted by " + shift + ":");
        for (int num : shifted) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
