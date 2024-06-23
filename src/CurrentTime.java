import java.sql.Time;
import java.util.Date;

public class CurrentTime implements Learner{
    private Learner learner;
    public CurrentTime() {
        this.learner = learner;
    }
    @Override
    public void learn(){
        Date timeFormat = new Time(System.currentTimeMillis());
        System.out.println("Текущее время: " + timeFormat);
    }
}
