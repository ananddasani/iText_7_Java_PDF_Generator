package org.example;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class PDF13_Adding_List_In_Table {

    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {

        String path = "d:\\Data\\GeneratedPDF\\Table_and_List.pdf";

        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //Here we will make a table and add it
        float columnWidth[] = {150f, 50f, 100f};

        Table table = new Table(columnWidth);

        List list = new List();
        list.add("Apple");
        list.add("Apple");
        list.add("Apple");
        list.add("Apple");

        table.addCell(new Cell().add(new Paragraph("Items")));
        table.addCell(new Cell().add(new Paragraph("Qty")));
        table.addCell(new Cell().add(new Paragraph("Available")));

        table.addCell(new Cell().add(new Paragraph("Mango")));
        table.addCell(new Cell().add(new Paragraph("2 KG")));
        table.addCell(new Cell().add(new Paragraph("Yes")));

        table.addCell(new Cell().add(list));
        table.addCell(new Cell().add(new Paragraph("5 KG")));
        table.addCell(new Cell().add(new Paragraph("No")));

        document.add(table);
        document.close();

        System.out.println("PDF Created!!");
    }
}
