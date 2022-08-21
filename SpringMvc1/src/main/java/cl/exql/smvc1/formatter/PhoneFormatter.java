package cl.exql.smvc1.formatter;

import cl.exql.smvc1.model.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneFormatter implements Formatter<Phone> {
    @Override
    public Phone parse(String text, Locale locale) throws ParseException {
        String[] phoneAttributes = text.split("-");
        return new Phone(phoneAttributes[0], phoneAttributes[1], phoneAttributes[2]);
    }

    @Override
    public String print(Phone object, Locale locale) {
        return null;
    }
}
