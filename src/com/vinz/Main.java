package com.vinz;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
       timsPhone = new DeskPhone(234567,true);
        timsPhone.powerOn();
        timsPhone.dial(12345678);

        timsPhone = new MobilePhone(2345631);
        timsPhone.powerOn();
        timsPhone.isRinging();
        timsPhone.callPhone(2345631);






    }
}
