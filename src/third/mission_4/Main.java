package third.mission_4;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<String>> playerList = new ArrayList<>();
        for(int i = 0 ; i< 2 ; i++){
            playerList.add(new ArrayList<>());
        }
        int count = 0;

        String playerNumber = "";
        String playerRecord = "";

        while(true){
            System.out.println("선수의 번호를 입력하세요.");
            playerNumber= sc.next();

            if(playerNumber.equals("print")) {
                List<Double> doublePlayerRecord = new ArrayList<>();
                for (int i = 0 ; i<playerList.get(1).size() ; i++){
                    doublePlayerRecord.add(Double.parseDouble(playerList.get(1).get(i)));
                }
                Collections.sort(doublePlayerRecord);
                double winnerRecord = doublePlayerRecord.get(0);
                int winnerIndex = playerList.get(1).indexOf(String.format("%.2f",winnerRecord));

                System.out.println("1등 : " + playerList.get(0).get(winnerIndex) + "번 선수 / " + playerList.get(1).get(winnerIndex) + "초 (참가인원 : " + playerList.get(0).size() + "명)");
                break;
            } else if (!(playerList.get(0).contains(playerNumber))) {
                System.out.println("이 선수의 100m 달리기 기록이 몇 초인지 입력하세요. elif");
                playerRecord= sc.next();
                playerList.get(0).add(playerNumber);
                playerList.get(1).add(String.format("%.2f",Double.parseDouble(playerRecord)));
            } else {
                System.out.println("이 선수의 100m 달리기 기록이 몇 초인지 입력하세요. else");
                playerRecord= sc.next();
                int playerIndex = playerList.get(0).indexOf(playerNumber);

                double beforePlayerRecord = Double.parseDouble(playerList.get(1).get(playerIndex));

                if(Double.parseDouble(playerRecord)<beforePlayerRecord){
                    playerList.get(1).set(playerIndex, String.format("%.2f",Double.parseDouble(playerRecord)));
                }
            }
        }
    }
}
