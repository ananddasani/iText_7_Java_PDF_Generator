package org.example;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import java.io.IOException;

public class PDF6_Text_Decoration {

    public static void main(String[] args) throws IOException {

        String path = "d:\\Data\\GeneratedPDF\\Text_Decoration_and_Style.pdf";

        String yankclipper2 = "fonts\\yankclipper2.ttf";
        String yankclipper2ital = "fonts\\yankclipper2ital.ttf";

        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //Adding font into the pdf
        PdfFont pdfFont = PdfFontFactory.createFont(yankclipper2);
        PdfFont pdfFont2 = PdfFontFactory.createFont(yankclipper2ital);

        Text text = new Text("\nBold").setFont(pdfFont).setBold();
        Text text2 = new Text("\nItalic").setFont(pdfFont2).setItalic();
        Text text4 = new Text("\nBold Italic").setFont(pdfFont2).setBold().setItalic();
        Text text3 = new Text("\nUnderline").setFont(pdfFont2).setUnderline();
//        Text text5 = new Text("\nItalic").setFont(pdfFont2).setFontColor();
//        Text text6 = new Text("\nItalic").setFont(pdfFont2).setBold().setStrokeColor();

        //Adding style into pdf
        Style style = new Style();
        style.setFontSize(14f)
                .setItalic()
                .setBold();

        Paragraph paragraph = new Paragraph()
                .add(text)
                .add(text2)
                .add(text3)
                .add(text4);

        Paragraph paragraph1 = new Paragraph("The warning emitted by SLF4J is just that, a warning. Even when multiple bindings are present, SLF4J will pick one logging framework/implementation and bind with it. The way SLF4J picks a binding is determined by the JVM and for all practical purposes should be considered random. As of version 1.6.6, SLF4J will name the framework/implementation class it is actually bound to.\n" +
                "\n" +
                "Embedded components such as libraries or frameworks should not declare a dependency on any SLF4J binding but only depend on slf4j-api. When a library declares a compile-time dependency on a SLF4J binding, it imposes that binding on the end-user, thus negating SLF4J's purpose. When you come across an embedded component declaring a compile-time dependency on any SLF4J binding, please take the time to contact the authors of said component/library and kindly ask them to mend their ways.").addStyle(style);

        document.add(paragraph);
        document.add(paragraph1);

        document.close();
        System.out.println("PDF Created");
    }
}
