package cl.exql;

/**
 * The RunningCoach Class has methods that gives a plan to train running, also the fortune.
 *
 * @author Exequiel Venegas
 * @version 0.1
 * @since 2022-12-17
 */
public class RunningCoach implements Coach {

    private FortuneService fortuneService;

    public RunningCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    /**
     * This method get a daily workout to train running, every day, forever.
     *
     * @return String This returns the daily workout.
     */
    @Override
    public String getDailyWorkout() {
        return "Run even more! 1KM more!.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
