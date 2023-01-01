package cl.exql;

/**
 * The SwimmingCoach Class has methods that gives a plan to train swimming, also the fortune.
 *
 * @author Exequiel Venegas
 * @version 0.1
 * @since 2022-12-17
 */
public class SwimmingCoach implements Coach {

    private FortuneService fortuneService;

    public SwimmingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    /**
     * This method get a daily workout to train swimming, every day, forever.
     *
     * @return String This returns the daily workout.
     */
    @Override
    public String getDailyWorkout() {
        return "Swim even more! 1 KM more!.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
