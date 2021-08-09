package org.acme;

import java.io.Serializable;

public class SomeDTO implements Serializable {
    public String someField;

    public SomeDTO() {
    }

    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }
}
