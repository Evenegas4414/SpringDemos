package cl.exql;

/**
 * The HappyFortuneService is a simple class that tells a good fortune.
 *
 * @author Exequiel Venegas
 * @version 0.1
 * @since 2022-12-17
 */
public class HappyFortuneService implements FortuneService {

    /**
     * This method tells a good fortune.
     *
     * @return String This returns a good fortune.
     */
    @Override
    public String getFortune() {
        return "You will have a great day!.";
    }
}
