package leetcode.math.excelSheetColumnTitle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 168. Excel Sheet Column Title
 */
public class ExcelSheetColumnTitleTest {
    @Test
    public void test() {

        System.out.println("ExcelSheetColumnTitleTest");

        ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

        int n = 28;
        String ret = solution.convertToTitle(n);
        System.out.println("ret=" + ret);
        Assert.assertTrue(ret.equals("AB"));
    }
}
