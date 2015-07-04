//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.01 at 10:52:41 PM EEST 
//

package Projects.Project3.Classes;

import Projects.Project3.Classes.generated.AmmunitionType;
import Projects.Project3.Classes.generated.ParametersType;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for planeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="planeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chars" type="{}charsType"/>
 *         &lt;element name="parameters" type="{}parametersType"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *       &lt;attribute name="model" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planeType", propOrder = {
    "origin",
    "chars",
    "parameters",
    "price"
})

public class WarPlane {

    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected Characters chars;
    @XmlElement(required = true)
    protected Parameters parameters;
    protected float price;
    @XmlAttribute(name = "model")
    protected String model;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the chars property.
     * 
     * @return
     *     possible object is
     *     {@link CharsType }
     *     
     */
    public Characters getChars() {
        return chars;
    }

    /**
     * Sets the value of the chars property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharsType }
     *     
     */
    public void setChars(Characters value) {
        this.chars = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersType }
     *     
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersType }
     *     
     */
    public void setParameters(Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "origin='" + origin + '\'' +
                ", chars=" + chars +
                ", parameters=" + parameters +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }

    public class Parameters {

        protected float length;
        protected float width;
        protected float height;

        /**
         * Gets the value of the length property.
         *
         */
        public float getLength() {
            return length;
        }

        /**
         * Sets the value of the length property.
         *
         */
        public void setLength(float value) {
            this.length = value;
        }

        /**
         * Gets the value of the width property.
         *
         */
        public float getWidth() {
            return width;
        }

        /**
         * Sets the value of the width property.
         *
         */
        public void setWidth(float value) {
            this.width = value;
        }

        /**
         * Gets the value of the height property.
         *
         */
        public float getHeight() {
            return height;
        }

        /**
         * Sets the value of the height property.
         *
         */
        public void setHeight(float value) {
            this.height = value;
        }

        @Override
        public String toString() {
            return "Parameters{" +
                    "length=" + length +
                    ", width=" + width +
                    ", height=" + height +
                    '}';
        }
    }

    public class Characters {

        @XmlElement(required = true)
        protected String type;
        protected int spotsNumber;
        protected Ammunition ammunition;

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
         * Gets the value of the spotsNumber property.
         *
         */
        public int getSpotsNumber() {
            return spotsNumber;
        }

        /**
         * Sets the value of the spotsNumber property.
         *
         */
        public void setSpotsNumber(int value) {
            this.spotsNumber = value;
        }

        /**
         * Gets the value of the ammunition property.
         *
         * @return
         *     possible object is
         *     {@link AmmunitionType }
         *
         */
        public Ammunition getAmmunition() {
            return ammunition;
        }

        /**
         * Sets the value of the ammunition property.
         *
         * @param value
         *     allowed object is
         *     {@link AmmunitionType }
         *
         */
        public void setAmmunition(Ammunition value) {
            this.ammunition = value;
        }

        @Override
        public String toString() {
            return "Characters{" +
                    "type='" + type + '\'' +
                    ", spotsNumber=" + spotsNumber +
                    ", ammunition=" + ammunition +
                    '}';
        }


        public class Ammunition {


            protected int rocketsNumber;
            protected boolean hasRadar;

            /**
             * Gets the value of the rocketsNumber property.
             */
            public int getRocketsNumber() {
                return rocketsNumber;
            }

            /**
             * Sets the value of the rocketsNumber property.
             */
            public void setRocketsNumber(int value) {
                this.rocketsNumber = value;
            }

            /**
             * Gets the value of the hasRadar property.
             */
            public boolean isHasRadar() {
                return hasRadar;
            }

            /**
             * Sets the value of the hasRadar property.
             */
            public void setHasRadar(boolean value) {
                this.hasRadar = value;
            }

            @Override
            public String toString() {
                return "Ammunition{" +
                        "rocketsNumber=" + rocketsNumber +
                        ", hasRadar=" + hasRadar +
                        '}';
            }
        }
    }

}

