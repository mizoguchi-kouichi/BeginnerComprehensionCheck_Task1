package com.kouichi;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int total = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("1番目の数字を入力してください:");

    int firstNumber = scanner.nextInt();
    System.out.print("演算子を入力してください(+, -, *, /):");
    String operator = scanner.next();
    System.out.print("2番目の数字を入力してください");
    int secondNumber = scanner.nextInt();
    System.out.print("\r\n");

    total = switch (operator) {
      case "+" -> firstNumber + secondNumber;
      case "-" -> firstNumber - secondNumber;
      case "*" -> firstNumber * secondNumber;
      case "/" -> firstNumber / secondNumber;
      default -> total;
    };

    System.out.printf("   計算結果:" + firstNumber + operator + secondNumber + "=" + total);
  }
}