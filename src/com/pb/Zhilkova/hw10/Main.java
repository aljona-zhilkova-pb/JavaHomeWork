package com.pb.Zhilkova.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> numBoxInt = new NumBox<Integer>(3) {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };
        try {
            numBoxInt.add(0, 8);
            numBoxInt.add(1, 2);
            numBoxInt.add(2, 5);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("It is impossible to pad the array. The array is overflowed. Array length -" + numBoxInt.get(numBoxInt.size));
            e.printStackTrace();
        }
        System.out.println(numBoxInt.index);
        System.out.println(numBoxInt.average());
        System.out.println(numBoxInt.lenght());
        System.out.println(numBoxInt.size);
        System.out.println(numBoxInt.get(1));

        NumBox<Float> numBoxFl = new NumBox<Float>(5) {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };
        try {
            numBoxFl.add(0, 9.50F);
            numBoxFl.add(1, 1.50F);
            numBoxFl.add(2, 6.50F);
            numBoxFl.add(3, 5.50F);
            numBoxFl.add(4, 7.50F);

        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("It is impossible to pad the array. The array is overflowed. Array length -" + numBoxFl.get(numBoxFl.size));
            e2.printStackTrace();
        }
        System.out.println(numBoxFl.size);
        System.out.println(numBoxFl.lenght());
        System.out.println(numBoxFl.get(2));
        System.out.println(numBoxFl.average());
        System.out.println(numBoxFl.index);
        System.out.println(numBoxFl.max());
        System.out.println(numBoxFl.sum());
    }
}
