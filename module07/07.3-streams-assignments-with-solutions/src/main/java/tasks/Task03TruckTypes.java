package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Есть грузовик Truck, у которого задана максимальная грузоподьемность.
 * <p>
 * Грузовики делятся на 3 типа в зависимости от грузоподьемности:
 * - Pickup        - до 2 тонн
 * - SmallBoxTruck - до 12 тонн
 * - SemiTrailer   - до 20 тонн
 */
public class Task03TruckTypes {
    /**
     * Функция, которая по грузовику вернет его тип.
     * <p>
     * Пример:
     * Truck(1_000) -> Pickup
     *
     * @param t
     * @return
     */
    public static TruckType getTypeByWeight(Truck t) {  //не могу понять, здесь вроде int weight должно быть

        if (TruckType.SemiTrailer.canHandleWeight(t))


    }

    /**
     * Сгруппировать все грузовики по их грузоподьемности.
     * <p>
     * Пример:
     * List(Truck(5_000), Truck(5_100), Truck(20_000))
     * ->
     * Map [
     * SmallBoxTruck => List(Truck(5_000), Truck(5_100))
     * SemiTrailer   => List(Truck(20_000))
     * ]
     * <p>
     * Понадобиться:
     * - Stream::collect
     * - Collectors.groupingBy
     *
     * @param trucks
     * @return
     */
    public static Map<TruckType, List<Truck>> groupTrucksByType(List<Truck> trucks) {
        throw new PleaseImplementMeException();
    }

    /**
     * Посчитать кол-во грузовиков в каждой группе.
     * <p>
     * Пример:
     * List(Truck(5_000), Truck(5_100), Truck(20_000))
     * ->
     * Map [
     * SmallBoxTruck => 2
     * SemiTrailer   => 1
     * ]
     * <p>
     * Понадобиться:
     * - Stream::collect
     * - Collectors.groupingBy
     * - Collectors.counting
     *
     * @param trucks
     * @return
     */
    public static Map<TruckType, Long> countTrucksByType(List<Truck> trucks) {
        throw new PleaseImplementMeException();
    }

    /**
     * Грузовик и его грузоподьемность.
     */
    static class Truck {
        int maxWeightKg;

        Truck(int maxWeightKg) {
            this.maxWeightKg = maxWeightKg;
        }
    }

    /**
     * Тип грузовика по грузоподьемности.
     */
    enum TruckType {
        Pickup(2000),
        SmallBoxTruck(12000),
        SemiTrailer(20000);

        private int upperBoundWeightKg;

        TruckType(int upperBoundWeightKg) {
            this.upperBoundWeightKg = upperBoundWeightKg;
        }

        public boolean canHandleWeight(int weight) {
            return weight <= this.upperBoundWeightKg;
        }
    }

}
