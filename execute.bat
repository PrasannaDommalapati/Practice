echo "Mumms automation suite exceution"
echo " ===creating dynamic xml from excel ==="
cd D:\Automation\MummsFrameWork

java -cp .\\lib\\*;.\\target\\test-classes;.\\target\\classes; com.automation.utilities.ExcelToXml

mvn test -DsuiteXmlFile=testng.xml
pause