package com.runjian.community.parking.project.gsproject.demo;

import java.math.BigDecimal;

public class FruitCalculatorFour {

    // 计算购买水果的总价
    public static BigDecimal calculateTotalPrice(BigDecimal appleKg, BigDecimal strawberryKg, BigDecimal mangoKg) {
        // 创建一个 BigDecimal 对象用于存储总价
        BigDecimal totalPrice = BigDecimal.ZERO;

        // 将苹果、草莓和芒果的单价转换为 BigDecimal 类型
        BigDecimal applePrice = new BigDecimal("8");
        BigDecimal strawberryPrice = new BigDecimal("13").multiply(new BigDecimal("0.8")); // 草莓打 8 折
        BigDecimal mangoPrice = new BigDecimal("20");

        // 计算苹果、草莓和芒果的总价
        totalPrice = totalPrice.add(appleKg.multiply(applePrice));
        totalPrice = totalPrice.add(strawberryKg.multiply(strawberryPrice));
        totalPrice = totalPrice.add(mangoKg.multiply(mangoPrice));

        // 判断是否满足满 100 减 10 的条件
        if (totalPrice.intValue() >= 100) {
            totalPrice = totalPrice.subtract(new BigDecimal("10"));
        }

        return totalPrice;
    }

    public static void main(String[] args) {
        // 假设顾客 D 购买了 3.5 斤苹果、2.2 斤草莓和 1.8 斤芒果
        BigDecimal appleKg = new BigDecimal("3.5");
        BigDecimal strawberryKg = new BigDecimal("2.2");
        BigDecimal mangoKg = new BigDecimal("1.8");

        // 调用 calculateTotalPrice 函数计算总价
        BigDecimal totalPrice = calculateTotalPrice(appleKg, strawberryKg, mangoKg);

        // 预估的总价，用于验证计算结果
        BigDecimal expectedTotalPrice = new BigDecimal("81.04");

        // 比较计算结果与预估结果
        if (totalPrice.compareTo(expectedTotalPrice) == 0) {
            System.out.println("程序计算结果正确，总价为：" + totalPrice);
        } else {
            System.out.println("程序计算结果错误，预估总价为：" + expectedTotalPrice + "，实际总价为：" + totalPrice);
        }
    }
}