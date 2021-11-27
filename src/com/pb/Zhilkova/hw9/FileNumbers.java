package com.pb.Zhilkova.hw9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileNumbers {

    public static void createNumbers() throws IOException {
        int[][] array = new int[10][10];

        try (Writer writer = new FileWriter("numbers.txt")) {

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    array[i][j] = ((int) (Math.random() * 99 +1));
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println(new String(Files.readAllBytes(Paths.get("numbers.txt"))));
    }

    public static void createOddNumbers() throws IOException {

        Path path = Paths.get("numbers.txt");
        int[][] array = new int[10][10];

        try{
            Scanner scan = new Scanner(path);

            for(int i = 0; i <10; i++) {
                for (int j = 0; j < 10; j++) {

                    array[i][j] = scan.nextInt();

                    if(array[i][j] % 2 == 0){
                        array[i][j] = 0;
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

        try (Writer writer = new FileWriter("odd_numbers.txt")) {

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {

                    writer.write(array[i][j] + " ! ");
                }
                writer.write("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println(new String(Files.readAllBytes(Paths.get("odd_numbers.txt"))));
    }
    public static void main(String[] args) throws IOException {
        createNumbers();
        createOddNumbers();
    }
}



