package ie.tudublin;

import processing.core.PApplet;

public class LifeBoard {

   boolean[][] board;
   private int size;
   PApplet p;

   float cellWidth;

   public LifeBoard(int size, PApplet p)
   {
    this.size = size;
    board = new boolean[size][size];
   }

   public void randomise()
   {
        for(int row = 0 ; row < size; row++)
        {
            for (int col = 0 ; col < size ; col ++)
            {
                float dice  = p.random(0, 1);
                board[row][col] = (dice <= 0.5f);
            }
        }

   }

   public void render ()
   {
        
        for(int row = 0 ; row < size; row++)
            {
                for (int col = 0 ; col < size ; col ++)
                {
                    float dice  = p.random(0, 1);
                    board[row][col] = (dice <= 0.5f);
                }
            }
    }




public int getSize() {
    return size;
}

public void setSize(int size) {
    this.size = size;
}

}
