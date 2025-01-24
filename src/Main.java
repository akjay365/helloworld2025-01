public class Main {
    public static void main(String[] args) {
        //newKod
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);





        //level1
        System.out.println("Задача 1-3");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);


        //ОперацииДеленияИУмножения
        System.out.println("Задачи 4-5");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2 ;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        //Задание5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);


        //ИспользованиеНесколькихПеременных

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " + capacityLeft + "кг вещей.");


        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight +" кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов "+ productsWeight);

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось "+ leftWeight + " кг!");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");


        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar);
        System.out.println("hello Innuglik");

        //Задача 6

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общая масса двух бойцов равна " +totalWeight+ " кг!");
        var differenceWeight = boxer2 % boxer1;
        System.out.println("Разница между массами бойцов составляет " +differenceWeight+ " кг!");

        //Задача 7

        var workingHours = 640;
        var workingDay = 8;
        var numberOfEmployees = workingHours / workingDay;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек!");
        numberOfEmployees = numberOfEmployees + 94;
        workingHours = numberOfEmployees * workingDay;
        System.out.println("Если в компании работает " +numberOfEmployees+ " человека, то всего " +workingHours+ " часа работы может быть поделено между сотрудниками");










    }
}