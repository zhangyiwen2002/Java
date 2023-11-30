package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] B = Main.reverse(A);
        System.out.println(Arrays.toString(B));
    }
            public static int[] reverse(int[] A){

                for(int i=0;i<A.length/2;i++){

                    int temp = A[A.length-i-1];

                    A[A.length-i-1]=A[i];

                    A[i] = temp;

                }

                return A;

            }

        }

