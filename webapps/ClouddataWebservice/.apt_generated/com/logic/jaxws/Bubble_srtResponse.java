
package com.logic.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "bubble_srtResponse", namespace = "http://logic.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bubble_srtResponse", namespace = "http://logic.com/")
public class Bubble_srtResponse {

    @XmlElement(name = "return", namespace = "", nillable = true)
    private int[] _return;

    /**
     * 
     * @return
     *     returns int[]
     */
    public int[] getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(int[] _return) {
        this._return = _return;
    }

}
