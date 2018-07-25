package rockpapersiccors;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;
import tuesday.Scores;
import tuesday.TuesdayTdd;

public class RockPaperSiccorTest {

  private TuesdayTdd tuesday;

  @Before
  public void setUp() {
    tuesday = new TuesdayTdd();
  }

//  @Test
//  public void player1ShouldWinIfHeHasMorePoints(){
//    String res = tuesday.rpsGameWithScores();
//
//    int player1 = Integer.parseInt(res.substring(16, 17).trim());
//    int player2 = Integer.parseInt(res.substring(35,37).trim());
//    int draws = Integer.parseInt(res.substring(44, 46).trim());
//    System.out.println("Player1: " + player1 + "\nPlayers2: " + player2 + "\n\n..and " + draws + " draws");
//
//    if(player1 < player2){
//      fail();
//    }
//  }

  @Test
  public void rockShouldBeatScissors(){
    String player1 = "Rock";
    String player2 = "Scissors";
    assertEquals(Scores.PlAY1_WIN, tuesday.whoWin(player1, player2));
  }

  @Test
  public void rockAndRockShouldCreateDraw(){
    String player1 = "Rock";
    String player2 = "Rock";
    assertEquals(Scores.DRAW, tuesday.whoWin(player1, player2));
  }

  @Test
  public void rockShouldLooseToPaper(){
    String player1 = "Rock";
    String player2 = "Paper";
    assertEquals(Scores.PlAY1_LOSE, tuesday.whoWin(player1, player2));
  }

  @Test
  public void scissorsShouldBeatPaper(){
    String player1="Paper";
    String player2="Scissors";
    assertEquals(Scores.PlAY1_LOSE, tuesday.whoWin(player1, player2));
  }

  @Test
  public void scissorsShouldLooseToRock(){
    String player1 = "Scissors";
    String player2 = "Rock";
    assertEquals(Scores.PlAY1_LOSE, tuesday.whoWin(player1, player2));
  }








}
