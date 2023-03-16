import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 获取用户输入的贷款总额和贷款期限
        System.out.print("请输入贷款总额：");
        double loanAmount = scanner.nextDouble();
        System.out.print("请输入贷款期限（年）：");
        int loanTerm = scanner.nextInt();

        // 计算每个月的支付额和总偿还额
        for (double interestRate = 0.05; interestRate <= 0.08; interestRate += 0.125) {
            // 计算每月支付额
            double monthlyInterestRate = interestRate / 12;
            double monthlyPayment = loanAmount * monthlyInterestRate / 
                (1 - 1 / Math.pow(1 + monthlyInterestRate, loanTerm * 12));

            // 计算总偿还额
            double totalPayment = monthlyPayment * loanTerm * 12;

            // 显示结果
            System.out.println("利率为" + (interestRate * 100) + "%时，" +
                    "每月支付额为：" + monthlyPayment + "元，" +
                    "总偿还额为：" + totalPayment + "元。");
        }

        scanner.close();
    }
}
