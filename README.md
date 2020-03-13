# JavaPractice
Java studying


## Задание 1
 
Необходимо реализовать коллекцию целых чисел, которая позволяет выполнять операции:
- добавления
- удаления
- поиска элемента по значению
- поиска элемента по индексу
- поиска максимального элемента
- поиска минимального элемента
- поиска среднего арифметического всех элементов
При этом:
при добавлении нового элемента все элементы увеличивают своё значение на добавляемый элемент
при удалении - уменьшают своё значение на удаляемый элемент
- Недопустим ввод в коллекцию null, символов и других значений, кроме целых чисел.


Результатом работы должен быть отдельный репозиторий github/bitbucket с README файлом, который описывает задание,
сам класс и содержит инструкции по запуску приложения.


## Задание 2

Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива, значения которых в сумме дают число переданное в массив.

Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
Один и тот же элемент не может быть использован дважды.

array = [3, 8, 15, 17], Number = 23
result = [1,2]

Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23


## Задание 3

Дан массив целых чисел.
Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты

Пример:
Array: [4,5,6,6,8]
Result: true
Число 6 повторяется 2 раза

Array: [4,5,6,7,8]
Result: false
Дубликатов нет


##   Task 1 
consists of two Classes **MyCollection** and **Task_1**.

The main class Task_1 implements creation of collection (ArrayList) and all manipulations with it as:
+ 1 - adding items to the collection;
+ 2 - removing items from the collection;
- 3 - finding items by value;
- 4 - finding items by index;
+ 5 - search for the maximum element;
+ 6 - search for the minimum element;
- 7 - calculating the average of a collection of numbers.

When adding / removing an item, an increase or decrease, respectively, 
of all elements of the collection by the specified value is performed.

Class MyCollection consists of methods and overrided methods used in the main class Task_1.
