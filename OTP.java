import java.util.ArrayList;
import java.util.Collections;

public class OTP{
    public static String Generator(){
        int pin;
        String ans;
        ArrayList<Integer> yo = new ArrayList<Integer>();
        for(int i=0;i<=9;i++){
            yo.add(i);
        }
        Collections.shuffle(yo);
        pin = (yo.get(0) * 1000 + yo.get(1)*100 + yo.get(2)*10 + yo.get(3));
        ans = "Your OTP is: " + Integer.toString(pin)+ ". Do not share this PIN with anyone else.";
        return ans;
    }

    public static void main(String[] args){
        System.out.println(Generator());
    }
}

//try to build a login UI next