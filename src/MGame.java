// 6510450844 Puri Limwongrujirat
public class MGame {
    private int roundCnt;
    private Board board;
    private Player[] players;
    private Die[] dice;

    public MGame(Player[] players, Board board) {
        this.roundCnt = 0;
        this.board = board;

        this.dice = new Die[2];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
        }

        this.players = players;
        for (Player player : players) {
            player.getPiece().setLocation(board.getSquare(0));
            player.setDice(dice);
        }

    }

    public void playGame(int N) {
        while (roundCnt < N) {
            playRound();
            roundCnt++;
        }
    }

    private void playRound() {
        for (Player player : players) {
            player.takeTurn(board);
        }

        System.out.println("จบรอบที่" + (roundCnt + 1) + "!!");
    }
}
