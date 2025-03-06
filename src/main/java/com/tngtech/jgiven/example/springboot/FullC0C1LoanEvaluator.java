// 100% 網羅にするテスト対象
public class FullC0C1LoanEvaluator {
    public String evaluateLoan(int creditScore, int income, int loanAmount) {
        if (creditScore < 600) {
            return "REJECTED";
        }

        if (income < 3000000) {
            if (loanAmount > 10000000) {
                return "REJECTED";
            }
            return "FURTHER_REVIEW";
        }

        if (loanAmount > 50000000) {
            if (creditScore < 800) {
                return "FURTHER_REVIEW";
            }
        }

        return "APPROVED";
    }
}
