//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.07 at 01:36:48 PM PKT 
//


package harvard.robobees.simbeeotic.configuration.world;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sphere complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sphere">
 *   &lt;complexContent>
 *     &lt;extension base="{http://harvard/robobees/simbeeotic/configuration/world}Shape">
 *       &lt;attribute name="radius" type="{http://www.w3.org/2001/XMLSchema}float" default="1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sphere")
public class Sphere
    extends Shape
{

    @XmlAttribute
    protected Float radius;

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getRadius() {
        if (radius == null) {
            return  1.0F;
        } else {
            return radius;
        }
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRadius(Float value) {
        this.radius = value;
    }

}