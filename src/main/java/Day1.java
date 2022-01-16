public class Day1 extends DayBase {

    String input = Input.day1;

    public Day1() {
    }


    @Override
    String challenge1() {
        int counter=0;
        int last=0;
        String[] split = input.split("\n");
        for (String line:
             split) {
            int number = Integer.parseInt(line);
            if (number>last){
                counter++;
            }
            last = number;
        }
        counter--;
        return ("counter = "+ counter);
    }

    @Override
    String challenge2() {
        String[] split = input.split("\n");
        int counter = 0;
        int lastSum = 0;
        try{
            for (int i = 0; i < split.length; i++) {
                int num1= Integer.parseInt(split[i]);
                int num2= Integer.parseInt(split[i+1]);
                int num3= Integer.parseInt(split[i+2]);
                int sum = num1+num2+num3;
                if (sum>lastSum){
                    counter++;
                }
                lastSum = sum;
            }
        } catch (ArrayIndexOutOfBoundsException e){

        }

        counter--;
        return ("counter = "+ counter);
    }
}
