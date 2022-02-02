package com.academy.exercise;

public class Pie {
    //    The huge pie was divided among a hundred guests.
//    The first guest received 1% of the whole pie,
//    the second received 2% of what was left,
//    the third received 3% of what was left after the first two guests, and so on.
//    The last guest received 100% of what was left after the 99th guest.
//    Whose piece of the pie was the biggest?
    public static void main(String[] args) {
        Double pie = 1.;
        Double pieAfter = pie;
        Integer percent = 1;

        var firstGuest = pie * percent * 0.01;
        var maxPartGuest = firstGuest;
        var maxGuestPercent = 1;
        Double sum = firstGuest;
        while (percent < 100) {
            percent++;
            var secondGuest = (pieAfter - firstGuest) * percent * 0.01;
            pieAfter = pie - secondGuest;
            pie = pieAfter;
            System.out.println(percent + " " + firstGuest + " " + secondGuest);
            if (secondGuest > firstGuest) {
                maxPartGuest = secondGuest;
                maxGuestPercent = percent;
            }
            firstGuest = secondGuest;
            sum += secondGuest;

        }
        System.out.println("maxPercentGuest :" + maxPartGuest+"percent: "+maxGuestPercent);
        System.out.println("check sum of pie must be equal 1 :" + sum);
        //Лучше всего быть десятым гостем — он получит самый большой кусок пирога.

    }

}
