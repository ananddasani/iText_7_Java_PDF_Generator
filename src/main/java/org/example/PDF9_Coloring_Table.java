package org.example;

import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.WebColors;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;

public class PDF9_Coloring_Table {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "d:\\Data\\GeneratedPDF\\Table_Coloring.pdf";

        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //Here we will make a table and add it
        float columnWidth[] = {150f, 50f, 100f};
        Table table = new Table(columnWidth);

        //Array for table header
        String[] tableHeader = {"Items", "Color", "Size"};

        //Array for data
        String[][] itemArray = {
                {"Box", "Red", "Big"},
                {"Box", "Red", "Big"},
                {"Box", "Red", "Big"},
                {"Box", "Red", "Big"},
                {"Box", "Red", "Big"},
                {"Box", "Red", "Big"},
        };

        //managing colors
        Color colorRed = WebColors.getRGBColor("red");
        Color colorGreen = WebColors.getRGBColor("green");


        //First add header in the table (Try to use for loop instead :)  )
        for (int i = 0; i < tableHeader.length; i++)
            table.addCell(new Cell().add(new Paragraph(tableHeader[i])).setBold().setBackgroundColor(colorRed));

        for (int i = 0; i < itemArray.length; i++)
            for (int j = 0; j < itemArray[i].length; j++)
                if (i % 2 == 0)
                    table.addCell(new Cell().add(new Paragraph(itemArray[i][j]).setBackgroundColor(colorGreen)));
                else
                    table.addCell(new Cell().add(new Paragraph(itemArray[i][j])));

        document.add(table);
        document.close();

        System.out.println("PDF Created!!");
    }
}
