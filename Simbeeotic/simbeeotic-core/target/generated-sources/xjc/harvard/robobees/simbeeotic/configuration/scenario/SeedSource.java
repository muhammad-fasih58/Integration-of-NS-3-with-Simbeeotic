//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.07 at 01:36:48 PM PKT 
//


package harvard.robobees.simbeeotic.configuration.scenario;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeedSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeedSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="RANDOM_STREAM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeedSource")
@XmlEnum
public enum SeedSource {


    /**
     * 
     *                         If the see source is not specified or if the DEFAULT value is specified, the seed will be set
     *                         the the default value of 1.
     *                     
     * 
     */
    DEFAULT,

    /**
     * 
     *                         Sepcifying a seed-source of USER will casue this random variable to be seeded by the specified
     *                         user seed value.  The seed attribute becomes required when USER is specified.
     *                     
     * 
     */
    USER,

    /**
     * 
     *                         Specifying a seed-source of RANDOM_STREAM will cause the seed to be drawn from a random stream
     *                         internal to the framework.  That stream is seeded by the master seed for the scenario.  Specifying
     *                         RANDOM_STREAM guarentees that multiple looping variables in the same scenario will be independant
     *                         from one-another and repeatable for a given run (as long as the master seed remains unchanged).
     *                     
     * 
     */
    RANDOM_STREAM;

    public String value() {
        return name();
    }

    public static SeedSource fromValue(String v) {
        return valueOf(v);
    }

}
