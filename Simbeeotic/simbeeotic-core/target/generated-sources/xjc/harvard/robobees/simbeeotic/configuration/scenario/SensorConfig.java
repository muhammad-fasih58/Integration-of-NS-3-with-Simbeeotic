//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.07 at 01:36:48 PM PKT 
//


package harvard.robobees.simbeeotic.configuration.scenario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SensorConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SensorConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{http://harvard/robobees/simbeeotic/configuration/scenario}CustomClass">
 *       &lt;sequence>
 *         &lt;element name="offset" type="{http://harvard/robobees/simbeeotic/configuration/scenario}Vector" minOccurs="0"/>
 *         &lt;element name="pointing" type="{http://harvard/robobees/simbeeotic/configuration/scenario}Vector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensorConfig", propOrder = {
    "offset",
    "pointing"
})
public class SensorConfig
    extends CustomClass
{

    protected Vector offset;
    protected Vector pointing;

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Vector }
     *     
     */
    public Vector getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector }
     *     
     */
    public void setOffset(Vector value) {
        this.offset = value;
    }

    /**
     * Gets the value of the pointing property.
     * 
     * @return
     *     possible object is
     *     {@link Vector }
     *     
     */
    public Vector getPointing() {
        return pointing;
    }

    /**
     * Sets the value of the pointing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector }
     *     
     */
    public void setPointing(Vector value) {
        this.pointing = value;
    }

}
