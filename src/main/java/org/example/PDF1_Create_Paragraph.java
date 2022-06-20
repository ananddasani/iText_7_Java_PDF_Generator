package org.example;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class PDF1_Create_Paragraph {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "d:\\Data\\GeneratedPDF\\Paragraph.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //Adding para to the pdf
        String para = "The warning emitted by SLF4J is just that, a warning. Even when multiple bindings are present, SLF4J will pick one logging framework/implementation and bind with it. The way SLF4J picks a binding is determined by the JVM and for all practical purposes should be considered random. As of version 1.6.6, SLF4J will name the framework/implementation class it is actually bound to.\n" +
                "\n" +
                "Embedded components such as libraries or frameworks should not declare a dependency on any SLF4J binding but only depend on slf4j-api. When a library declares a compile-time dependency on a SLF4J binding, it imposes that binding on the end-user, thus negating SLF4J's purpose. When you come across an embedded component declaring a compile-time dependency on any SLF4J binding, please take the time to contact the authors of said component/library and kindly ask them to mend their ways.";

        Paragraph paragraph = new Paragraph(para);
        document.add(paragraph);

        document.close();

        System.out.println("PDF Created");
    }
}
