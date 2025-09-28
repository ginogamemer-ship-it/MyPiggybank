package com.learning;

public class PiggyBank {
    private final String ownerName;
    private double money;

    public PiggyBank(String ownerName) {
        this.ownerName = ownerName;
        this.money = 0.0;  // เริ่มต้นกระปุกไม่มีเงิน
    }

    public void addMoney(double amount) {
        money += amount;
        // ✅ ตรงตามโจทย์
        System.out.println("หย่อนเงินใส่กระปุกของ " + ownerName +
                " จำนวน " + amount + " บาท");
    }

    public void showMoney() {
        // ✅ ตรงตามโจทย์
        System.out.println("กระปุกของ " + ownerName +
                " มีเงินทั้งหมด " + money + " บาท");
    }
}
