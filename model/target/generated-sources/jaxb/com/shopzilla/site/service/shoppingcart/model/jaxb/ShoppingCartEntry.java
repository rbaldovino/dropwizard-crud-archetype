//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.20 at 04:26:43 PM PST 
//


package com.shopzilla.site.service.shoppingcart.model.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.shopzilla.com/services/shoppingcart}coreAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ShoppingCartEntry")
public class ShoppingCartEntry {

    @XmlAttribute(name = "shopperId", namespace = "http://www.shopzilla.com/services/shoppingcart")
    protected Long shopperId;
    @XmlAttribute(name = "productId", namespace = "http://www.shopzilla.com/services/shoppingcart")
    protected Long productId;
    @XmlAttribute(name = "productName", namespace = "http://www.shopzilla.com/services/shoppingcart")
    protected String productName;
    @XmlAttribute(name = "productCost", namespace = "http://www.shopzilla.com/services/shoppingcart")
    protected Long productCost;

    /**
     * Gets the value of the shopperId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShopperId() {
        return shopperId;
    }

    /**
     * Sets the value of the shopperId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShopperId(Long value) {
        this.shopperId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productCost property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductCost() {
        return productCost;
    }

    /**
     * Sets the value of the productCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductCost(Long value) {
        this.productCost = value;
    }

}
