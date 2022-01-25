package klarna;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

class NoTreesException extends Exception {
    public NoTreesException(String message) {
        super(message);
    }
}

class Tree {
    float x;
    float y;

    public Tree(float x, float y) {
        this.x = x;
        this.y = y;
    }
}

public class Camera {
    public static double bestAngle(double alpha, List<Tree> trees) throws NoTreesException {
        if (trees.isEmpty()) throw new NoTreesException("There must be at least one tree");

        List<Double> sortedAngles = trees.stream().map(Camera::getTreeAngle)
                .sorted(Comparator.comparingDouble(Double::doubleValue))
                .distinct()
                .toList();

        long numberOfTrees = 0;
        long max = 0;
        double outputAngle = 0.0;
        for (Double initialAngle : sortedAngles) {

            numberOfTrees = sortedAngles.stream()
                    .dropWhile(angle -> angle < initialAngle)
                    .takeWhile(angle -> angle <= initialAngle + alpha)
                    //.distinct()
                    .count();

            if (numberOfTrees > max) {
                max = numberOfTrees;
                outputAngle = initialAngle;
            }
        }
        return outputAngle;
    }

    public static double getTreeAngle(Tree tree) {
        return Math.toDegrees(Math.atan2(tree.y, tree.x));
    }

    public static double bestAngleSinEdgeCases(double alpha, List<Tree> trees) throws NoTreesException {
        if (trees.isEmpty()) throw new NoTreesException("There must be at least one tree");

        int numberOfTrees = 0;
        AtomicReference<Double> outputAngle = new AtomicReference<>((double) 0);

        int max = 0;
        double currenAngle = 0;

        for (Tree tree : trees) {
            numberOfTrees = 0;
            final double initialAngle = getTreeAngle(tree);
            final double finalAngle = initialAngle + alpha > 360 ? initialAngle + alpha - 360 : initialAngle + alpha;

            for (Tree tree2 : trees) {
                currenAngle = getTreeAngle(tree2);
                if (currenAngle >= initialAngle && currenAngle <= finalAngle) {
                    numberOfTrees++;
                }
            }
            if (numberOfTrees > max) {
                max = numberOfTrees;
                outputAngle.set(initialAngle);
            }
        }
        return outputAngle.get();
    }
}