package chapter.six;

import java.util.Vector;

/**
 * Created by JeongHeon on 2016. 4. 10..
 */
public class HasWord {
    private static char[][] maps = {{'U', 'R', 'L', 'P', 'M'},
            {'X', 'P', 'R', 'E', 'T'},
            {'G', 'I', 'A', 'E', 'T'},
            {'X', 'T', 'N', 'Z', 'Y'},
            {'X', 'O', 'Q', 'R', 'S'}};

    private static final int dx[] = {-1, -1, -1, 1, 1, 1, 0, 0};
    private static final int dy[] = {-1, 0, 1, -1, 0, 1, -1, 1};
    public static void main(String[] args) {
        System.out.println(hasWord(2, 0, "GIRL"));

    }

    public static boolean hasWord(int x, int y, String word){
        if(!inRange(x, y)) return false;
        if(maps[x][y] != word.charAt(0)) return false;
        if(word.length() == 1) return true;

        for(int direction = 0; direction < 8; direction++){
            int nextX = x + dx[direction], nextY = y + dy[direction];
            if(hasWord(nextX, nextY, word.substring(1))) return true;
        }
        return false;
    }
    public static boolean inRange(int x, int y){
        return x>=0 && x<5 && y>=0 && y<5;
    }


}
