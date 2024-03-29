//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.07 at 01:36:48 PM PKT 
//


package harvard.robobees.simbeeotic.configuration.scenario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A varible that uses a random number generator to choose a value uniformally over a given range. any of the attributes can be a reference the 'name' of another variable. Otherwise,  'seed' should be a long, 'num-draws' should be an int, and the 'mean'  and 'std-dev' attributes are parsed as a double. 
 * 
 * <p>Java class for NormalRandomLoopingVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NormalRandomLoopingVariable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://harvard/robobees/simbeeotic/configuration/scenario}RandomLoopingVariable">
 *       &lt;attribute name="mean" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="std-dev" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NormalRandomLoopingVariable")
public class NormalRandomLoopingVariable
    extends RandomLoopingVariable
{

    @XmlAttribute(required = true)
    protected String mean;
    @XmlAttribute(name = "std-dev", required = true)
    protected String stdDev;

    /**
     * Gets the value of the mean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMean() {
        return mean;
    }

    /**
     * Sets the value of the mean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMean(String value) {
        this.mean = value;
    }

    /**
     * Gets the value of the stdDev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdDev() {
        return stdDev;
    }

    /**
     * Sets the value of the stdDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdDev(String value) {
        this.stdDev = value;
    }

}
