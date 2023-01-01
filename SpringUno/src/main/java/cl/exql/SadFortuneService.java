package cl.exql;

/**
 * The SadFortuneService is a simple class that tells a bad fortune.
 *
 * @author Exequiel Venegas
 * @version 0.1
 * @since 2022-12-17
 */
public class SadFortuneService implements FortuneService {

    /**
     * This method tells a bad fortune.
     *
     * @return String This returns a bad fortune.
     */
    @Override
    public String getFortune() {
        return "You will have a very bad day!.";
    }
}
