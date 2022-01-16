public class Day2 extends DayBase {

    int xPos;
    int yPos;
    int aim;

    public Day2() {
    }

    @Override
    String challenge1() {
        xPos=0;
        yPos=0;
        String[] input = parseInput(Input.day2);
        for (String movement:
                input) {
            String[] command = movement.split(" ");
            switch(command[0]){
                case "forward":
                    xPos+= Integer.parseInt(command[1]);
                    break;
                case "down":
                    yPos+= Integer.parseInt(command[1]);
                    break;
                case "up":
                    yPos-= Integer.parseInt(command[1]);
                    break;
            }
        }
        return ""+xPos*yPos;
    }

    @Override
    String challenge2() {
        xPos=0;
        yPos=0;
        aim=0;
        String[] input = parseInput(Input.day2);
        for (String movement:
                input) {
            String[] command = movement.split(" ");
            switch(command[0]){
                case "forward":
                    xPos+= Integer.parseInt(command[1]);
                    yPos+= aim * Integer.parseInt(command[1]);
                    break;
                case "down":
                    aim+= Integer.parseInt(command[1]);
                    break;
                case "up":
                    aim-= Integer.parseInt(command[1]);
                    break;
            }
        }
        return ""+xPos*yPos;
    }
}
