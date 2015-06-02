package season.springmvc.utils;

import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;

/**
 * �ַ��������࣬�����������ַ����пգ�����ƥ��Ȳ���
 * @author Administrator
 *
 */
public class StringUtils {
	private static Logger logger = Logger.getLogger(StringUtils.class);
	/**
	 * �ַ����пղ���
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		return str == null || str.length() == 0;
	}
	/**
	 * ����ת��
	 * @param sourceEncoding ԭ����
	 * @param destEncoding Ŀ�����
	 * @param str �ַ���
	 * @return ���󷵻�null
	 * @throws UnsupportedEncodingException ��֧�ֵ�����
	 */
	public static String convertEncoding(String sourceEncoding,String destEncoding,String str) throws UnsupportedEncodingException{
		try {
			if(str == null) return str;
			return new String(str.getBytes(sourceEncoding), destEncoding);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			if(logger.isDebugEnabled()){
				logger.debug("��֧�ֵ��ַ��������ͣ����������Ƿ�����");
			}
			throw e;
		}
	}
	
}
