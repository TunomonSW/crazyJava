
import java.util.logging.*;
/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
public class LoggerTest
{
	public static void main(String[] args)throws Exception
	{
		// 获取System.Logger对象
		System.Logger logger = System.getLogger("fkjava");
		// 设置系统日志级别（FINE对应DEBUG）
		Logger.getLogger("fkjava").setLevel(Level.INFO);
		// 设置使用a.xml保存日志记录
		Logger.getLogger("fkjava").addHandler(new FileHandler("a.xml"));
		logger.log(System.Logger.Level.DEBUG, "debug信息");
		logger.log(System.Logger.Level.INFO, "info信息");
		logger.log(System.Logger.Level.ERROR, "error信息");
	}
}
