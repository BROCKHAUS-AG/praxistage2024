package de.brockhausag;

import java.util.Arrays;

public class TicTacToeGame implements TicTacToeLogic{
    private final FieldState[] fieldStates = new FieldState[9];
    private FieldState lastPlayer = FieldState.O;

    public TicTacToeGame() {
        Arrays.fill(fieldStates, FieldState.NONE);
    }

    public void makeMove(int index) {
        if (fieldStates[index] != FieldState.NONE) {
            throw new IllegalArgumentException("Feld ist bereits belegt!");
        }
        //TODO Implementiere den Zug
    }

    public FieldState getWinner() {
        FieldState winner;

        // Check rows
        //TODO: Implementierung der Überprüfung der Zeilen

        // Check columns
        //TODO: Implementierung der Überprüfung der Spalten


        // Check diagonals
        //TODO: Implementierung der Überprüfung der Diagonalen



        // Check for tie
        for (FieldState state : fieldStates) {
            if (state == FieldState.NONE) {
                return null; // Game is not over
            }
        }
        return FieldState.NONE; // Tie
    }

    private FieldState checkThreeStates(FieldState state1, FieldState state2, FieldState state3) {
        if (areThreeStatesEqual(state1, state2, state3)) {
            return state1 == FieldState.X ? FieldState.X : FieldState.O;
        }
        return null;
    }

    public void resetGame() {
        //TODO Implementierung des Game resets
    }

    public FieldState[] getFieldStates() {
        return fieldStates;
    }

    public FieldState getLastPlayer() {
        return lastPlayer;
    }

    private boolean areThreeStatesEqual(FieldState state1, FieldState state2, FieldState state3) {
        return state1 != FieldState.NONE && state1 == state2 && state1 == state3;
    }
}