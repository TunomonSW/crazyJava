
import java.math.*;
/**
 * Description:
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class BigDecimalTest
{
	public static void main(String[] args)
	{
		BigDecimal f1 = new BigDecimal("0.05");
		BigDecimal f2 = BigDecimal.valueOf(0.01);
		BigDecimal f3 = new BigDecimal(0.05);
		System.out.println("使用String作为BigDecimal构造器参数：");
		System.out.println("0.05 + 0.01 = " + f1.add(f2));
		System.out.println("0.05 - 0.01 = " + f1.subtract(f2));
		System.out.println("0.05 * 0.01 = " + f1.multiply(f2));
		System.out.println("0.05 / 0.01 = " + f1.divide(f2));
		System.out.println("使用double作为BigDecimal构造器参数：");
		System.out.println("0.05 + 0.01 = " + f3.add(f2));
		System.out.println("0.05 - 0.01 = " + f3.subtract(f2));
		System.out.println("0.05 * 0.01 = " + f3.multiply(f2));
		System.out.println("0.05 / 0.01 = " + f3.divide(f2));
	}
}
