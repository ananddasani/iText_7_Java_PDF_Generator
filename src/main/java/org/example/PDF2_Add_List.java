package org.example;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;

import java.io.FileNotFoundException;

public class PDF2_Add_List {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "d:\\Data\\GeneratedPDF\\List.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //Adding list to the pdf
        List list = new List();
        list.add("Anand Dasani");
        list.add("Anand Dasani");
        list.add("Anand Dasani");
        list.add("Anand Dasani");
        list.add("Anand Dasani");

        document.add(list);
        document.close();

        System.out.println("PDF Created!!!");
    }
}
