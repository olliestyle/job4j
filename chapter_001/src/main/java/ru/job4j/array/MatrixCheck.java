package ru.job4j.array;

/**
 * Класс для работы с двумерным массивом
 */
public class MatrixCheck {
    /**
     * Метод выявления все ли элементы в указанной строке содержат значение "X"
     * @param board
     * @param row
     * @return
     */
    public static boolean monoHorizontal(char[][] board, int row) {

        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод выявления все ли элементы в указанном столбце содержат значение "X"
     * @param board
     * @param column
     * @return
     */
    public static boolean monoVertical(char[][] board, int column) {

        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод для выборки значений, содержащихся в двумерном массиве по диагонали
     * @param board
     * @return
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0, j = 0; i < board.length; i++, j++) {
            rsl[i] = board[i][j];
        }
        return rsl;
    }

    /**
     * Метод для определения, является ли положение элементов в двумерном массиве выигрышным
     * по правилам игры "Сокобан"
     * @param board
     * @return
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0, j = 0; i < board.length; i++, j++) {
            if (board[i][j] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, j)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
