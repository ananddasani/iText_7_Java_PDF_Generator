package org.example;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import java.io.IOException;

public class PDF5_Embedded_Fonts {

    public static void main(String[] args) throws IOException {

        String path = "d:\\Data\\GeneratedPDF\\EmbeddedFont.pdf";

        String yankclipper2 = "fonts\\yankclipper2.ttf";
        String yankclipper2ital = "fonts\\yankclipper2ital.ttf";

        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //Adding font into the pdf
        PdfFont pdfFont = PdfFontFactory.createFont(yankclipper2);
        PdfFont pdfFont2 = PdfFontFactory.createFont(yankclipper2ital);

        Text text = new Text("This is yankclipper2 font").setFont(pdfFont);
        Text text2 = new Text("This is yankclipper2 italic font").setFont(pdfFont2);

        Paragraph paragraph = new Paragraph().add(text).add(text2);

        document.add(paragraph);
        document.close();
        System.out.println("PDF Created");
    }
}
