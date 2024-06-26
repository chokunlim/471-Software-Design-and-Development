// 6510450844 Puri Limwongrujirat
public class Player {
    private String name;
    private Piece piece;
    private Die[] dice;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    public void setDice(Die[] dice) {
        this.dice = dice;
    }

    public void takeTurn(Board board) {
        int fvTot = 0;
        for (Die d : dice) {
            d.roll();
            fvTot += d.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc.getName(), fvTot);
        piece.setLocation(newLoc);

        System.out.println(name + " ทอยได้ " + fvTot + " เดินไปที่ square[" + newLoc.getName() +"]");
    }

    public Piece getPiece() {
        return piece;
    }
}
