# Software Engineering Architecture Course | KPI, TEF, 3 course

## Вариант 7

Базовый класс «комплексное число» и производный включающий комплексное число в стандартной и экспоненциальной форме и функцию вычисления экспоненциальной формы числа.

### Лабораторна робота №1

1. Создать базовый и производный классы. Определить конструкторы, методы доступа, виртуальные методы (хотя бы toString()). Показать использование конструкторов этого же и базового класса. Можно определить некоторые константы или enum.

2. Разработать аннотацию, отметить, ей метод(ы) в классе, С помощью рефлексии обойти методы класса и вызвать отмеченные аннотацией методы с помощью invoke().

3. С помощью рефлексии вывести имя класса, а также согласно варианта:
- Список методов с аннотациями и типами параметров
- Название пакета и короткое (простое) имя класса

4*. Сделать для класса прокси (для Immutability), который пропускает обращение к getter' ам , а на сеттеры — бросает эксепшены.


### Лабораторна робота №2

Обеспечить покрытие юнит тестами лабораторной работы №1 не менее, чем 80 процентов, как позитивного, так и негативного сценария.
