public class Crossword {
    private Square[][] puzzle;

    public Crossword(boolean[][] s)
    {
        this.puzzle=new Square[s.length][s[0].length];
        int n =1;
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length;j++){
                if(!s[i][j] && toBeLabeled(i, j, s)){
                    puzzle[i][j]=new Square(s[i][j],n++);
                }
                else{
                    puzzle[i][j]=new Square(s[i][j],0);
                }
            }
        }
        //PLEASE WORK
    }

    private boolean toBeLabeled(int i, int j, boolean[][] square) {

        return (i == 0 || square[i - 1][j]) || (j == 0 || square[i][j - 1]); //lable if its the first square in row or collum && the squar above to to the left is black!
    }

    public Square[][] getPuzzle()
    {
        return puzzle;
    }
}
