package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String racingcarInputView() {
        String inputName=Console.readLine();
        int moveCount=Integer.parseInt(Console.readLine());
        return inputName;
    }
}
