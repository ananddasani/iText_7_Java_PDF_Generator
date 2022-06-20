package org.example;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

import java.io.FileNotFoundException;

public class Template
{
    public static void main( String[] args ) throws FileNotFoundException {
        String path = "d:\\Data\\GeneratedPDF\\App.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //our main code goes here

        document.close();

        System.out.println("Pdf Created!!!");
    }
}

/*
This is the basic skeleton we will follow throughout hte project
 */