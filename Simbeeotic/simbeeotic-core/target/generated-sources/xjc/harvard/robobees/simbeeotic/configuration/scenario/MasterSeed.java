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
 * <p>Java class for MasterSeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterSeed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="constant" type="{http://harvard/robobees/simbeeotic/configuration/scenario}ConstantMasterSeed"/>
 *         &lt;element name="variable" type="{http://harvard/robobees/simbeeotic/configuration/scenario}VariableMasterSeed"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterSeed", propOrder = {
    "constant",
    "variable"
})
public class MasterSeed {

    protected ConstantMasterSeed constant;
    protected VariableMasterSeed variable;

    /**
     * Gets the value of the constant property.
     * 
     * @return
     *     possible object is
     *     {@link ConstantMasterSeed }
     *     
     */
    public ConstantMasterSeed getConstant() {
        return constant;
    }

    /**
     * Sets the value of the constant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantMasterSeed }
     *     
     */
    public void setConstant(ConstantMasterSeed value) {
        this.constant = value;
    }

    /**
     * Gets the value of the variable property.
     * 
     * @return
     *     possible object is
     *     {@link VariableMasterSeed }
     *     
     */
    public VariableMasterSeed getVariable() {
        return variable;
    }

    /**
     * Sets the value of the variable property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableMasterSeed }
     *     
     */
    public void setVariable(VariableMasterSeed value) {
        this.variable = value;
    }

}