package org.example;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PDF4_Add_Font {

    public static void main(String[] args) throws IOException {

        String path = "d:\\Data\\GeneratedPDF\\Font.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //Adding font into the pdf
        PdfFont pdfFont = PdfFontFactory.createFont();

        Text text = new Text("I am Anand Dasani").setFont(pdfFont);

        Paragraph paragraph = new Paragraph().add(text);

        document.add(paragraph);
        document.close();
        System.out.println("PDF Created");


    }
}
