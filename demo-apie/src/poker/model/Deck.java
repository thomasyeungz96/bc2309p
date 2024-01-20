package poker.model;

public class Deck {

  private Card[] cards;

  private Deck(boolean withJoker) {
    int size = withJoker ? 54 : 52;
    cards = new Card[size];
    int i = 0;
    for (Rank rank : Rank.values()) {
      if (rank != Rank.JOKER_1 && rank != Rank.JOKER_2) {
        for (Suit suit : Suit.values()) {
          cards[i++] = new Card(rank, suit);
        }
      }
    }
    if (withJoker) {
      cards[i++] = new Card(Rank.JOKER_1, null);
      cards[i++] = new Card(Rank.JOKER_2, null);
    }
  }

  private static Deck of(boolean withJoker) {
    return new Deck(withJoker);
  }

  public static Deck withJoker() {
    return of(true);
  }

  public static Deck withoutJoker() {
    return of(false);
  }

}
