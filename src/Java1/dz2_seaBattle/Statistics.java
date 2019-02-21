package Java1.dz2_seaBattle;

/**
 * Created by Anton on 12.06.2018.
 */
public class Statistics {
    public static int captainOneFourDeckShipCount = 1;
    public static int captainOneThreeDeckShipCount = 2;
    public static int captainOneTwoDeckShipCount = 3;
    public static int captainOneOneDeckShipCount = 4;

    public static int captainTwoFourDeckShipCount = 1;
    public static int captainTwoThreeDeckShipCount = 2;
    public static int captainTwoTwoDeckShipCount = 3;
    public static int captainTwoOneDeckShipCount = 4;

    public static void getCaptainOneStatistic() {
        if (CaptainOneShips.fourDeckShipDeckCount == 0) {
            captainOneFourDeckShipCount--;
        }
        if (CaptainOneShips.threeDeckShip1DeckCount == 0) {
            Statistics.captainOneThreeDeckShipCount--;
        }
        if (CaptainOneShips.threeDeckShip2DeckCount == 0) {
            Statistics.captainOneThreeDeckShipCount--;
        }
        if (CaptainOneShips.twoDeckShip1DeckCount == 0) {
            Statistics.captainOneTwoDeckShipCount--;
        }
        if (CaptainOneShips.twoDeckShip2DeckCount == 0) {
            Statistics.captainOneTwoDeckShipCount--;
        }
        if (CaptainOneShips.twoDeckShip3DeckCount == 0) {
            Statistics.captainOneTwoDeckShipCount--;
        }
        if (CaptainOneShips.oneDeckShip1DeckCount == 0) {
            Statistics.captainOneOneDeckShipCount--;
        }
        if (CaptainOneShips.oneDeckShip2DeckCount == 0) {
            Statistics.captainOneOneDeckShipCount--;
        }
        if (CaptainOneShips.oneDeckShip3DeckCount == 0) {
            Statistics.captainOneOneDeckShipCount--;
        }
        if (CaptainOneShips.oneDeckShip4DeckCount == 0) {
            captainOneOneDeckShipCount--;
        }
    }

    public static void getCaptainTwoStatistic() {
        if (CaptainTwoShips.fourDeckShipDeckCount == 0) {
            Statistics.captainTwoFourDeckShipCount--;
        }
        if (CaptainTwoShips.threeDeckShip1DeckCount == 0) {
            Statistics.captainTwoThreeDeckShipCount--;
        }
        if (CaptainTwoShips.threeDeckShip2DeckCount == 0) {
            Statistics.captainTwoThreeDeckShipCount++;
        }
        if (CaptainTwoShips.twoDeckShip1DeckCount == 0) {
            Statistics.captainTwoTwoDeckShipCount--;
        }
        if (CaptainTwoShips.twoDeckShip2DeckCount == 0) {
            Statistics.captainTwoTwoDeckShipCount--;
        }
        if (CaptainTwoShips.twoDeckShip3DeckCount == 0) {
            Statistics.captainTwoTwoDeckShipCount--;
        }
        if (CaptainTwoShips.oneDeckShip1DeckCount == 0) {
            Statistics.captainTwoOneDeckShipCount--;
        }
        if (CaptainTwoShips.oneDeckShip2DeckCount == 0) {
            Statistics.captainTwoOneDeckShipCount--;
        }
        if (CaptainTwoShips.oneDeckShip3DeckCount == 0) {
            Statistics.captainTwoOneDeckShipCount--;
        }
        if (CaptainTwoShips.oneDeckShip4DeckCount == 0) {
            Statistics.captainTwoOneDeckShipCount--;
        }
    }
}
