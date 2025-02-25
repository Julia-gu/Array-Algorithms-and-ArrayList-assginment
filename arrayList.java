public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(3);
        numbers.add(5);
        numbers.add(11);
        numbers.add(6);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(100);

        System.out.print("ArrayList: ");
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
        System.out.println("Mean: " + (double) sum / numbers.size());

        //min
        int smallest = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest: " + smallest);

        //max
        int biggest = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > biggest) {
                biggest = numbers.get(i);
            }
        }
        System.out.println("Biggest: " + biggest);

        //mode
        int maxCount = 0;
        int mode = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = numbers.get(i);
            }
        }
        System.out.println("Mode: " + mode);

        //reverse
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversed.add(numbers.get(i));
        }
        System.out.println("Reversed:");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println();

        //shift (positive and negative)
        int shift = 3;
        ArrayList<Integer> shifted = new ArrayList<>(numbers);
        for (int i = 0; i < shift; i++) {
            shifted.add(shifted.remove(0));
        }
        System.out.println("Shifted by " + shift + ":");
        for (int num : shifted) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
