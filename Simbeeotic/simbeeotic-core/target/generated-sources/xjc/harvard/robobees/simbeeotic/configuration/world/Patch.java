//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.07 at 01:36:48 PM PKT 
//


package harvard.robobees.simbeeotic.configuration.world;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Patch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="center" type="{http://harvard/robobees/simbeeotic/configuration/world}Point"/>
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="density" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="color" type="{http://harvard/robobees/simbeeotic/configuration/world}Color" minOccurs="0"/>
 *         &lt;element name="meta" type="{http://harvard/robobees/simbeeotic/configuration/world}Meta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patch", propOrder = {
    "center",
    "radius",
    "density",
    "color",
    "meta"
})
public class Patch {

    @XmlElement(required = true)
    protected Point center;
    protected float radius;
    protected float density;
    protected Color color;
    protected Meta meta;

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setCenter(Point value) {
        this.center = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     */
    public float getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     */
    public void setRadius(float value) {
        this.radius = value;
    }

    /**
     * Gets the value of the density property.
     * 
     */
    public float getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     */
    public void setDensity(float value) {
        this.density = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link Color }
     *     
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link Color }
     *     
     */
    public void setColor(Color value) {
        this.color = value;
    }

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setMeta(Meta value) {
        this.meta = value;
    }

}
