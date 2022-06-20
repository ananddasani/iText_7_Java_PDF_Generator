package org.example;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class PDF12_Nested_Table {

    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {

        String path = "d:\\Data\\GeneratedPDF\\Nested_Table.pdf";

        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //Here we will make a table and add it
        float columnWidth[] = {150f, 50f, 100f};
        float columnWidth2[] = {150f, 150f};

        Table table = new Table(columnWidth);
        Table table2 = new Table(columnWidth2);

        //------------------------------------------------------------------

        table2.addCell(new Cell().add(new Paragraph("I")));
        table2.addCell(new Cell().add(new Paragraph("Am")));

        table2.addCell(new Cell().add(new Paragraph("Mini")));
        table2.addCell(new Cell().add(new Paragraph("Table")));

        //------------------------------------------------------------------

        table.addCell(new Cell().add(new Paragraph("Items")));
        table.addCell(new Cell().add(new Paragraph("Qty")));
        table.addCell(new Cell().add(new Paragraph("Available")));

        table.addCell(new Cell().add(new Paragraph("Mango")));
        table.addCell(new Cell().add(new Paragraph("2 KG")));
        table.addCell(new Cell().add(new Paragraph("Yes")));

        table.addCell(new Cell().add(table2));
        table.addCell(new Cell().add(new Paragraph("5 KG")));
        table.addCell(new Cell().add(new Paragraph("No")));

        document.add(table);
        document.close();

        System.out.println("PDF Created!!");
    }
}
