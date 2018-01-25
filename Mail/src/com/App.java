package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import sun.font.FontFamily;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class App {
	
	
	public static final String IMG = "resources/images/bruno.jpg";

	public static void main(String[] args) {
		writePDF();
		System.out.println("termino bien");
	}

	private static void writePDF() {

		Document document = new Document();

		try {
			String path = new File(".").getCanonicalPath();
			String FILE_NAME = path + "/itext-test-file.pdf";

			PdfWriter.getInstance(document, new FileOutputStream(new File(
					FILE_NAME)));

			document.open();

			Paragraph paragraphHello = new Paragraph();
			paragraphHello.add("Hello iText paragraph!");
			paragraphHello.setAlignment(Element.ALIGN_JUSTIFIED);

			document.add(paragraphHello);

			Paragraph paragraphLorem = new Paragraph();
			paragraphLorem
					.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit."
							+ "Maecenas finibus fringilla turpis, vitae fringilla justo."
							+ "Sed imperdiet purus quis tellus molestie, et finibus risus placerat."
							+ "Donec convallis eget felis vitae interdum. Praesent varius risus et dictum hendrerit."
							+ "Aenean eu semper nunc. Aenean posuere viverra orci in hendrerit. Aenean dui purus, eleifend nec tellus vitae,"
							+ " pretium dignissim ex. Aliquam erat volutpat. ");

			java.util.List<Element> paragraphList = new ArrayList<>();

			paragraphList = paragraphLorem.breakUp();

			Font f = new Font();
			// f.setFamily(FontFamily.getAllFamilyNames());
			f.setStyle(Font.BOLDITALIC);
			f.setSize(8);

			Paragraph p3 = new Paragraph();
			p3.setFont(f);
			p3.addAll(paragraphList);
			p3.add("TEST LOREM IPSUM DOLOR SIT AMET CONSECTETUR ADIPISCING ELIT!");

			document.add(paragraphLorem);
			document.add(p3);
			document.close();

		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
