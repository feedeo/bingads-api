package com.feedeo.bingadsapi.impl;

import org.apache.log4j.Logger;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.EmptyStackException;

/**
 * User: maglju
 * Date: 2013-12-17
 * Time: 10:50
 */
public class PrettyPrinter {
    private static final Logger log = Logger.getLogger(PrettyPrinter.class);

    private static final String INDENT_AMOUNT = "4";
    private static Transformer transformer;

    public PrettyPrinter() {
        try {
            transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", INDENT_AMOUNT);
        } catch (TransformerConfigurationException e) {
            log.warn("Unable to initialize XML PrettyPrinter. Error: " + e.toString());
        } catch (TransformerFactoryConfigurationError e) {
            log.warn("Unable to initialize XML PrettyPrinter. Error: " + e.toString());
        }
    }

    /**
     * Transforms XML into a pretty-printed format. If there is an error
     * initializing the PrettyPrinter or transforming the XML message, the raw XML
     * message will be returned.
     *
     * @param xml the XML message to be pretty printed
     * @return the given message in pretty-printed format
     */
    public String prettyPrint(String xml) {
        if (xml == null) {
            return "<null>";
        }

        if (transformer != null) {
            try {
                StreamResult result = new StreamResult(new StringWriter());
                transformer.transform(new StreamSource(new StringReader(xml)), result);
                return result.getWriter().toString();
            } catch (TransformerException e) {
                log.warn("Unable to pretty print XML:\n" + xml, e);
                return xml;
            } catch (NullPointerException e) {
                log.warn("Unable to pretty print XML:\n" + xml, e);
                return xml;
            } catch (ArrayIndexOutOfBoundsException e) {
                log.warn("Unable to pretty print XML:\n" + xml, e);
                return xml;
            } catch (EmptyStackException e) {
                log.warn("Unable to pretty print XML:\n" + xml, e);
                return xml;
            }
        } else {
            return xml;
        }
    }
}
