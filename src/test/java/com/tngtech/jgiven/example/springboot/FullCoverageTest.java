// 100% 網羅なテスト
class FullCoverageTest {
    private final FullC0C1LoanEvaluator evaluator = new FullC0C1LoanEvaluator();

    @Test
    void testLoanEvaluation_FullCoverage() {
        // 低いクレジットスコアでの即時拒否
        assertEquals("REJECTED", evaluator.evaluateLoan(550, 4000000, 5000000));

        // 低収入での条件分岐
        assertEquals("REJECTED", evaluator.evaluateLoan(650, 2000000, 15000000));
        assertEquals("FURTHER_REVIEW", evaluator.evaluateLoan(650, 2000000, 5000000));

        // 高額ローンでの条件分岐
        assertEquals("FURTHER_REVIEW", evaluator.evaluateLoan(750, 4000000, 60000000));
        assertEquals("APPROVED", evaluator.evaluateLoan(850, 4000000, 60000000));

        // 標準的な承認ケース
        assertEquals("APPROVED", evaluator.evaluateLoan(700, 4000000, 30000000));
    }
}
