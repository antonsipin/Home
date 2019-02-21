package Java1.dz2_seaBattle;

import static Java1.dz2_seaBattle.BattleField.battleFieldsPrint;

import static Java1.dz2_seaBattle.BattleField.captainOneFieldInitialize;
import static Java1.dz2_seaBattle.BattleFieldAfterDoShoots.captainsShipsStatisticInitialize;
import static Java1.dz2_seaBattle.BattleField.setCaptainOneFieldCoordinates;
import static Java1.dz2_seaBattle.CaptainOneShips.setCaptainOneFourDeckShip;
import static Java1.dz2_seaBattle.CaptainOneShips.setCaptainOneThreeDeckShip1;
import static Java1.dz2_seaBattle.CaptainOneShips.setCaptainOneThreeDeckShip2;
import static Java1.dz2_seaBattle.CaptainOneShips.setCaptainOneTwoDeckShip1;
import static Java1.dz2_seaBattle.CaptainOneShips.setCaptainOneTwoDeckShip2;
import static Java1.dz2_seaBattle.CaptainOneShips.setCaptainOneTwoDeckShip3;
import static Java1.dz2_seaBattle.CaptainOneShips.setCaptainOneOneDeckShip1;
import static Java1.dz2_seaBattle.CaptainOneShips.setCaptainOneOneDeckShip2;
import static Java1.dz2_seaBattle.CaptainOneShips.setCaptainOneOneDeckShip3;
import static Java1.dz2_seaBattle.CaptainOneShips.setCaptainOneOneDeckShip4;
import static Java1.dz2_seaBattle.CaptainOneShips.autoSetCaptainOneShips;
import static Java1.dz2_seaBattle.CaptainOne.doCaptainOneShoot;

import static Java1.dz2_seaBattle.BattleField.captainTwoFieldInitialize;
import static Java1.dz2_seaBattle.BattleField.setCaptainTwoFieldCoordinates;
import static Java1.dz2_seaBattle.CaptainTwoShips.setCaptainTwoFourDeckShip;
import static Java1.dz2_seaBattle.CaptainTwoShips.setCaptainTwoThreeDeckShip1;
import static Java1.dz2_seaBattle.CaptainTwoShips.setCaptainTwoThreeDeckShip2;
import static Java1.dz2_seaBattle.CaptainTwoShips.setCaptainTwoTwoDeckShip1;
import static Java1.dz2_seaBattle.CaptainTwoShips.setCaptainTwoTwoDeckShip2;
import static Java1.dz2_seaBattle.CaptainTwoShips.setCaptainTwoTwoDeckShip3;
import static Java1.dz2_seaBattle.CaptainTwoShips.setCaptainTwoOneDeckShip1;
import static Java1.dz2_seaBattle.CaptainTwoShips.setCaptainTwoOneDeckShip2;
import static Java1.dz2_seaBattle.CaptainTwoShips.setCaptainTwoOneDeckShip3;
import static Java1.dz2_seaBattle.CaptainTwoShips.setCaptainTwoOneDeckShip4;
import static Java1.dz2_seaBattle.CaptainTwoShips.autoSetCaptainTwoShips;
import static Java1.dz2_seaBattle.Control.*;
import static Java1.dz2_seaBattle.Control.everythingPreparePrint;
import static Java1.dz2_seaBattle.CaptainTwo.doCaptainTwoShoot;

import static Java1.dz2_seaBattle.BattleFieldAfterDoShoots.captainOneFieldAfterDoShootsInitialize;
import static Java1.dz2_seaBattle.BattleFieldAfterDoShoots.captainTwoFieldAfterDoShootsInitialize;
import static Java1.dz2_seaBattle.BattleFieldAfterDoShoots.setCaptainOneFieldAfterDoShootsCoordinates;
import static Java1.dz2_seaBattle.BattleFieldAfterDoShoots.setCaptainTwoFieldAfterDoShootsCoordinates;
import static Java1.dz2_seaBattle.BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint;

import static Java1.dz2_seaBattle.Control.getCaptainOneAnswerToShowShips;
import static Java1.dz2_seaBattle.Control.getCaptainTwoAnswerToShowShips;
import static Java1.dz2_seaBattle.BattleField.CaptainOneShipsPrint;
import static Java1.dz2_seaBattle.BattleField.CaptainTwoShipsPrint;
import static Java1.dz2_seaBattle.Control.shipSuccessfullySetPrint;
import static Java1.dz2_seaBattle.Control.getCaptainOneAnswerToSeeCaptainTwoShips;
import static Java1.dz2_seaBattle.Control.getCaptainTwoAnswerToSeeCaptainOneShips;
import static Java1.dz2_seaBattle.Statistics.getCaptainOneStatistic;
import static Java1.dz2_seaBattle.Statistics.getCaptainTwoStatistic;


