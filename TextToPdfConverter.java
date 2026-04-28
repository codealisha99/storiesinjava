import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class TextToPdfConverter {
    public static void main(String[] args) throws Exception {
        PDDocument document = new PDDocument();

        PDPage page = new PDPage();
        document.addPage(page);

        PDPageContentStream content = new PDPageContentStream(document, page);

        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 14);
        content.newLineAtOffset(50, 700);
        content.showText("Hello, this is my first PDF from Java!");
        content.endText();

        content.close();

        document.save("output.pdf");
        document.close();

        System.out.println("PDF created successfully.");
    }
}
