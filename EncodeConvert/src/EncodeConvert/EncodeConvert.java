package EncodeConvert;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class EncodeConvert {
	public static void main(String[] args) throws IOException {
		// @note GBK编码格式源码路径 
		String srcDirPath = "D:\\git\\repository\\III_刷题\\刷题";
		// @note 转为UTF-8编码格式源码路径 
		String utf8DirPath = "D:\\git\\repository\\III_刷题\\刷题";
		// @note 获取所有java文件 
		Collection<File> javaGbkFileCol = FileUtils.listFiles(new File(srcDirPath), new String[] { "java" }, true);

		for (File javaGbkFile : javaGbkFileCol) {
			// @note UTF8格式文件路径
			String utf8FilePath = utf8DirPath + javaGbkFile.getAbsolutePath().substring(srcDirPath.length());
			// @note 使用GBK读取数据，然后用UTF-8写入数据
			FileUtils.writeLines(new File(utf8FilePath), "UTF-8", FileUtils.readLines(javaGbkFile, "GBK"));
		}
	}
}