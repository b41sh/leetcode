package leetcode.math.excelSheetColumnNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for 171. Excel Sheet Column Number
 */
public class ExcelSheetColumnNumberTest {
    @Test
    public void test() {

        System.out.println("ExcelSheetColumnNumberTest");

        ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();

        String s = "ZY";
        int ret = solution.titleToNumber(s);
        System.out.println("ret=" + ret);
        Assert.assertTrue(new Integer(ret).equals(701));
    }
}
