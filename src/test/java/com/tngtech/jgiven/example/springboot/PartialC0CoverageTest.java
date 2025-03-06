// 部分的網羅なテスト
class PartialC0CoverageTest {
    private final PartialC0LoanEvaluator evaluator = new PartialC0LoanEvaluator();

    @Test
    void testLoanEvaluation_FullC1PartialC0() {
        // すべての分岐を網羅
        assertEquals("REJECTED", evaluator.evaluateLoan(550, 4000000, 5000000));
        assertEquals("REJECTED", evaluator.evaluateLoan(650, 2000000, 15000000));
        assertEquals("FURTHER_REVIEW", evaluator.evaluateLoan(750, 4000000, 60000000));
        assertEquals("APPROVED", evaluator.evaluateLoan(850, 4000000, 60000000));

        // 注: 以下の命令は未実行
        // - 低収入で低額ローンのケース
        // - 中程度の収入と低額ローンの標準的な承認ケース
    }
}
