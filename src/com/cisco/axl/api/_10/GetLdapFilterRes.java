
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLdapFilterRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLdapFilterRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ldapFilter" type="{http://www.cisco.com/AXL/API/10.5}RLdapFilter"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLdapFilterRes", propOrder = {
    "_return"
})
public class GetLdapFilterRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLdapFilterRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLdapFilterRes.Return }
     *     
     */
    public GetLdapFilterRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLdapFilterRes.Return }
     *     
     */
    public void setReturn(GetLdapFilterRes.Return value) {
        this._return = value;
    }


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
     *         &lt;element name="ldapFilter" type="{http://www.cisco.com/AXL/API/10.5}RLdapFilter"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ldapFilter"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLdapFilter ldapFilter;

        /**
         * Gets the value of the ldapFilter property.
         * 
         * @return
         *     possible object is
         *     {@link RLdapFilter }
         *     
         */
        public RLdapFilter getLdapFilter() {
            return ldapFilter;
        }

        /**
         * Sets the value of the ldapFilter property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLdapFilter }
         *     
         */
        public void setLdapFilter(RLdapFilter value) {
            this.ldapFilter = value;
        }

    }

}
