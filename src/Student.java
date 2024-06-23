public class Student implements Learner{
    @Override
    public void learn(){
        System.out.println("Я учусь. .zZ");
        // в решении задачи не участвует, просто была указана в теории 4.1
        //IntStream.range(0, 1000000).forEach(i -> Math.log(i));
        System.out.println("Я закончил учиться");
    }
}
