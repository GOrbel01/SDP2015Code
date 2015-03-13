package Annotation;

import javax.xml.bind.ValidationException;

/**
 * Created by Cloud on 27/01/2015.
 */
public class ValidatingMethodCaller {
    String validate(java.lang.reflect.Method m, ) {
        MaxLength maxAnno = m.getAnnotation(MaxLength.class);
        String s = (String) m.invoke();
        if (maxAnno != null && s.length() > maxAnno.value())
        {
            throw new ValidationException("Exceeded Max Length.");
        }
        return s;
    }
}
