// 6510450844 Puri Limwongrujirat
public class Main {
    public static void main(String[] args) {
        Board monopoly40squares = new Board(40);

        Piece piece1 = new Piece();
        Piece piece2 = new Piece();

        Player player1 = new Player("Mr.Puri", piece1);
        Player player2 = new Player("Aj.Usa", piece2);

        Player[] players =  {player1, player2};
        MGame game = new MGame(players, monopoly40squares);

        game.playGame(5);
    }
}
