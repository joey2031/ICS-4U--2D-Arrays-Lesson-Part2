package pkg2darrays.part2;

import java.util.ArrayList;

public class Part2 {

    public static void main(String[] args) {
        int[][] card = new int[5][5];
        int[][] box = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] box2 = {{1, 2, 3}, {4, 5}, {7, 8, 9}};

        display(card);
        System.out.println("______________________");
        display(box);
        System.out.println("______________________");
        display(box2);

        System.out.println("______________________");
        System.out.println("______________________");
        System.out.println(calcTotal(card));

ArrayList <Integer> B = new ArrayList <Integer>();
ArrayList <Integer> I = new ArrayList <Integer>(); // ARRAYLIST
for (int i = 16; i <=30; i++){
I.add(i);
}
display (I);

B.add (1); 
B.add (2);
B.add (3);
display (B);
B.add (1); // Adds elements to arrayList
display (B); // diaplay the "B" ArrayList, wrote the diaplay methond on my own at the bottom.
B.remove (1); // Takes away the element at the given index value

display (B);
B.remove (1);

display (B);

// traverse- to go through
    }

    public static void display(int[][] grid) {
        for (int i = 0; i < grid.length; i++) { // tranverse rows
            for (int j = 0; j < grid[i].length; j++) { // tranverse coloumns
                System.out.print(grid[i][j] + " ");

            }
            System.out.println("");
        }
    }

    

    
        public static int calcTotal(int[][] grid) {
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                total = total + grid[i][j];
            }
        }
        return total;

    }


        public static void display (ArrayList<Integer> list){
           for (int i = 0; i < list.size(); i++){
               System.out.print (list.get(i) + " ");

           } 
            System.out.println("");
            
            
            
        }
      
}



