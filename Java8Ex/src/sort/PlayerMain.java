package sort;

import java.util.*;

public class PlayerMain {
    public static void main(String[] args) {
        List<SoccerPlayer> list = new ArrayList<>();

        SoccerPlayer player1 = new SoccerPlayer(76,"메시", "공격수",30);
        SoccerPlayer player2 = new SoccerPlayer(7,"호날두", "공격수",31);
        SoccerPlayer player3 = new SoccerPlayer(22,"박지성", "미드필더",32);

        list.add(player1);
        list.add(player2);
        list.add(player3);

//        Collections.sort(list);
        Collections.sort(list, new Comparator<SoccerPlayer>(){
            @Override
            public int compare(SoccerPlayer p1, SoccerPlayer p2) {
                if(p1.getAge()>p2.getAge()) {
                    return -1;
                } else if(p1.getAge()<p2.getAge()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
