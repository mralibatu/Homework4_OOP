import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int n = 5;      //Size of game
        int[][] map = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        PutQueen(map);

    }

    public static void PutQueen(int[][] map){
        Random rnd = new Random();
        int rndNum = rnd.nextInt(map.length);
        map[rndNum][0] = 1;
        PrintMap(map);
        ReservePlaces(rndNum,0,map);
        System.out.println();
        PrintMap(map);

        for (int column = 1; column < map.length; column++){
            int tempRow = CheckFreeSpace(column,map);
            map[tempRow][column] = 1;
            ReservePlaces(tempRow,column,map);
            PrintMap(map);
        }
    }

    public static int CheckFreeSpace(int column, int[][] map){
        for (int i = 0; i < map.length; i++) {
            if(map[i][column] == 0){
                return i;
            }
        }
        return -1;
    }
    public static void PrintMap(int[][] map){
        for(int[] row : map){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    public static void ReservePlaces(int row, int column, int[][] map){
        for (int i = 0; i < map.length ; i++) {        //Fill the column
            map[i][column] = -1;
            map[row][i] = -1;
        }
        int j = 0;
        for (int i = row; i >= 0 && column + j < map.length; i--,j++) {
            map[i][column + j] = -1;
        }

        for (int i = 0; row + i < map.length && column + i < map.length; i++) {
            map[row + i][column + i] = -1;
        }


        map[row][column] = 1;
    }



}
