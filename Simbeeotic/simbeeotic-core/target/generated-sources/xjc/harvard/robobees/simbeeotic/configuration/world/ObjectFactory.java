//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.07 at 01:36:48 PM PKT 
//


package harvard.robobees.simbeeotic.configuration.world;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the harvard.robobees.simbeeotic.configuration.world package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _World_QNAME = new QName("http://harvard/robobees/simbeeotic/configuration/world", "world");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: harvard.robobees.simbeeotic.configuration.world
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Wall }
     * 
     */
    public Wall createWall() {
        return new Wall();
    }

    /**
     * Create an instance of {@link World }
     * 
     */
    public World createWorld() {
        return new World();
    }

    /**
     * Create an instance of {@link Cylinder }
     * 
     */
    public Cylinder createCylinder() {
        return new Cylinder();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link World.Flowers }
     * 
     */
    public World.Flowers createWorldFlowers() {
        return new World.Flowers();
    }

    /**
     * Create an instance of {@link Obstacle }
     * 
     */
    public Obstacle createObstacle() {
        return new Obstacle();
    }

    /**
     * Create an instance of {@link Box }
     * 
     */
    public Box createBox() {
        return new Box();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Meta.Prop }
     * 
     */
    public Meta.Prop createMetaProp() {
        return new Meta.Prop();
    }

    /**
     * Create an instance of {@link Surface }
     * 
     */
    public Surface createSurface() {
        return new Surface();
    }

    /**
     * Create an instance of {@link Color }
     * 
     */
    public Color createColor() {
        return new Color();
    }

    /**
     * Create an instance of {@link Structure }
     * 
     */
    public Structure createStructure() {
        return new Structure();
    }

    /**
     * Create an instance of {@link Path }
     * 
     */
    public Path createPath() {
        return new Path();
    }

    /**
     * Create an instance of {@link Texture }
     * 
     */
    public Texture createTexture() {
        return new Texture();
    }

    /**
     * Create an instance of {@link World.Obstacles }
     * 
     */
    public World.Obstacles createWorldObstacles() {
        return new World.Obstacles();
    }

    /**
     * Create an instance of {@link Patch }
     * 
     */
    public Patch createPatch() {
        return new Patch();
    }

    /**
     * Create an instance of {@link Meta }
     * 
     */
    public Meta createMeta() {
        return new Meta();
    }

    /**
     * Create an instance of {@link World.People }
     * 
     */
    public World.People createWorldPeople() {
        return new World.People();
    }

    /**
     * Create an instance of {@link World.Structures }
     * 
     */
    public World.Structures createWorldStructures() {
        return new World.Structures();
    }

    /**
     * Create an instance of {@link Cone }
     * 
     */
    public Cone createCone() {
        return new Cone();
    }

    /**
     * Create an instance of {@link Sphere }
     * 
     */
    public Sphere createSphere() {
        return new Sphere();
    }

    /**
     * Create an instance of {@link Man }
     * 
     */
    public Man createMan() {
        return new Man();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link World }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://harvard/robobees/simbeeotic/configuration/world", name = "world")
    public JAXBElement<World> createWorld(World value) {
        return new JAXBElement<World>(_World_QNAME, World.class, null, value);
    }

}