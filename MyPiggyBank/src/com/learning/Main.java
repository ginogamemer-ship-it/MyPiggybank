package com.learning;

public class Main {
    public static void main(String[] args) {
        // สร้างกระปุกใบแรก
        PiggyBank bank1 = new PiggyBank("น้องพอใจ");

        // ดูเงินครั้งแรก (ควรเป็น 0)
        bank1.showMoney();

        // หยอดเงิน 2-3 ครั้ง
        bank1.addMoney(20);
        bank1.addMoney(50);

        // ดูเงินอีกครั้งหลังจากหยอดแล้ว
        bank1.showMoney();
    }
}
