package hw;

import java.util.Scanner;

class Player {
    String name; // 참가자의 이름
    String word; // 단어
 
    public Player(String name) {
        this.name = name;
    }
    
    public void sayWord(String word) {
        this.word = word;
    }
   
    public Boolean succeed(String lastWord) {
        int lastIndex = lastWord.length() - 1;
        char lastChar = lastWord.charAt(lastIndex);
        char firstChar = word.charAt(0);
        if(firstChar == lastChar)
            return true;
        else
            return false;
    }
}

public class WordGameApp {
        public static void main(String[] args) {
        int playerNum;
        String lastWord = "아버지";
        Scanner sc = new Scanner(System.in);
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        playerNum = sc.nextInt();
        Player[] players = new Player[playerNum];
        
        for(int i=0;i<playerNum;i++) {
            System.out.print("참가자의 이름을 입력하세요>>");
            String name = sc.next();
            players[i] = new Player(name);
        }
        
        System.out.println("시작하는 단어는 아버지입니다.");
        while(true) {
            for(int i=0;i<playerNum;i++) {
                System.out.println(playerNum+">> ");
                lastWord = sc.next();
                succeed(lastWord);
            }
        }        
    } 
}
 