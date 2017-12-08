package com.test;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOExample {
	/**
	 * Write the bytes from input stream to output stream.
	 * The input stream and output stream are not closed.
	 * @param is
	 * @param os
	 * @throws IOException
	 */
	public  boolean copy(InputStream is, OutputStream os) throws IOException {
        int count = 0;
        //ȱ�ٿ�ָ���ж�
        byte[] buffer = new byte[1024];
		while ((count = is.read(buffer)) >= 0) {
			os.write(buffer, 0, count);
		}
		//δ�ر�I/O��
		return true;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @param ending
	 * @return copy the elements from a to b, and stop when meet element ending
	 */
	public void copy(String[] a, String[] b, String ending)
	{
		int index;
		String temp = null;
		//��ָ�����
		System.out.println(temp.length());
		//δʹ�ñ���
		int length=a.length;
		for(index=0; index<=a.length; index++)
		{
			//�����if���
			if(true)
			{
				//����Ƚ� Ӧʹ��equals
				if(temp==ending)
				{
					break;
				}
				//ȱ�� �����±�Խ����
				b[index]=temp;
			}
		}
	}
	/**
	 * 
	 * @param file
	 * @return file contents as string; null if file does not exist
	 */
	public  void  readFile(File file) {
		InputStream is = null;
		OutputStream os = null;
			try {
				is = new BufferedInputStream(new FileInputStream(file));
				os = new ByteArrayOutputStream();
				//δʹ�÷�������ֵ
				copy(is,os);
				is.close();
				os.close();
			} catch (IOException e) {
				//�������I/O��δ�ر�
				e.printStackTrace();
			} 
			finally
			{
				//�յ�try/catch/finally��
			}
	}
}