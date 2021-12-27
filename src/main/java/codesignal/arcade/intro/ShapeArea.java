package codesignal.arcade.intro;

public class ShapeArea {
    int solution(int n) {
        int num = 1;
        for(int i = 1; i <= n; i++){
            num = num + (4 * (i-1));
        }
        return num;
    }
}