/**
 * Created by Anton on 23.05.2018.
 */
public class Main {
    public static String Y = "Y";
    public static String N = "N";
    public static String y = "y";
    public static String n = "n";
    public static String CaptainOneShootCheck = "CaptainOne";
    public static String CaptainTwoShootCheck = "CaptainTwo";

    public static void main(String[] args) {
        gameStartPrint();

        setCaptainOneName();
        setCaptainTwoName();

        captainOneFieldInitialize();
        setCaptainOneFieldCoordinates();
        captainTwoFieldInitialize();
        setCaptainTwoFieldCoordinates();
        battleFieldsPrint();

        captainOneFieldAfterDoShootsInitialize();
        captainTwoFieldAfterDoShootsInitialize();
        setCaptainOneFieldAfterDoShootsCoordinates();
        setCaptainTwoFieldAfterDoShootsCoordinates();

        captainsShipsStatisticInitialize();

        do {
            getCaptainOneAnswerToSetShipsAutomatically();
            CaptainOneShipsPrint();
        }
        while (!Control.CaptainOneAnswer.equals(Y) && !Control.CaptainOneAnswer.equals(N) && !Control.CaptainOneAnswer.equals(y) && !Control.CaptainOneAnswer.equals(n));

        if (Control.CaptainOneAnswer.equals(Y) || Control.CaptainOneAnswer.equals(y)) {
            autoSetCaptainOneShips();
//            battleFieldsPrint();
            checkSetCaptainOneShips();
            do {
                getCaptainOneAnswerToShowShips();
            }
            while (!Control.CaptainOneAnswerToShowShips.equals(Y) && !Control.CaptainOneAnswerToShowShips.equals(N) && !Control.CaptainOneAnswerToShowShips.equals(y) && !Control.CaptainOneAnswerToShowShips.equals(n));
            if (Control.CaptainOneAnswerToShowShips.equals(Y) || Control.CaptainOneAnswerToShowShips.equals(y)) {
                CaptainOneShipsPrint();
            }
        } else if (Control.CaptainOneAnswer.equals(N) || Control.CaptainOneAnswer.equals(n)) {
            setCaptainOneFourDeckShip();
            setCaptainOneThreeDeckShip1();
            CaptainOneShipsPrint();
            setCaptainOneThreeDeckShip2();
            CaptainOneShipsPrint();
            setCaptainOneTwoDeckShip1();
            CaptainOneShipsPrint();
            setCaptainOneTwoDeckShip2();
            CaptainOneShipsPrint();
            setCaptainOneTwoDeckShip3();
            CaptainOneShipsPrint();
            setCaptainOneOneDeckShip1();
            CaptainOneShipsPrint();
            setCaptainOneOneDeckShip2();
            CaptainOneShipsPrint();
            setCaptainOneOneDeckShip3();
            CaptainOneShipsPrint();
            setCaptainOneOneDeckShip4();
            CaptainOneShipsPrint();
            checkSetCaptainOneShips();
        }
        do {
            getCaptainOneAnswerToHideShips();
            CaptainTwoShipsPrint();
        }
        while (!Control.CaptainOneAnswerToHideShips.equals(Y) && !Control.CaptainOneAnswerToHideShips.equals(N) && !Control.CaptainOneAnswerToHideShips.equals(y) && !Control.CaptainOneAnswerToHideShips.equals(n));
        if (Control.CaptainOneAnswerToHideShips.equals(Y) || Control.CaptainOneAnswerToHideShips.equals(y)) {
            battleFieldsAfterDoShootsPrint();
        }
        do {
            getCaptainTwoAnswerToSetShipsAutomatically();
        }
        while (!Control.CaptainTwoAnswer.equals(Y) && !Control.CaptainTwoAnswer.equals(N) && !Control.CaptainTwoAnswer.equals(y) && !Control.CaptainTwoAnswer.equals(n));
        if (Control.CaptainTwoAnswer.equals(Y) || Control.CaptainTwoAnswer.equals(y)) {
            autoSetCaptainTwoShips();
//            battleFieldsPrint();
            checkSetCaptainTwoShips();
            do {
                getCaptainTwoAnswerToShowShips();
            }
            while (!Control.CaptainTwoAnswerToShowShips.equals(Y) && !Control.CaptainTwoAnswerToShowShips.equals(N) && !Control.CaptainTwoAnswerToShowShips.equals(y) && !Control.CaptainTwoAnswerToShowShips.equals(n));
            if (Control.CaptainTwoAnswerToShowShips.equals(Y) || Control.CaptainTwoAnswerToShowShips.equals(y)) {
                CaptainTwoShipsPrint();
            }
        } else if (Control.CaptainTwoAnswer.equals(N) || Control.CaptainTwoAnswer.equals(n)) {
            setCaptainTwoFourDeckShip();
            CaptainTwoShipsPrint();
            setCaptainTwoThreeDeckShip1();
            CaptainTwoShipsPrint();
            setCaptainTwoThreeDeckShip2();
            CaptainTwoShipsPrint();
            setCaptainTwoTwoDeckShip1();
            CaptainTwoShipsPrint();
            setCaptainTwoTwoDeckShip2();
            CaptainTwoShipsPrint();
            setCaptainTwoTwoDeckShip3();
            CaptainTwoShipsPrint();
            setCaptainTwoOneDeckShip1();
            CaptainTwoShipsPrint();
            setCaptainTwoOneDeckShip2();
            CaptainTwoShipsPrint();
            setCaptainTwoOneDeckShip3();
            CaptainTwoShipsPrint();
            setCaptainTwoOneDeckShip4();
            CaptainTwoShipsPrint();
            checkSetCaptainTwoShips();
        }
        do {
            getCaptainTwoAnswerToHideShips();
        }
        while (!Control.CaptainTwoAnswerToHideShips.equals(Y) && !Control.CaptainTwoAnswerToHideShips.equals(N) && !Control.CaptainTwoAnswerToHideShips.equals(y) && !Control.CaptainTwoAnswerToHideShips.equals(n));
        if (Control.CaptainTwoAnswerToHideShips.equals(Y) || Control.CaptainTwoAnswerToHideShips.equals(y)) {
            battleFieldsAfterDoShootsPrint();
        }
        everythingPreparePrint();
        do {
            if (Control.whoNextShoot.equals(CaptainOneShootCheck)) {
                doCaptainOneShoot();
            } else if (Control.whoNextShoot.equals(CaptainTwoShootCheck)) {
                doCaptainTwoShoot();
            }
        } while (captainOneShipAfterDoShootCount < 20 && captainTwoShipAfterDoShootCount < 20);
        if (captainOneShipAfterDoShootCount == 20) {
            gameOverPrint();
            System.out.println(ANSI_RED + "\t\t\t\t\t     ⛵⛵⛵ " + CaptainTwoName + " WIN !!! ⛵⛵⛵" + ANSI_RESET);
            System.out.println();
            BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint();
            do {
                getCaptainOneAnswerToSeeCaptainTwoShips();
            }
            while (!Control.CaptainTwoAnswerToHideShips.equals(Y) && !Control.CaptainTwoAnswerToHideShips.equals(N) && !Control.CaptainTwoAnswerToHideShips.equals(y) && !Control.CaptainTwoAnswerToHideShips.equals(n));
            if (Control.CaptainTwoAnswerToHideShips.equals(Y) || Control.CaptainTwoAnswerToHideShips.equals(y)) {
                CaptainTwoShipsPrint();
            }
        } else if (captainTwoShipAfterDoShootCount == 20) {
            gameOverPrint();
            System.out.println(ANSI_RED + "\t\t\t\t\t     ⛵⛵⛵ " + CaptainOneName + " WIN !!! ⛵⛵⛵" + ANSI_RESET);
            System.out.println();
            BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint();
            do {
                getCaptainTwoAnswerToSeeCaptainOneShips();
            }
            while (!Control.CaptainTwoAnswerToHideShips.equals(Y) && !Control.CaptainTwoAnswerToHideShips.equals(N) && !Control.CaptainTwoAnswerToHideShips.equals(y) && !Control.CaptainTwoAnswerToHideShips.equals(n));
            if (Control.CaptainTwoAnswerToHideShips.equals(Y) || Control.CaptainTwoAnswerToHideShips.equals(y)) {
                CaptainOneShipsPrint();
            }
        }
    }
}
