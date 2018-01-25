import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGState;
import com.itextpdf.text.pdf.PdfWriter;

public class BackgroundTransparent {
	public static final String IMAGE = "/resources/images/berlin2013.jpg";
	public static final String DEST = "/results/images/background_transparent.pdf";

	public static void main(String[] args) throws IOException,
			DocumentException {
		File file = new File(DEST);
		file.getParentFile().mkdirs();
		new BackgroundTransparent().createPdf(DEST);
		System.out.println("fin");
	}

	public void createPdf(String dest) throws IOException, DocumentException {
		Document document = new Document(PageSize.A4.rotate());
		PdfWriter writer = PdfWriter.getInstance(document,
				new FileOutputStream(dest));
		document.open();
		document.add(new Paragraph("Berlingfhf!"));
		PdfContentByte canvas = writer.getDirectContentUnder();
		 Image image = Image.getInstance(IMAGE);
		// image.scaleAbsolute(PageSize.A4.rotate());
		// image.setAbsolutePosition(0, 0);
		// canvas.saveState();
		// PdfGState state = new PdfGState();
		// state.setFillOpacity(0.6f);
		// canvas.setGState(state);
		// canvas.addImage(image);
		// canvas.restoreState();
		document.close();
	}
}