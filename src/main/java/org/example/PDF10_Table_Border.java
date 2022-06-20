package org.example;

import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.colors.WebColors;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.borders.DoubleBorder;
import com.itextpdf.layout.borders.GrooveBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;

public class PDF10_Table_Border {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "d:\\Data\\GeneratedPDF\\Table_Border.pdf";

        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //Here we will make a table and add it
        float columnWidth[] = {150f, 50f, 100f};
        Table table = new Table(columnWidth);

        //Creating Table Border
        Border border = new GrooveBorder(3);
        Border border1 = new GrooveBorder(new DeviceRgb(200, 7, 4), 3);

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
        table.addCell(new Cell().add(new Paragraph(tableHeader[0]).setBorder(border)));
        table.addCell(new Cell().add(new Paragraph(tableHeader[1]).setBorder(border1)));
        table.addCell(new Cell().add(new Paragraph(tableHeader[2]).setBorder(new DoubleBorder(new DeviceRgb(130, 70, 45), 3))));

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

/*
Likewise you can use various borders

here's the link
https://github.com/itext/itext7/tree/develop/layout/src/main/java/com/itextpdf/layout/borders
 */