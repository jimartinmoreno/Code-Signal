package codesignal.interview.hashTables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://app.codesignal.com/interview-practice/task/xrFgR63cw7Nch4vXo/description
 */
class GroupingDishesTest {

    @Test
    void solution() {
        assertArrayEquals(new String[][]{
                        {"Cheese", "Quesadilla", "Sandwich"},
                        {"Salad", "Salad", "Sandwich"},
                        {"Sauce", "Pizza", "Quesadilla", "Salad"},
                        {"Tomato", "Pizza", "Salad", "Sandwich"}},
                GroupingDishes.solution(new String[][]{{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                        {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
                        {"Quesadilla", "Chicken", "Cheese", "Sauce"},
                        {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}}));
    }
}