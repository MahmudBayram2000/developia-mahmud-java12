package ExchangeMoney;

import java.io.*;import org.w3c.dom.*;
import javax.xml.parsers.*;

import java.net.URL;

public class XMLParsing {
    public static void main(String[] args) {
        try {
            // Create a URL object with the desired URL
            URL url = new URL("https://cbar.az/currencies/05.03.2010.xml");

            // Open a connection to the URL and get the input stream
            InputStream inputStream = url.openStream();

            // Create a DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the XML document
            Document document = builder.parse(inputStream);

            // Close the input stream
            inputStream.close();

            // Get the root element
            Element root = document.getDocumentElement();

            // Get the list of child elements (currencies)
            NodeList currencyList = root.getElementsByTagName("Valute");

            // Iterate through the currency elements
            for (int i = 0; i < currencyList.getLength(); i++) {
                Element currency = (Element) currencyList.item(i);
                String currencyCode = currency.getAttribute("Code");
                String currencyName = currency.getElementsByTagName("Name").item(0).getTextContent();
                String currencyRate = currency.getElementsByTagName("Value").item(0).getTextContent();

                // Print currency information
                System.out.println("Currency Code: " + currencyCode);
                System.out.println("Currency Name: " + currencyName);
                System.out.println("Currency Rate: " + currencyRate);
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
