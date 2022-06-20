package org.example;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class PDF3_Adding_Image {

    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {

        String path = "d:\\Data\\GeneratedPDF\\Image.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

        //Adding image into the pdf
        String imagePath = "images\\mySnap.png";

        ImageData imageData = ImageDataFactory.create(imagePath);
        Image image = new Image(imageData);

        document.add(image);

        document.close();

        System.out.println("PDF Created");
    }
}
