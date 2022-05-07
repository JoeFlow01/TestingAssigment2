public class Max_Min {
    public double max(double numbers[]){
        double max=numbers[0];
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]>max)
                max=numbers[i];
        }
        return max;
    }
    public double min(double numbers[]){
        double min=numbers[0];
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]<min)
                min=numbers[i];
        }
        return min;
    }
}
