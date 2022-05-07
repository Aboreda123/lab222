public class states {
    String state="NORMAL";
    String state1="TIME";
    int m=0,h=0,d=1,M=1,y=2000;
    public void statee(char input){
        switch (state){
            case "NORMAL":
                if (input == 'a') {
                    if (state1.equals("TIME"))
                    {
                        state1 = "DATE";
                        break;
                    }
                    else
                        state1 = "TIME";
                    break;
                }
                if (input == 'b') {
                    state="ALARM";
                    state1="Alarm";
                    break;
                }
                if (input == 'c') {
              state="UPDATE";
               state1="min";
                break;
                }
                break;
            case "ALARM":
                   if(input =='a'){
                    if(state1.equals("Alarm"))
                    {
                        state ="ALARM";
                        state1="CHIME";
                        break;
                    }
                }
                if(input=='d')
                {
               state="NORMAL";
               state1="TIME";
               break;
                }

               break;
            case"UPDATE":
                if(input=='d'){
                    state="NORMAL";
                    state1="TIME";
                }
                if(input =='a')
                {
                    if(state1.equals("min")){
                        state1="hour";
                        break;
                    }
                    if(state1.equals("hour")){
                        state1="day";
                        break;
                    }
                    if(state1.equals("day")){
                        state1="month";
                        break;
                    }
                    if(state1.equals("month")){
                        state1="year";
                        break;
                    }
                    if(state1.equals("year")){
                        state="NORMAL";
                        state1="TIME";
                        break;
                    }

                }
                if(input =='b')
                {
                    if(state1.equals("min")){
                        m++;
                        if(m>60){
                            m=0;
                        }
                    }
                    if(state1.equals("hour")){
                        h++;
                        if(h>24){
                            h=0;
                        }
                    }
                    if(state1.equals("day")){
                        d++;
                        if(d>31){
                            d=1;
                        }
                    }
                    if(state1.equals("month")){
                        M++;
                        if(M>12){
                            M=1;
                        }
                    }
                    if(state1.equals("year")){
                        y++;
                        if(y>2100){
                            y=2000;
                        }
                    }
                }
break;


        }


    }
    public String getState(){
        return(state+","+state1);
    }
    public String getDate(){
        return (y+"-"+M+"-"+d);
    }
    public String getTime(){
        return (h+":"+m);
    }



}
