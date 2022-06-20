package org.example;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;

import java.io.FileNotFoundException;

public class PDF7_Create_Table {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "d:\\Data\\GeneratedPDF\\Table.pdf";

        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //Here we will make a table and add it
        float columnWidth[] = {150f, 50f, 100f};

        Table table = new Table(columnWidth);

        Cell cell_11 = new Cell();
        cell_11.add(new Paragraph("Items"));
        table.addCell(cell_11);

        //inline
        table.addCell(new Cell().add(new Paragraph("Qty")));
        table.addCell(new Cell().add(new Paragraph("Available")));

        table.addCell(new Cell().add(new Paragraph("Mango")));
        table.addCell(new Cell().add(new Paragraph("2 KG")));
        table.addCell(new Cell().add(new Paragraph("Yes")));

        table.addCell(new Cell().add(new Paragraph("Apple")));
        table.addCell(new Cell().add(new Paragraph("5 KG")));
        table.addCell(new Cell().add(new Paragraph("No")));

        document.add(table);
        document.close();

        System.out.println("PDF Created!!");
    }
}
