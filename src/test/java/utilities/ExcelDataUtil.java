package utilities;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;

public class ExcelDataUtil {

    public static final String exceptionCaught = "Exception caught";
    private static final int columnToLookTestCaseID = Integer.parseInt(ConfigReader.getValue("columnToLookTestCaseID"));
    private static final String testDatafilePath = ConfigReader.getValue("testDataExcelPath");
    private static final String excelExtensionXlsx = ".xlsx";
    private static final String excelExtensionXls = ".xls";
    private static FileInputStream fs = null;
    private static Workbook workbook = null;
    private static Sheet sheet = null;

    /**
     * <H1>Excel initialize</H1>
     *
     * @param filePath  the file path
     * @param sheetName the sheet name
     */
    public static void init(String filePath, String sheetName) {
        String fileExtensionName = filePath.substring(filePath.indexOf('.'));
        try {
            fs = new FileInputStream(filePath);
            if (fileExtensionName.equals(excelExtensionXlsx))
                workbook = new XSSFWorkbook(fs);
            else if (fileExtensionName.equals(excelExtensionXls))
                workbook = new HSSFWorkbook(fs);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e) {
            LogUtil.errorLog(ExcelDataUtil.class, exceptionCaught, e);
        }
    }

    /**
     * <H1>Get test data with test case id</H1>
     *
     * @param sheetName  the sheet name
     * @param testCaseID the test case id
     * @return test data with test case id
     */
    public static HashMap<String, String> getTestDataWithTestCaseID(String sheetName, String testCaseID) {
        boolean found = false;
        boolean isFirstRow = false;
        Row firstRow = null;
        // Initialize class

        // Get Path and Sheet Name from Property File
        final HashMap<String, String> currentRowData = new HashMap<>();
        init(testDatafilePath, sheetName);
        Iterator<Row> rowIterator = sheet.iterator();
        try {
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                if (!isFirstRow) {
                    firstRow = row;
                    isFirstRow = true;
                }
                if (row.getCell(columnToLookTestCaseID).getStringCellValue().equalsIgnoreCase(testCaseID)) {
                    found = true;
                    for (int i = 0; i < row.getLastCellNum(); i++) {
                        String cellValue = row.getCell(i).getStringCellValue();
                        if (cellValue == null)
                            cellValue = "";
                        cellValue = getUniqueString(cellValue);
                        currentRowData.put(firstRow.getCell(i).getStringCellValue(), cellValue);
                    }
                    break;
                }
            }
            fs.close();
        } catch (Exception e) {
            LogUtil.errorLog(ExcelDataUtil.class, "caught exception", e);
        }
        if (!found)
            LogUtil.infoLog(ExcelDataUtil.class, "No data found with given key-> " + testCaseID);
        return currentRowData;
    }

    /**
     * Gets unique string.
     *
     * @param string the string
     * @return the unique string
     */
    public static String getUniqueString(String string) {
        return string.replaceAll("UNIQUE", "" + System.currentTimeMillis());
    }

}
