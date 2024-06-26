// 6510450844 Puri Limwongrujirat
public class Board {
    private Square[] squares;

    public Board(int N) {
        squares = new Square[N];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square();
            squares[i].setName(i);
        }
    }

    public Square getSquare(int index) {
        return squares[index];
    }

    public Square getSquare(int oldLoc, int fvTot) {
        return squares[(oldLoc + fvTot) % squares.length];
    }

}

