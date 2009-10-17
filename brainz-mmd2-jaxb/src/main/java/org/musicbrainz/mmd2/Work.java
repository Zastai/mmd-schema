
package org.musicbrainz.mmd2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}title" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}artist-credit" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}iswc" minOccurs="0"/>
 *         &lt;group ref="{http://musicbrainz.org/ns/mmd-2.0#}def_work-element_extension"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://musicbrainz.org/ns/mmd-2.0#}def_work-attribute_extension"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "artistCredit",
    "iswc",
    "defExtensionElement"
})
@XmlRootElement(name = "work")
public class Work {

    protected String title;
    @XmlElement(name = "artist-credit")
    protected ArtistCredit artistCredit;
    protected String iswc;
    @XmlAnyElement
    protected List<Element> defExtensionElement;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String type;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the artistCredit property.
     * 
     * @return
     *     possible object is
     *     {@link ArtistCredit }
     *     
     */
    public ArtistCredit getArtistCredit() {
        return artistCredit;
    }

    /**
     * Sets the value of the artistCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtistCredit }
     *     
     */
    public void setArtistCredit(ArtistCredit value) {
        this.artistCredit = value;
    }

    /**
     * Gets the value of the iswc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIswc() {
        return iswc;
    }

    /**
     * Sets the value of the iswc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIswc(String value) {
        this.iswc = value;
    }

    /**
     * Gets the value of the defExtensionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defExtensionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefExtensionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getDefExtensionElement() {
        if (defExtensionElement == null) {
            defExtensionElement = new ArrayList<Element>();
        }
        return this.defExtensionElement;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}