package cl.exql;

/**
 * The Coach interface implement methods that gives a plan to train, also the fortune.
 *
 * @author Exequiel Venegas
 * @version 0.1
 * @since 2022-12-17
 */
public interface Coach {

    /**
     * This method get a daily workout to train, every day, forever.
     *
     * @return String This returns the daily workout.
     */
    public String getDailyWorkout();

    /**
     * This method get a daily fortune, maybe it can be good or bad.
     *
     * @return String This returns the daily fortune.
     */
    public String getDailyFortune();
}
