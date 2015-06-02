package season.springmvc.utils;

import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;

/**
 * 字符串工具类，包括常见的字符串判空，正则匹配等操作
 * @author Administrator
 *
 */
public class StringUtils {
	private static Logger logger = Logger.getLogger(StringUtils.class);
	/**
	 * 字符串判空操作
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		return str == null || str.length() == 0;
	}
	/**
	 * 编码转换
	 * @param sourceEncoding 原编码
	 * @param destEncoding 目标编码
	 * @param str 字符串
	 * @return 错误返回null
	 * @throws UnsupportedEncodingException 不支持的类型
	 */
	public static String convertEncoding(String sourceEncoding,String destEncoding,String str) throws UnsupportedEncodingException{
		try {
			if(str == null) return str;
			return new String(str.getBytes(sourceEncoding), destEncoding);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			if(logger.isDebugEnabled()){
				logger.debug("不支持的字符编码类型，请检查输入是否有误");
			}
			throw e;
		}
	}
	
}
