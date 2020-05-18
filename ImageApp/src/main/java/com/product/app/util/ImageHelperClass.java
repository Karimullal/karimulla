package com.product.app.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.stereotype.Service;

@Service
public class ImageHelperClass {

	
	public byte[] compressImage(byte[] data) {
		Deflater deflater = new Deflater();
		deflater.setInput(data);
		deflater.finish();
		byte[] buffer = new byte[1024];
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		while (!deflater.finished()) {
			int count  = deflater.deflate(buffer);
			outputStream.write(buffer, 0, count);
		}
		try {
			outputStream.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return outputStream.toByteArray();		
	}
	
	public static byte[] decompressBytes(byte[] data) {
		Inflater inflater = new Inflater();
		inflater.setInput(data);
		byte[] buffer = new byte[1024];
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		try {
				while(!inflater.finished()) {
					int count = inflater.inflate(buffer);
					outputStream.write(buffer, 0, count);
				} 
				outputStream.close();
		}catch (DataFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return outputStream.toByteArray();
	}
	
}
