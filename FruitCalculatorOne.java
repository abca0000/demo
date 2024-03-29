package com.runjian.community.parking.project.gsproject.demo;

import java.math.BigDecimal;

public class FruitCalculatorOne {

    // 计算购买水果的总价
    public static BigDecimal calculateTotalPrice(BigDecimal appleKg, BigDecimal strawberryKg) {
        // 创建一个 BigDecimal 对象用于存储总价
        BigDecimal totalPrice = BigDecimal.ZERO;

        // 将苹果和草莓的单价转换为 BigDecimal 类型
        BigDecimal applePrice = new BigDecimal("8");
        BigDecimal strawberryPrice = new BigDecimal("13");

        // 计算苹果和草莓的总价并相加
        totalPrice = totalPrice.add(appleKg.multiply(applePrice));
        totalPrice = totalPrice.add(strawberryKg.multiply(strawberryPrice));

        return totalPrice;
    }

    public static void main(String[] args) {
        // 假设顾客 A 购买了 3.5 斤苹果和 2.2 斤草莓
        BigDecimal appleKg = new BigDecimal("3.5");
        BigDecimal strawberryKg = new BigDecimal("2.2");

        // 调用 calculateTotalPrice 函数计算总价
        BigDecimal totalPrice = calculateTotalPrice(appleKg, strawberryKg);

        // 预估价
        BigDecimal expectedTotalPrice = new BigDecimal("47.60");

        // 比较计算结果与预期结果
        if (totalPrice.compareTo(expectedTotalPrice) == 0) {
            System.out.println("程序计算结果正确，总价为：" + totalPrice);
        } else {
            System.out.println("程序计算结果错误，预估价为：" + expectedTotalPrice + "，实际总价为：" + totalPrice);
        }
    }
}