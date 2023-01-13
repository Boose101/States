import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class States {
    public static void main(String[] args) {
        ArrayList<State> states = new ArrayList<State>();
        states.add(new State("Alabama", "AL", 4949697, 30));
        states.add(new State("Alaska", "AK", 720763, 1));
        states.add(new State("Arizona", "AZ", 7640796, 6));
        states.add(new State("Arkansas", "AR", 3042017, 29));
        states.add(new State("California", "CA", 39664128, 3));
        states.add(new State("Colorado", "CO", 5961083, 8));
        states.add(new State("Connecticut", "CT", 3546588, 48));
        states.add(new State("Delaware", "DE", 998619, 49));
        states.add(new State("Florida", "FL", 22177997, 22));
        states.add(new State("Georgia", "GA", 10936299, 24));
        states.add(new State("Hawaii", "HI", 1401709, 43));
        states.add(new State("Idaho", "ID", 1896652, 14));
        states.add(new State("Illinois", "IL", 12518071, 25));
        states.add(new State("Indiana", "IN", 6842385, 38));
        states.add(new State("Iowa", "IA", 3174426, 26));
        states.add(new State("Kansas", "KS", 2919179, 15));
        states.add(new State("Kentucky", "KY", 4487233, 37));
        states.add(new State("Louisiana", "LA", 4616106, 31));
        states.add(new State("Maine", "ME", 1359677, 39));
        states.add(new State("Maryland", "MD", 6075314, 42));
        states.add(new State("Massachusetts", "MA", 6922107, 44));
        states.add(new State("Michigan", "MI", 9995212, 11));
        states.add(new State("Minnesota", "MN", 5739781, 12));
        states.add(new State("Mississippi", "MS", 2961536, 32));
        states.add(new State("Missouri", "MO", 6184843, 21));
        states.add(new State("Montana", "MT", 1093117, 4));
        states.add(new State("Nebraska", "NE", 1960790, 16));
        states.add(new State("Nevada", "NV", 3238601, 7));
        states.add(new State("New Hampshire", "NH", 1378449, 46));
        states.add(new State("New Jersey", "NJ", 8870685, 47));
        states.add(new State("New Mexico", "NM", 2109093, 5));
        states.add(new State("New York", "NY", 19223191, 27));
        states.add(new State("North Carolina", "NC", 10807491, 28));
        states.add(new State("North Dakota", "ND", 774008, 19));
        states.add(new State("Ohio", "OH", 11727377, 34));
        states.add(new State("Oklahoma", "OK", 4007179, 20));
        states.add(new State("Oregon", "OR", 4325290, 9));
        states.add(new State("Pennsylvania", "PA", 12805190, 33));
        states.add(new State("Rhode Island", "RI", 1062583, 50));
        states.add(new State("South Carolina", "SC", 5342388, 40));
        states.add(new State("South Dakota", "SD", 902542, 17));
        states.add(new State("Tennessee", "TN", 7001803, 36));
        states.add(new State("Texas", "TX", 30097526, 2));
        states.add(new State("Utah", "UT", 3363182, 13));
        states.add(new State("Vermont", "VT", 622882, 45));
        states.add(new State("Virginia", "VA", 8638218, 35));
        states.add(new State("Washington", "WA", 7887965, 18));
        states.add(new State("West Virginia", "WV", 1755715, 41));
        states.add(new State("Wisconsin", "WI", 5867518, 23));
        states.add(new State("Wyoming", "WY", 582233, 10));

        Random rand  = new Random();
        Scanner scan = new Scanner(System.in);
        
        int score = 0;

        String[] questions = {"Which of the following states has an abbreviation of ", "Of the following 4 states, which has the largest population?", "Of the following 4 states, which has the smallest population?", "Of the following 4 states, which state is the largest in land size?", "Of the following 4 states, which state is the smallest in land size?"};
        
        HashMap<String, Integer> letToNum = new HashMap<String, Integer>();

        letToNum.put("A", 1);
        letToNum.put("B", 2);
        letToNum.put("C", 3);
        letToNum.put("D", 4);

        String[] pos = {"first", "second", "third", "fourth", "fifth"};

        System.out.println("Welcome to our States Game!" + '\n' + "You will be given 5 mutliple choice questions about the states." + '\n' + "Chose a letter and get a point!");

        int qNum = 5;

        for(int x = 1; x <= qNum; x++) {
            System.out.println(x);
            int loc = 1;
            ArrayList<Integer> opp = new ArrayList<Integer>();
            int ans = 0;
            

            if(x == 1){
                ans = rand.nextInt(49);
                loc = rand.nextInt(4)+1;
                
                System.out.println(x + ". " + questions[x-1] + states.get(ans).getAbv() + "?"); 
                opp.add(ans);
                for(int z = 1; z < 5; z++) {  
                    int option = rand.nextInt(49);
                    while(opp.contains(option)){
                        option = rand.nextInt(49);
                    }
                    opp.add(option);
                    if(z != loc){
                        System.out.println(numToLet(z) + ". " + states.get(option).getName());
                    }else{
                        System.out.println(numToLet(z) + ". " + states.get(ans).getName());
                    }
                }
            }   else if(x == 2){
                    System.out.println(x + ". " + questions[x-1]);
                    int op1 = rand.nextInt(49);
                    int op2 = rand.nextInt(49);
                    int op3 = rand.nextInt(49);
                    int op4 = rand.nextInt(49);

                    opp.add(op1);
                    while(opp.contains(op2)){
                        op2 = rand.nextInt(49);
                    }
                    opp.add(op2);
                    while(opp.contains(op3)){
                        op3 = rand.nextInt(49);
                    }
                    opp.add(op3);
                    while(opp.contains(op4)){
                        op4 = rand.nextInt(49);
                    }
                    opp.add(op4);
                    
                    int largest = 0;
                    int count = 1;
                    for(int i : opp) {
                        if(largest < states.get(i).getPop()){
                            largest = i;
                            loc = count;
                        }
                        count++;
                    }
                    count = 1;
                    for(int i : opp){
                        System.out.println(numToLet(count) + ". " + states.get(i).getName());
                        count++;
                    }
                
            } else if(x == 3){
                System.out.println(x + ". " + questions[x-1]);
                    int op1 = rand.nextInt(49);
                    int op2 = rand.nextInt(49);
                    int op3 = rand.nextInt(49);
                    int op4 = rand.nextInt(49);

                    opp.add(op1);
                    while(opp.contains(op2)){
                        op2 = rand.nextInt(49);
                    }
                    opp.add(op2);
                    while(opp.contains(op3)){
                        op3 = rand.nextInt(49);
                    }
                    opp.add(op3);
                    while(opp.contains(op4)){
                        op4 = rand.nextInt(49);
                    }
                    opp.add(op4);
                    
                    int smallest = 0;
                    int count = 1;
                    for(int i : opp) {
                        if(smallest > states.get(i).getPop()){
                            smallest = i;
                            loc = count;
                        }
                        count++;
                    }
                    count = 1;
                    for(int i : opp){
                        System.out.println(numToLet(count) + ". " + states.get(i).getName());
                        count++;
                    }
                
            } else if(x == 4){
                System.out.println(x + ". " + questions[x-1]);
                    int op1 = rand.nextInt(49);
                    int op2 = rand.nextInt(49);
                    int op3 = rand.nextInt(49);
                    int op4 = rand.nextInt(49);

                    opp.add(op1);
                    while(opp.contains(op2)){
                        op2 = rand.nextInt(49);
                    }
                    opp.add(op2);
                    while(opp.contains(op3)){
                        op3 = rand.nextInt(49);
                    }
                    opp.add(op3);
                    while(opp.contains(op4)){
                        op4 = rand.nextInt(49);
                    }
                    opp.add(op4);
                    
                    int largest = 0;
                    int count = 1;
                    for(int i : opp) {
                        if(largest < states.get(i).getTot()){
                            largest = i;
                            loc = count;
                        }
                        count++;
                    }
                    count = 1;
                    for(int i : opp){
                        System.out.println(numToLet(count) + ". " + states.get(i).getName());
                        count++;
                    }
            }else if(x == 5){
                System.out.println(x + ". " + questions[x-1]);
                    int op1 = rand.nextInt(49);
                    int op2 = rand.nextInt(49);
                    int op3 = rand.nextInt(49);
                    int op4 = rand.nextInt(49);

                    opp.add(op1);
                    while(opp.contains(op2)){
                        op2 = rand.nextInt(49);
                    }
                    opp.add(op2);
                    while(opp.contains(op3)){
                        op3 = rand.nextInt(49);
                    }
                    opp.add(op3);
                    while(opp.contains(op4)){
                        op4 = rand.nextInt(49);
                    }
                    opp.add(op4);
                    
                    int smallest = 0;
                    int count = 1;
                    for(int i : opp) {
                        if(smallest > states.get(i).getTot()){
                            smallest = i;
                            loc = count;
                        }
                        count++;
                    }
                    count = 1;
                    for(int i : opp){
                        System.out.println(numToLet(count) + ". " + states.get(i).getName());
                        count++;
                    }
            }
            
                
            

            
            String uAns = scan.nextLine();
            uAns = uAns.toUpperCase();
            if(letToNum.get(uAns) == loc){
                System.out.println("Yes! You got the " + pos[x-1] + " answer correct!");
                score++;
            }else{
                System.out.println("Sorry the correct answer was " + numToLet(loc) + ".");
            }
            
        }

        System.out.println("Thank you for playing!");
        System.out.println("Score was: " + score);


        

    }
    private static String numToLet(int i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
    }
}
class State{
    private String name;
    private String abv;
    private int population;
    private int totLand;

    public State(String n, String av, int pop, int tot){
        name = n;
        abv = av;
        population = pop;
        totLand = tot;
    }

    public String getName(){
        return name;
    }

    public String getAbv(){
        return abv;
    }

    public int getPop(){
        return population;
    }
    public int getTot(){
        return totLand;
    }

}
