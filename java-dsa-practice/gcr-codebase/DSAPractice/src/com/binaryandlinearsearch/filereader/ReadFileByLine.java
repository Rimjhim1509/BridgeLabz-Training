package com.binaryandlinearsearch.filereader;
import java.io.*;
public class ReadFileByLine {
	public static void main(String[] args) throws IOException {
		FileReader fd = new FileReader("sample.txt");
		BufferedReader br = new BufferedReader(fd);
		String line ;
		while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        fd.close();

	}
}
