/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five,
then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens.
For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
The use of "and" when writing out numbers is in compliance with British usage.
 */


import java.util.ArrayList;

public class Problem17 {
    public static void main(String[] args) {
        ArrayList<String> ones = new ArrayList<>();
        {
            ones.add("one");
            ones.add("two");
            ones.add("three");
            ones.add("four");
            ones.add("five");
            ones.add("six");
            ones.add("seven");
            ones.add("eight");
            ones.add("nine");
        }
        ArrayList<String> elevens = new ArrayList<>();
        {
            elevens.add("ten");
            elevens.add("eleven");
            elevens.add("twelve");
            elevens.add("thirteen");
            elevens.add("fourteen");
            elevens.add("fifteen");
            elevens.add("sixteen");
            elevens.add("seventeen");
            elevens.add("eighteen");
            elevens.add("nineteen");
        }
        ArrayList<String> tens = new ArrayList<>();
        {
            tens.add("twenty");
            tens.add("thirty");
            tens.add("forty");
            tens.add("fifty");
            tens.add("sixty");
            tens.add("seventy");
            tens.add("eighty");
            tens.add("ninety");
        }
        ArrayList<String> hundreds = new ArrayList<>();
        {
            hundreds.add("hundredand");
        }
        String part1 = "", part2 = "", part3 = "", part4 = "";
        String finalstring;
        int totalnum = 0;

        for (int i = 1; i < 1001; i++) {
            if (i == 1000){
                part1 = "onethousand";
            } else if (i > 100) {
                part1 = ones.get(getHundredsPlace(i) - 1);
                part2 = hundreds.get(0);
                if(getTensPlace(i) >= 2){
                    part3 = tens.get(getTensPlace(i)-2);
                    if(getOnesPlace(i) != 0) {
                        part4 = ones.get(getOnesPlace(i)-1);
                    }
                } else {
                    part3 = elevens.get(getOnesPlace(i));
                }
            } else if (i == 100) {
                part1 = "onehundred";
            } else if (i >= 10) {
                if(getTensPlace(i) >= 2){
                    part1 = tens.get(getTensPlace(i)-2);
                    if(getOnesPlace(i) == 0){
                        part2 = "";
                    } else if(getOnesPlace(i) != 0) {
                        part2 = ones.get(getOnesPlace(i)-1);
                    }
                }
                else {
                    part1 = elevens.get(getOnesPlace(i));
                }

            } else {
                part1 = ones.get(getOnesPlace(i)-1);

            }

            finalstring = part1 + part2 + part3 + part4;
            System.out.println(i + ": " + finalstring);
            totalnum += finalstring.length();
        }
        totalnum += "onethousand".length();
        System.out.print(totalnum);

    }

    public static int getHundredsPlace(int num){
        if (num < 100){
            return 0;
        } else {
            return (((num % 1000) - (num % 100)) / 100);
        }
    }
    public static int getTensPlace(int num){
        if (num < 10){
            return 0;
        } else {
            return (((num % 100) - (num % 10)) / 10);
        }
    }
    public static int getOnesPlace(int num){
            return (num % 10);
    }


}
