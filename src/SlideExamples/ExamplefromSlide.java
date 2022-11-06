package SlideExamples;

public class ExamplefromSlide {
    private int currentSpeed;

    public void accelerate( int newSpeed) {
        currentSpeed = newSpeed < 220 ? newSpeed: 220;

        String info;
        info = "Current Speed: " + currentSpeed;
        if(currentSpeed == 220)
        {
            info += " - maximum reached";
        }
        System.out.println(info);


    }

}
