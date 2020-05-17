
package MainPackage;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.time.ZonedDateTime;

public class PDFExampleOne 
{
    static String pdfFileLoc ;
    
    public static void main(String[] args) 
    {
        
        makeDirCurrTime();
        
        try{
           
            Document documentObject = new Document(PageSize.A4,72, 72, 72, 72);
            PdfWriter.getInstance(documentObject, new FileOutputStream(pdfFileLoc));
            documentObject.open();
            
           
            Font bold = FontFactory.getFont(FontFactory.TIMES_BOLD, 12, Font.BOLD);
         
            documentObject.add(new Paragraph("Hello",bold));
            documentObject.add(new Paragraph("Hello"));
            documentObject.close();
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void makeDirCurrTime()
    {
        
        try{
           
            
            String strTime = ZonedDateTime.now().toString();
            strTime = strTime.replaceAll("[\\/\\:]", "-");
            String dirFileLoc = "./Directory"+strTime;
            File dirFile = new File(dirFileLoc);
            dirFile.mkdir();
            
            pdfFileLoc = "./"+dirFileLoc+"/output.pdf";
            
            
        }
        catch(Exception ob)
        {
            System.out.println("EXCEPTION");
        }
    }
    
}
