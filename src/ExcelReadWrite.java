
	import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import java.io.File;
import java.io.IOException;
	public class ExcelReadWrite {
	String filePath;
	ExcelReadWrite(String filePath){
	this.filePath = filePath;
	}
	// writing excel file
	public void writeExcelFile(){
	WritableWorkbook excelSheet = null;
	try {
	excelSheet = Workbook.createWorkbook(new File(filePath));
	WritableSheet excelFile = excelSheet.createSheet("Sheet 1", 0);
	Label label = new Label(0, 0, "Test Count");
	excelFile.addCell(label);
	/*Number number = new Number(0, 1, 1);
	excelFile.addCell((WritableCell) number);*/
	label = new Label(1, 0, "Result");
	excelFile.addCell(label);
	label = new Label(1, 1, "Passed");
	excelFile.addCell(label);
/*	number = new Number(0, 2, 2);
	excelFile.addCell((WritableCell) number);*/
	label = new Label(1, 2, "Passed 2");
	excelFile.addCell(label);
	excelSheet.write();
	}catch (Exception e){
	e.printStackTrace();
	}
	}

}
