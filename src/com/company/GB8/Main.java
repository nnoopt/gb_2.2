package com.company.GB8;

public class Main {

    static final int SIZE = 4;

    public static void main(String[] args) {

        String mas [][]={
                {"6", "7", "9", "9"},
                {"1", "8", "6", "9"},
                {"6", "а", "9", "2"},
                {"2", "7", "5", "в"},
        };


        try {
            System.out.println(met(mas));
        } catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println(e.getRow() + " " + e.getCol());
            System.out.println(mas [e.getRow()] [e.getCol()]);
        }



    }


    public static int met (String arr [][]) throws MyArraySizeException, MyArrayDataException  {

        if (arr.length !=SIZE)throw new MyArraySizeException ();

        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("format"+ i + " " + j, i, j );
                }


            }
        }

        return sum;

    }
}
