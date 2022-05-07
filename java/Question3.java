public class Question3 {
    public  String clock(String Sequence) {
        int MIN = 0, HOURS = 0, DAYS = 1, MONTH = 1, YEARS = 2000;
        String Big_State= "Display";
        String Small_State1 ="Time";
        String Small_State2 ="Alarm";
        String Small_State3 ="min";

        for (int i = 0; i < Sequence.length() ; i++) {
            switch (Big_State) {
                case "Display": {
                    if (Sequence.charAt(i) == 'c')
                        Big_State = "update";

                    else if (Sequence.charAt(i) == 'a')
                        if (Small_State1.equals("Time"))
                            Small_State1 = "date";
                        else
                            Small_State1 = "Time";

                    else if (Sequence.charAt(i) == 'b')
                        Big_State = "alarm";



                    else return "invalid-input";

                    break;
                }
                case "update": {
                    if (Sequence.charAt(i) == 'a') {
                        switch (Small_State3) {
                            case "min" -> {
                                Small_State3 = "hour";
                                break;
                            }
                            case "hour" -> {
                                Small_State3 = "day";
                                break;
                            }
                            case "day" -> {
                                Small_State3 = "month";
                                break;
                            }
                            case "month" -> {
                                Small_State3 = "year";
                                break;
                            }
                            case "year" -> {
                                Big_State = "Display";
                                Small_State3="min";
                                break;
                            }
                        }
                    }

                    else if (Sequence.charAt(i) == 'b') {
                        if (Small_State3.equals("min"))
                            MIN++;
                        if(MIN==60)
                            MIN=0;

                        else if (Small_State3.equals("hour"))
                            HOURS++;
                        if(HOURS==24)
                            HOURS=0;

                        else if (Small_State3.equals("day"))
                            DAYS++;
                        if(DAYS==31)
                            DAYS=1;

                        else if (Small_State3.equals("month"))
                            MONTH++;
                        if (MONTH==12)
                            MONTH=1;

                        else if (Small_State3.equals("year"))
                            YEARS++;
                        if(YEARS==2100)
                            YEARS=2000;

                    }
                    else if (Sequence.charAt(i)== 'd')
                        Big_State = "Display";

                    else return"invalid-input";
                    break;
                }
                case "alarm": {
                    if (Sequence.charAt(i) == 'a')
                        if (Small_State2.equals("Alarm"))
                            Small_State2 = "chime";
                        else
                            return "invalid-input";
                    else if (Sequence.charAt(i) == 'd')
                            Big_State = "Display";
                    else return "invalid-input";
                    break;
                }

            }

        }
        return "State: "+Big_State+" Date:"+DAYS+"/"+MONTH+"/"+YEARS+" Time: "+HOURS+":"+MIN;

    }
}