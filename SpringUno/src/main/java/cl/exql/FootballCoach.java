package cl.exql;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach() {

    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Goals even more! 10 goals more!.";
    }

    @Override
    public String getDailyFortune() {
        return "You will fail your goal twice!.";
    }
}
