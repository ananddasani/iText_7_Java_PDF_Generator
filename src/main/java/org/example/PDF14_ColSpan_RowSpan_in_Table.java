package org.example;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class PDF14_ColSpan_RowSpan_in_Table {

    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {

        String path = "d:\\Data\\GeneratedPDF\\Table_ColSpan_RowSpan.pdf";

        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //Here we will make a table and add it
        float[] columnWidth = {120f, 50f, 100f};

        Table table = new Table(columnWidth);

        table.addCell(new Cell().add(new Paragraph("One")));
        table.addCell(new Cell().add(new Paragraph("Two")));
        table.addCell(new Cell(2, 0).add(new Paragraph("Three")));

        table.addCell(new Cell().add(new Paragraph("Four")));
        table.addCell(new Cell().add(new Paragraph("Five")));

        table.addCell(new Cell(0, 2).add(new Paragraph("Siz")));
        table.addCell(new Cell().add(new Paragraph("Seven")));

        document.add(table);
        document.close();

        System.out.println("PDF Created!!");
    }
}
